package weather.observers;

import weather.WeatherData;
import weather.interfaces.DisplayElements;
import weather.interfaces.Observer;
import weather.interfaces.Subject;


public class CurrentConditionsDisplay implements Observer, DisplayElements {

    private float temperature;
    private float humidity;
    Subject wd;

    public CurrentConditionsDisplay(WeatherData wd) {
        this.wd = wd;
        this.wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
