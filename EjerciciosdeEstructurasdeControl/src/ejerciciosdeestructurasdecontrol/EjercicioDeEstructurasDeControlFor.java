package ejerciciosdeestructurasdecontrol;

import java.util.Scanner;

public class EjercicioDeEstructurasDeControlFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero para ver su tabla de multiplicar");
		Scanner lector;
		lector = new Scanner(System.in);
		int numero = lector.nextInt();
		lector.close();
		int i = 1;

		for (i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

}

