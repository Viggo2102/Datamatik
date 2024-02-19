package Øvelse;

public class TemperatureConverter {
    double celsius;
    double fahrenheit;

    public double convertToFahrenheit() {
        return (celsius*9/5) + 32;
    }

    public double convertToCelsius() {
        return (fahrenheit - 32) * 5/9;
    }
}
