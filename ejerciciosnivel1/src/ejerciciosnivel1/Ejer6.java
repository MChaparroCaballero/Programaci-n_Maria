package ejerciciosnivel1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no
		// lo es, también debemos indicarlo.

		System.out.println("Introduzca un número");
		Scanner lector;
		lector = new Scanner(System.in);
		int numero = lector.nextInt();
		lector.close();

		if (numero % 2 == 0) {
			System.out.println(numero + " Es un número par");
		} else {
			System.out.println(numero + " Es un número impar");
		}

	}

}
