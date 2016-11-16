package com.stats.aggregator.controllers;

import com.stats.aggregator.services.contracts.ServiceResult;
import com.stats.aggregator.services.contracts.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/account/")
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
    @PostMapping(value = "login", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity login(@RequestBody Map<String, String> loginData){
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
    @PostMapping(value = "logout", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity logout(@RequestBody(required = true) String authKey){
        ServiceResult result = accountService.logout(authKey);
        return ResponseEntity.status(result.getStatus()).body(null);
    }
}
