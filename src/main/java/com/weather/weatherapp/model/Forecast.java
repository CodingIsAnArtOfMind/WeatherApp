package com.weather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private List<ForecastItem> items;
    private String forecastDate;
    private String nextUpdate;
    private String source;
    private String point;

    // Getters and setters
    @JsonProperty("items")
    public List<ForecastItem> getItems() {
        return items;
    }

    public void setItems(List<ForecastItem> items) {
        this.items = items;
    }

    @JsonProperty("forecastDate")
    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    @JsonProperty("nextUpdate")
    public String getNextUpdate() {
        return nextUpdate;
    }

    public void setNextUpdate(String nextUpdate) {
        this.nextUpdate = nextUpdate;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("point")
    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}
