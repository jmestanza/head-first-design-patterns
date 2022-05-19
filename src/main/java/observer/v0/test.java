package observer.v0;

import observer.v0.displays.CurrentConditionsDisplay;
import observer.v0.displays.ForecastDisplay;
import observer.v0.displays.HeatIndexDisplay;
import observer.v0.displays.StatisticsDisplay;
import observer.v0.subjects.WeatherData;

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

        weatherData.removeObserver(currentConditionsDisplay);

    }
}
