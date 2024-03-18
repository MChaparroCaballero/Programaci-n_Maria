package ejerciciodefunciones;

import java.util.Scanner;

public class Ejer3_verificacion_negativa {

	public static void main(String[] args) {
		/* Desarrolla una función en Java para verificar si un número es negativo. */

		System.out.println("Ingrese un numero entero");
		Scanner lector;
		lector = new Scanner(System.in);
		int valor = lector.nextInt();
		lector.close();

		verificacion(valor);

	}

	public static void verificacion(int num1) {
		if (num1 < 0) {
			System.out.println(num1 + " es negativo ");
		} else {
			System.out.println(num1 + " es positivo ");
		}
	}

}
