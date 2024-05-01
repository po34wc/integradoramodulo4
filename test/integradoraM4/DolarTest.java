package integradoraM4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.Dolar;

public class DolarTest {
	Dolar objDolar;

	@BeforeEach
	void setUp() throws Exception {
		objDolar = new Dolar(800, 0.00125);
	}

	@Test
	@DisplayName("Prueba recuperar símbolo del dólar")
	void testSacarSimbolo() {
		String resultado = objDolar.getSimbolo();
		assertEquals("USD$", resultado);
	}

	@Test
	@DisplayName("Prueba recuperar factor conversión de USD$ a CL$")
	void testRecuperaTipoCambioCLP() {
		double resultado = objDolar.getFactorConversionApesosCL();
		assertEquals(800, resultado, 0.1);
	}
	
	@Test
	@DisplayName("Prueba recuperar factor conversión de CL$ a USD$")
	void testRecuperaTipoCambioUSD() {
		double resultado = objDolar.getFactorConversionDepesosCL();
		assertEquals(0.00125, resultado, 0.1);
	}
	
	@Test
	@DisplayName("Prueba convertir de USD$ a CL$")
	void testConvertirUsdAClp() {
		double resultado = objDolar.convertirApesosCL(1);
		assertEquals(800, resultado, 0.1);	
	}
	
	@Test
	@DisplayName("Prueba convertir de CL$ a USD$")
	void testConvertirClpAUsd() {
		double resultado = objDolar.convertirDepesosCL(800);
		assertEquals(1, resultado, 0.1);	
	}
}
