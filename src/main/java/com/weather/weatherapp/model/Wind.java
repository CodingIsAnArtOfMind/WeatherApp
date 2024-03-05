package com.weather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
class Wind {
    private String unit;
    private String direction;
    private double avg;
    private double min;
    private double max;
    private String text;
    private boolean significationWind;
    private Gusts gusts;

}