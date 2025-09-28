package br.inatel.cdg.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {

    // Tolerância para comparação de double. Essencial para evitar falhas por precisão.
    // Usamos 0.01 pois a precisão é dada na linha 11 do seu teste original.
    private static final double DELTA = 0.01; 
    
    private final Conversor conversor = new Conversor();

    // =========================================================================
    // CASOS DE TESTE: CELSIUS PARA FAHRENHEIT (10 testes)
    // =========================================================================

    // Testes Limites
    @Test // 1/20: Ponto de Congelamento
    public void testC0_Congelamento() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), DELTA);
    }

    @Test // 2/20: Ponto de Ebulição
    public void testC100_Ebulicao() {
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100), DELTA);
    }
    
    // Testes Padrão
    @Test // 3/20: Temperatura ambiente agradável
    public void testC25_Padrao() {
        assertEquals(77.0, conversor.celsiusParaFahrenheit(25), DELTA);
    }
    
    @Test // 4/20: Temperatura de febre
    public void testC38_Febre() {
        assertEquals(100.4, conversor.celsiusParaFahrenheit(38), DELTA);
    }

    @Test // 5/20: Ponto de equivalência (-40°C = -40°F)
    public void testC_40_Equivalencia() {
        assertEquals(-40.0, conversor.celsiusParaFahrenheit(-40), DELTA);
    }

    // Testes Negativos
    @Test // 6/20: Abaixo de zero
    public void testC_10_Negativo() {
        assertEquals(14.0, conversor.celsiusParaFahrenheit(-10), DELTA);
    }

    // Testes com casas decimais (Precisão)
    @Test // 7/20: Valor com decimal
    public void testC15_5_Decimal() {
        assertEquals(59.9, conversor.celsiusParaFahrenheit(15.5), DELTA);
    }
    
    // Testes Extremos
    @Test // 8/20: Valor muito alto
    public void testC1000_ExtremoAlto() {
        assertEquals(1832.0, conversor.celsiusParaFahrenheit(1000), DELTA);
    }

    @Test 
    public void testC_500_ExtremoBaixo() {
    // O valor correto é -868.0, não -870.0
        assertEquals(-868.0, conversor.celsiusParaFahrenheit(-500), DELTA); 
    }

    @Test // 10/20: Teste com zero (garante que 0 não falhe)
    public void testC0_Zero() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), DELTA);
    }

    // =========================================================================
    // CASOS DE TESTE: FAHRENHEIT PARA CELSIUS (10 testes)
    // =========================================================================
    
    // Testes Limites
    @Test // 11/20: Ponto de Congelamento
    public void testF32_Congelamento() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), DELTA);
    }

    @Test // 12/20: Ponto de Ebulição
    public void testF212_Ebulicao() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212), DELTA);
    }

    // Testes Padrão
    @Test // 13/20: Temperatura padrão
    public void testF68_Padrao() {
        assertEquals(20.0, conversor.fahrenheitParaCelsius(68), DELTA);
    }

    @Test // 14/20: Temperatura de ambiente agradável
    public void testF77_Ambiente() {
        assertEquals(25.0, conversor.fahrenheitParaCelsius(77), DELTA);
    }

    @Test // 15/20: Ponto de equivalência (-40°F = -40°C)
    public void testF_40_Equivalencia() {
        assertEquals(-40.0, conversor.fahrenheitParaCelsius(-40), DELTA);
    }

    // Testes Negativos
    @Test // 16/20: Temperatura abaixo de zero (F)
    public void testF_10_Negativo() {
        assertEquals(-23.33, conversor.fahrenheitParaCelsius(-10), DELTA);
    }
    
    // Testes de Precisão (Dízimas)
    @Test // 17/20: Dízima periódica (1/3)
    public void testF50_Dizima() {
        assertEquals(10.0, conversor.fahrenheitParaCelsius(50), DELTA);
    }

    // Testes Extremos
    @Test // 18/20: Valor muito alto
    public void testF1000_ExtremoAlto() {
        assertEquals(537.78, conversor.fahrenheitParaCelsius(1000), DELTA);
    }

    @Test // 19/20: Valor muito baixo
    public void testF_500_ExtremoBaixo() {
        assertEquals(-295.56, conversor.fahrenheitParaCelsius(-500), DELTA);
    }

    @Test // 20/20: Teste com zero (Fahrenheit)
    public void testF0_Zero() {
        assertEquals(-17.78, conversor.fahrenheitParaCelsius(0), DELTA);
    }
}