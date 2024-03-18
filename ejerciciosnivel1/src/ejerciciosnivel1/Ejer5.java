package ejerciciosnivel1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
		// pedirá por teclado (recuerda pasar de String a double con
		// Double.parseDouble). Usa la constante PI y el método pow de Math. ESTE ES
		// OPTATIVO, NO OBLIGATORIO, YA QUE UTILIZA CONSTANTES Y YO NO LAS HE EXPLICADO.
		// SÁLTALO SIN PROBLEMAS.

		System.out.println("Introduzca el radio para calcular un circulo");
		Scanner lector;
		lector = new Scanner(System.in);
		double radio = lector.nextDouble();
		lector.close();
		double areaCirculo = Math.pow(Math.PI, radio);
		System.out.println(areaCirculo);

	}

}
