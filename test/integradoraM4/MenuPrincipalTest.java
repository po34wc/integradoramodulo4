package integradoraM4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import integradora.MenuPrincipal;

public class MenuPrincipalTest {
	MenuPrincipal menuPrincipal;
	
	@BeforeEach
	void setUp() throws Exception {
		menuPrincipal = new MenuPrincipal();
	}

	@Test
	@DisplayName("Prueba mostrar submenu monto")
	void testMostraMenuPrincipal() {
		double resultado = menuPrincipal.mostrar();
		assertTrue(resultado >= 1.0 && resultado <= 5.0);
	}
}
