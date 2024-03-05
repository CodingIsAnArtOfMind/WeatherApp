package com.weather.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    
    @GetMapping("/weather")
    public String getWeather(@RequestHeader("X-Client-ID") String clientId,
                             @RequestHeader("X-Client-Secret") String clientSecret) {
        return "Weather data retrieved successfully for clientId: " + clientId + " and clientSecret: " + clientSecret;
    }
}
