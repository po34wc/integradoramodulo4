package integradora;

/**
 * Interfaz para las operaciones de depositar y retirar en cuenta del cliente
 * recibe el saldo previo a la operación y devuelve el nuevo saldo
 */
public interface OperacionCuenta {
	double procesar(double dblSaldo);
}
