package com.weather.weatherapp.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {

    @Value("${rapidapi.key.city}")
    private String rapidApiKeyCity;

    @Value("${rapidapi.key.city.hourly}")
    private String rapidApiKeyCityHourly;
    public String getWeatherForecast(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
            .url("https://forecast9.p.rapidapi.com/rapidapi/forecast/"+ city +"/summary/")
            .get()
            .addHeader("X-RapidAPI-Key", rapidApiKeyCity)
            .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
            .build();


        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                throw new IOException("Unexpected response code: " + response.code());
            }
        }
    }

    public String getHourlyWeatherForecast(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + city + "/hourly/")
                .get()
                .addHeader("X-RapidAPI-Key", rapidApiKeyCityHourly)
                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                // Handle unsuccessful response (e.g., log error, throw exception)
                throw new IOException("Unexpected response code: " + response.code());
            }
        }
    }
}
