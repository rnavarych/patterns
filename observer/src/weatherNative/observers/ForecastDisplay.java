package weatherNative.observers;

import weather.interfaces.DisplayElements;
import weatherNative.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElements {

    Observable observable;
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(Observable ob) {
        this.observable = ob;
        ob.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
       if (o instanceof WeatherData) {
           WeatherData wd = (WeatherData) o;
           this.lastPressure = currentPressure;
           this.currentPressure = wd.getPressure();
           display();
       }
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + (currentPressure - lastPressure));
    }
}
