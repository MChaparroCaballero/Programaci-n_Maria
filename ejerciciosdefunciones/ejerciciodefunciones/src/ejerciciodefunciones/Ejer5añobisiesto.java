package ejerciciodefunciones;

import java.util.Scanner;

public class Ejer5añobisiesto {

	public static void main(String[] args) {
		// Escribe una función en Java para comprobar si un año es bisiesto.

		System.out.println("Ingrese un año");
		Scanner lector;
		lector = new Scanner(System.in);
		int año = lector.nextInt();
		lector.close();

		comprobacion(año);

	}

	public static void comprobacion(int num1) {
		if (num1 % 4 == 0) {
			System.out.println(num1 + " es bisisesto ");
		} else {
			System.out.println(num1 + " no es bisisesto ");
		}
	}

}
