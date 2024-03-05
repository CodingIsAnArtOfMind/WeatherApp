package com.weather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreType
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
class ForecastItem {
    private String date;
    private String dateWithTimezone;
    private double freshSnow;
    private double snowHeight;
    private Weather weather;
    private Precipitation prec;
    private double sunHours;
    private double rainHours;
    private Temperature temperature;
    private Wind wind;
    private Windchill windchill;
    private SnowLine snowLine;
    private Astronomy astronomy;
}
