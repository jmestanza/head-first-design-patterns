package observer.v0.displays;
import observer.v0.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double t, double h, double p) {
        tempSum += t;
        numReadings++;

        if (t > maxTemp) {
            maxTemp = t;
        }

        if (t < minTemp) {
            minTemp = t;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
