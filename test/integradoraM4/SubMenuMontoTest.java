package integradoraM4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.SubMenuMonto;

public class SubMenuMontoTest {
	SubMenuMonto subMenuMonto;
	/*private final String MENSAJE = "Indique Monto.\r\n";*/
	
	@BeforeEach
	void setUp() throws Exception {
		subMenuMonto = new SubMenuMonto();
	}
	
	@Test
	@DisplayName("Prueba mostrar submenu monto")
	void testMostraSubmenuMonto() {
		double resultado = subMenuMonto.mostrar();
		assertTrue(resultado >= 0.0);
	}
}
