package integradora;

public interface Moneda {
	String getSimbolo();
	
	double getFactorConversionApesosCL();
	double getFactorConversionDepesosCL();
	
	double convertirApesosCL(double monto);
	double convertirDepesosCL(double monto);
}
