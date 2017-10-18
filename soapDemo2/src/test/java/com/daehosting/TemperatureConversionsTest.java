package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {
    @Test
    public void getCelToFar() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("the celsius to far conversion failed",BigDecimal.valueOf(32), celsiusToFahrenheitResult);
    }

    @Test
    public void getFarToCel() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("the far to cel conversion failed",BigDecimal.valueOf(0), celsiusToFahrenheitResult);
    }

    @Test
    public void getWindChillInCel() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.windChillInCelsius(BigDecimal.valueOf(32.0),BigDecimal.valueOf(5.0));
        assertEquals("the celsius windchill is wrong",BigDecimal.valueOf(30.23), celsiusToFahrenheitResult);
    }

    @Test
    public void getWindChillFar() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(32.0),BigDecimal.valueOf(5.0));
        assertEquals("the far windchill is wrong",BigDecimal.valueOf(24.638), celsiusToFahrenheitResult);
    }

}