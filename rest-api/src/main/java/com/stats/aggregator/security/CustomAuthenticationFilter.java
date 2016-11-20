
package com.stats.aggregator.security;

import com.stats.aggregator.common.enums.ErrorMsg;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String xAuth = request.getHeader("x-authorization-key");

        if(xAuth == null){
            response.sendError(HttpServletResponse.SC_FORBIDDEN, ErrorMsg.EMPTY_AUTH_KEY.toString());
            return;
        }

        Authentication auth = new CustomAuthenticationToken(xAuth);
        SecurityContextHolder.getContext().setAuthentication(auth);

        filterChain.doFilter(request, response);
    }
}