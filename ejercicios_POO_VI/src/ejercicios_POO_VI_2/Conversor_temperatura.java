package ejercicios_POO_VI_2;

public class Conversor_temperatura {

	private final double ajuste;
	private final double factor_conversion;
	private double temperatura;
	
	
	public Conversor_temperatura(double temp) {
		temperatura = temp;
		factor_conversion = 1.8;
		ajuste = 32;
	}
}
