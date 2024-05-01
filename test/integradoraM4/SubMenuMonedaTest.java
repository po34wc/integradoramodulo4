package integradoraM4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.SubMenuMoneda;

public class SubMenuMonedaTest {
	SubMenuMoneda subMenuMoneda;
	/*private final String MENSAJE = "\r\n"
			+ "1. Pesos chilenos.\r\n"
			+ "2. US Dólares.\r\n"
			+ "3. Euro.\r\n"
			+ "5. Salir.\r\n"
			+ "Escriba el número de la moneda a usar.";*/
	
	@BeforeEach
	void setUp() throws Exception {
		subMenuMoneda = new SubMenuMoneda();
	}
	
	@Test
	@DisplayName("Prueba mostrar submenu moneda")
	void testMostraSubmenuMoneda() {
		double resultado = subMenuMoneda.mostrar();
		assertTrue(resultado >= 1.0 && resultado <= 5.0);
	}
}
