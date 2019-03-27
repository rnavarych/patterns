package weatherNative.observers;

import weatherNative.WeatherData;
import weatherNative.interfaces.DisplayElements;
import weatherNative.interfaces.Subject;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElements {

    private Observable observable;
    private float temperature;
    private float humidity;
    Subject wd;

    public CurrentConditionsDisplay(Observable ob) {
        this.observable = ob;
        ob.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}
