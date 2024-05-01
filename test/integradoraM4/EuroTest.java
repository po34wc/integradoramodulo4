package integradoraM4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.Euro;

public class EuroTest {
	Euro objEuro;

	@BeforeEach
	void setUp() throws Exception {
		objEuro = new Euro(1019, 0.000981354);
	}

	@Test
	@DisplayName("Prueba recuperar símbolo del Euro")
	void testSacarSimbolo() {
		String resultado = objEuro.getSimbolo();
		assertEquals("€", resultado);
	}

	@Test
	@DisplayName("Prueba recuperar factor conversión de € a CL$")
	void testRecuperaTipoCambioCLP() {
		double resultado = objEuro.getFactorConversionApesosCL();
		assertEquals(1019, resultado, 0.1);
	}
	
	@Test
	@DisplayName("Prueba recuperar factor conversión de CL$ a €")
	void testRecuperaTipoCambioEuro() {
		double resultado = objEuro.getFactorConversionDepesosCL();
		assertEquals(0.000981354, resultado, 0.1);
	}
	
	@Test
	@DisplayName("Prueba convertir de € a CL$")
	void testConvertirEuroAClp() {
		double resultado = objEuro.convertirApesosCL(1);
		assertEquals(1019, resultado, 0.1);	
	}
	
	@Test
	@DisplayName("Prueba convertir de CL$ a €")
	void testConvertirClpAEuro() {
		double resultado = objEuro.convertirDepesosCL(1019);
		assertEquals(1, resultado, 0.1);	
	}
}
