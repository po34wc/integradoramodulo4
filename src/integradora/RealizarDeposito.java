package integradora;

/**
 * Clase que implementa el proceso de realizar depósitos en la cuenta del cliente
 * recibe el saldo previo a la operación y devuelve el nuevo saldo
 */
public class RealizarDeposito implements OperacionCuenta {

	@Override
	public double procesar(double dblSaldo) {
		SubMenuMonto subMenuMonto = new SubMenuMonto();
		SubMenuMoneda subMenuMoneda = new SubMenuMoneda();
		
		double dblMonto;
		double dblMoneda = 0.0;
		boolean bolExito = false;
		
		dblMonto = subMenuMonto.mostrar();
		
		if (dblMonto > 0) {
			dblMoneda = subMenuMoneda.mostrar();
			int intMonedaElegida = (int) dblMoneda;
			if (intMonedaElegida == 5 || dblMonto <= 0.0) {
				bolExito = false;
			} else {
				bolExito = true;
				switch(intMonedaElegida) {
				case 1:
					// no se hace nada porque el monto viene en CL$
					break;
				case 2:
					Dolar objDolar = new Dolar(800, 0.00125);
					dblMonto = objDolar.convertirApesosCL(dblMonto);
					break;
				case 3:
					Euro objEuro = new Euro(1019, 0.000981354);
					dblMonto = objEuro.convertirApesosCL(dblMonto);
					break;					
				}
			}
		}
		
		String strMensaje = "";
		if (bolExito) {
			dblSaldo += dblMonto;
			strMensaje = "Depósito exitoso, nuevo saldo (CL$): " + dblSaldo;
		} else {
			strMensaje = "No se pudo realizar el depósito";
		}
		System.out.println(strMensaje);
		
		return dblSaldo;
	}
}
