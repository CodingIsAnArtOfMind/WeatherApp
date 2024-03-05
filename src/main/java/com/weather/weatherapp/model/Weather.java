package com.weather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreType
@Setter
@Getter
public class Weather {
    private int state;
    private String text;
    private String icon;

}
