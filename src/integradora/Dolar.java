package integradora;

public class Dolar implements Moneda {
	private double aPesosCL;
	private double dePesosCL;
	
	public Dolar(double aPesosCL, double dePesosCL) {
		this.aPesosCL = aPesosCL;
		this.dePesosCL = dePesosCL;
	}

	@Override
	public String getSimbolo() {
		return "USD$";
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
