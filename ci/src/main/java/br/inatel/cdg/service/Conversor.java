package br.inatel.cdg.service;

public class Conversor {

    // Celsius -> Fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit -> Celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
