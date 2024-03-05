package com.weather.weatherapp.controller;

import com.weather.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    
    @GetMapping("/testHeader")
    public String getWeather(@RequestHeader("X-Client-ID") String clientId,
                             @RequestHeader("X-Client-Secret") String clientSecret) {
        return "Weather data retrieved successfully for clientId: " + clientId + " and clientSecret: " + clientSecret;
    }
    @GetMapping("/forecast/{city}")
    public ResponseEntity<String> getWeatherForecast(@PathVariable String city) throws IOException {
        return new ResponseEntity<>(weatherService.getWeatherForecast(city), HttpStatus.OK);
    }

    @GetMapping("/hourly/{city}")
    public ResponseEntity<String> getHourlyWeatherForecast(@PathVariable String city) throws IOException {

        return new ResponseEntity<>(weatherService.getHourlyWeatherForecast(city), HttpStatus.OK);
    }
}
