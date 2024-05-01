/**
 * 
 */
package integradora;

import java.util.Scanner;

/**
 * Submenu para solicitar el monto del depósito o retiro
 */
public class SubMenuMonto implements Menu {
	private final String MENSAJE = "Indique Monto.\r\n";

	@Override
	public double mostrar() {
		System.out.println(MENSAJE);
		Scanner input = new Scanner(System.in);
		double dblValor;
		dblValor = input.nextDouble();
		return dblValor;
	}
}
