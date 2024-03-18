package ejerciciodefunciones;

import java.util.Scanner;

public class Ejer6contarnumerodedijitos {

	public static void main(String[] args) {
		// Crea una función en Java para contar el número de dígitos en un entero.

		System.out.println("Ingresa un numero entero");

		Scanner lector;
		lector = new Scanner(System.in);
		int ingreso = lector.nextInt();
		lector.close();
		String caracteres = Integer.toString(ingreso);

		caracterizacion(caracteres);
	}

	public static void caracterizacion(String num1) {
		for (int i = 0; i < num1.length(); i++) {
			char caracter = num1.charAt(i);
			System.out.println(caracter);
		}

	}

}
