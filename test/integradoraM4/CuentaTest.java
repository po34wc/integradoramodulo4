package integradoraM4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.Cuenta;

public class CuentaTest {
	Cuenta cuenta;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(15000);
	}
	
	@Test
	@DisplayName("Prueba recuperar el saldo de la cuenta")
	void testRecuperaSaldo() {
		double resultado = cuenta.getSaldo();
		assertEquals(15000, resultado);
	}
	
	@Test
	@DisplayName("Prueba muestra el saldo de la cuenta")
	void testMuestraSaldo() {
		double resultado = cuenta.mostrarSaldo();
		assertEquals(15000, resultado);
	}
}
