package ejerciciodefunciones;

import java.util.Scanner;

public class ejer7maximocomundivisor {

	public static void main(String[] args) {
		// Desarrolla una función en Java para calcular el MCD (Máximo Común Divisor) de
		// dos números.

		System.out.println("Ingrese dos números");
		Scanner lector;
		lector = new Scanner(System.in);
		int numeros = lector.nextInt();
		system.pritnln(calculo(numeros));

	}

	public static int calculo (int num1, int num2) {
		for(int i; i<=num1; i++) {
			while(num1%i==0;) {
				int factor = i;
			}
		
		
			for(int j; j<num2; j++) {
				while(num2%j==0;) {
					int factor2 = j;
				}
			}
		}
			if(factor == factor2) {
				int mcd = factor;
		}
		return mcd;
	}

}
