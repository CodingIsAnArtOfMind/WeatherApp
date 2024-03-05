# WeatherApp
# Spring Boot Weather API Integration

This project demonstrates how to integrate a Weather API from Rapid API into a Spring Boot application.

## Authentication Method

Header-based authentication is used with random client ID and random client secret.

Password for Client Id and Client Secret which will needed while running the application:-
key:X-Client-ID value:clientId
key:X-Client-Secret value:secretId

##Note: Pass above value in header for Header Based Authorization

## APIs Exposed

### 1. Get Weather Forecast Summary by City

**Endpoint:** `/weather-summary`

**Method:** `GET`

### 1. Get hourly Weather forecast details of Any city using API

(RapidApiGetHourlyForecastByLocationName)
API Document: https://rapidapi.com/wettercom-wettercom-default/api/forecast9
(RapidApiGetForecastSummaryByLocationName &
RapidApiGetHourlyForecastByLocationName)


## Note
I am able to connect to the backend but due to not having a Subscription its giving (403) 
Tested same through postman got below error
"message": "You are not subscribed to this API."

