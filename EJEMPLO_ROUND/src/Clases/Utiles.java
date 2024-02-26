package Clases;

public class Utiles {
	public static double redondear(double numero, int ndecimales) {//edfe//

		double potencia = Math.pow(10, ndecimales);
		return Math.round(numero * potencia) / potencia;

	}
	
	
	public static double truncar(double numero,  int ndecimales) {
		double potencia = Math.pow(10, ndecimales);
		return ((int)(numero*potencia))/potencia;
		

	}
}
