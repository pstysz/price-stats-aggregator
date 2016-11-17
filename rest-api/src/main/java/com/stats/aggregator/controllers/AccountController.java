package com.stats.aggregator.controllers;

import com.stats.aggregator.services.contracts.IAccountService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Handle users login and logoff
 */
@RestController
@RequestMapping("/api/account/")
@Api(description = "Handle users login and logoff")
public class AccountController {

    private final IAccountService accountService;

    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * Login user to application
     * @param loginData json with login + password
     * @return authorization key for device
     */
    @ApiOperation(value = "Login user to application", response = String.class,
            notes = "returns authorization key for device",
            produces = "application/json", consumes = "application/json, text/json")
    @PostMapping(value = "login", produces = { MediaType.APPLICATION_JSON_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity login(@RequestBody @ApiParam(value = "json with login + password", required = true) Map<String, String> loginData){
        if(loginData != null) {
            String userName = loginData.get("userName");
            String password = loginData.get("password");

            if(userName != null && password != null) {
                ServiceResult<String> result = accountService.login(userName, password);
                return ResponseEntity.status(result.getStatus()).body(result);
            }
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    /**
     * Logout user from application
     * @param authKey json with device authorization key
     * @return Http status
     */
    @ApiOperation(value = "Logout user from application", consumes = "application/json, text/json")
    @PostMapping(value = "logout", produces = { MediaType.APPLICATION_JSON_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity logout(@RequestBody(required = false) @ApiParam(value = "device authorization key (if not provided, current user will be logged off)", required = false) String authKey){
        String authKeyToLogoff;

        if(authKey != null){
            authKeyToLogoff = authKey;
        }
        else {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            authKeyToLogoff = (String) auth.getCredentials();
        }

        ServiceResult result = accountService.logout(authKeyToLogoff);
        return ResponseEntity.status(result.getStatus()).body(null);
    }
}
