/**
 * 
 */
package integradora;

import java.util.Scanner;

/**
 * Submenu para que el usuario indique la monedaa en que está depositando o retirando
 */
public class SubMenuMoneda implements Menu {
	private final String MENSAJE = "\r\n"
			+ "1. Pesos chilenos.\r\n"
			+ "2. US Dólares.\r\n"
			+ "3. Euro.\r\n"
			+ "5. Salir.\r\n"
			+ "Escriba el número de la moneda a usar.";

	@Override
	public double mostrar() {
		System.out.println(MENSAJE);
		Scanner input = new Scanner(System.in);
		double dblValor;
		dblValor = input.nextDouble();
		return dblValor;
	}
}
