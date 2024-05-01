/**
 * 
 */
package integradora;

import java.util.Scanner;

/**
 * Controla el menú principal
 */
public class MenuPrincipal implements Menu {
	private final String MENSAJE = "\r\n"
			+ "1. Ver saldo disponible.\r\n"
			+ "2. Realizar depósito.\r\n"
			+ "3. Retirar fondos.\r\n"
			+ "5. Salir.\r\n"
			+ "Escriba el número de la opción deseada.";
	
	@Override
	public double mostrar() {
		System.out.println(MENSAJE);
		Scanner input = new Scanner(System.in);
		double dblValor;
		dblValor = input.nextDouble();
		return dblValor;
	}
}
