package eJEMPLO_ROUND;

import Clases.Utiles;

public class Ejem1 {

	public  double redondear(double numero, int ndecimales) {

		double potencia = Math.pow(10, ndecimales);
		return Math.round(numero * potencia) / potencia;

	}
	
	
	public double truncar(double numero,  int ndecimales) {
		double potencia = Math.pow(10, ndecimales);
		return ((int)(numero*potencia))/potencia;
		

	}

	public static void main(String[] args) {
		Ejem1 j1 = new Ejem1();
		System.out.println(j1.redondear(145.4567878, 4));
		System.out.println(j1.truncar(145.4567878, 4));
		System.out.println(Utiles.redondear(145.4567878, 4));
		System.out.println(Utiles.truncar(145.4567878, 4));
		
		
	}

}
