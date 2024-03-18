package ejerciciodefunciones;

import java.util.Scanner;

public class ejer4encuentraelmenor {

	public static void main(String[] args) {
		// Implementa una función en Java que encuentre el menor de dos números.

		System.out.println("Ingrese 2 números"); // instanciamos el scanner
		Scanner lector;
		lector = new Scanner(System.in);

		int numero1 = lector.nextInt();
		int numero2 = lector.nextInt();

		lector.close();

		System.out.println(" el numero menor es " + menor(numero1, numero2));
	}

	public static int menor(int num1, int num2) {

		int nmenor = 10000;
		if (num1 < num2) {
			nmenor = num1;
		} else {
			nmenor = num2;
		}
		return nmenor;
	}

}