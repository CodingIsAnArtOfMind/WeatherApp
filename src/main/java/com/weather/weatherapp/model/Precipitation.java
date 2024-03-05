package com.weather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
class Precipitation {
    private double sum;
    private double sumAsRain;
    private int probability;
    private int clazz;

}
