package integradora;

/**
 * Clase CUENTA para mantener la cuenta (saldo, retiros y depósitoss)
 * la cuenta está en pesos chilenos, aunque se aceptan otras monedasnque se convierten
 * antes de afectar el saldo de la cuenta
 */
public class Cuenta {
	private double dblSaldo;

	public void realizarDeposito() {
		RealizarDeposito realizarDeposito = new RealizarDeposito();
		dblSaldo = realizarDeposito.procesar(dblSaldo);
	}
	
	public void realizarRetiro() {
		RealizarRetiro realizarRetiro = new RealizarRetiro();
		dblSaldo = realizarRetiro.procesar(dblSaldo);
	}
	
	public double mostrarSaldo() {
		return this.dblSaldo;
	}

	/**
	 * @param saldo mantiene el saldo de la cuenta
	 */
	public Cuenta(double dblSaldo) {
		this.dblSaldo = dblSaldo;
	}

	/**
	 * @return entrega el saldo de la cuenta
	 */
	public double getSaldo() {
		return dblSaldo;
	}

	/**
	 * @param actualiza el saldo de la cuenta
	 */
	public void setSaldo(double dblSaldo) {
		this.dblSaldo = dblSaldo;
	}
}
