package com.weather.weatherapp.config;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class HeaderBasedAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String clientId = request.getHeader("X-Client-ID");
        String clientSecret = request.getHeader("X-Client-Secret");

        if (isValidCredentials(clientId, clientSecret)) {
            filterChain.doFilter(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid client credentials");
        }
    }
    private boolean isValidCredentials(String clientId, String clientSecret) {
        // Hardcoded validation logic - Replace these strings with your actual client ID and client secret
        String validClientId = "clientId";
        String validClientSecret = "clientSecret";


        return clientId.equals(validClientId) && clientSecret.equals(validClientSecret);
    }
}
