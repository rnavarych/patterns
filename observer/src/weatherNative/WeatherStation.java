package weatherNative;

import weatherNative.observers.CurrentConditionsDisplay;
import weatherNative.observers.ForecastDisplay;
//import weatherNative.observers.HeatIndexDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        new CurrentConditionsDisplay(wd);
        new ForecastDisplay(wd);
//        new HeatIndexDisplay(wd);

        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 29.2f);
    }
}
