package ejerciciosnivel1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Lee un número por teclado y muestra por consola, el carácter al que pertenece
		// en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

		System.out.println("Ingrese un numero");

		Scanner lector;
		lector = new Scanner(System.in);
		int num = lector.nextInt();
		lector.close();
		String cosa = " ";

		System.out.println(cosa.charAt(num));

	}

}
