/**
 * 
 */
package integradora;

/**
 * Administra los datos de cambio del Euro a Pesos Chilenos y viceversa
 */
public class Euro implements Moneda {
	private double aPesosCL;
	private double dePesosCL;
	
	public Euro(double aPesosCL, double dePesosCL) {
		this.aPesosCL = aPesosCL;
		this.dePesosCL = dePesosCL;
	}

	@Override
	public String getSimbolo() {
		return "€";
	}

	@Override
	public double getFactorConversionApesosCL() {
		return aPesosCL;
	}

	@Override
	public double getFactorConversionDepesosCL() {
		return dePesosCL;
	}
	
	@Override
	public double convertirApesosCL(double monto) {
		return getFactorConversionApesosCL() * monto;
	}

	@Override
	public double convertirDepesosCL(double monto) {
		return getFactorConversionDepesosCL() * monto;
	}
}
