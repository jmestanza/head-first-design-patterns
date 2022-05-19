package observer.v1.subjects;

import lombok.Data;
import observer.v1.displays.Observer;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject {
    List<Observer> observers;
    double temperature;
    double humidity;
    double pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs -> obs.update());
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
