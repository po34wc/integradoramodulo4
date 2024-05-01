package integradora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int userChoice;
		double dblUserChoice;
		Boolean bolControl = true;
		Scanner input = new Scanner(System.in);
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		
		
		Cuenta cuenta = new Cuenta(0.0);
		
		while (bolControl) {
			dblUserChoice = menuPrincipal.mostrar();
			userChoice = (int) dblUserChoice;
			
			switch (userChoice) {
			case 1:
				System.out.println("Saldo disponible (CL$): " + cuenta.mostrarSaldo());
				break;
			case 2:
				cuenta.realizarDeposito();
				break;
			case 3:
				cuenta.realizarRetiro();
				break;
			case 4:
				break;
			case 5:
				System.out.println("FIN");
				bolControl = false;
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Debe presionar un número entre 1 y 5");
				break;
			}
		}
	}
}
