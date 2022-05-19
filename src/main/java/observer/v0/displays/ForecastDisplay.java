package observer.v0.displays;

import observer.v0.subjects.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private double currentPressure = 29.92f;
    private double lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(double t, double h, double p) {
        lastPressure = currentPressure;
        currentPressure = p;

        display();
    }
}
