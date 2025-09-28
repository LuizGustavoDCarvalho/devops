package br.inatel.cdg.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; ;

public class ConversorTest {

    private final Conversor conversor = new Conversor();

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), 0.01);
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), 0.01);
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212), 0.01);
    }
}


