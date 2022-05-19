package observer.v1;

import observer.v1.displays.CurrentConditionsDisplay;
import observer.v1.displays.ForecastDisplay;
import observer.v1.displays.HeatIndexDisplay;
import observer.v1.displays.StatisticsDisplay;
import observer.v1.subjects.WeatherData;

public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
