package ejerciciosdeestructurasdecontrol;

import java.util.Scanner;

public class EjerciciodeEstructurasdeControlDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Eliga lo que quiere hacer");
		System.out.println("1) Ver saldo");
		System.out.println("2) Depositar dinero");
		System.out.println("3) Retirar dinero");
		System.out.println("4) Salir");

		Scanner lector;
		lector = new Scanner(System.in);
		int numero = lector.nextInt();
		
		do {
			
			System.out.println("Eliga lo que quiere hacer");
			System.out.println("1) Ver saldo");
			System.out.println("2) Depositar dinero");
			System.out.println("3) Retirar dinero");
			System.out.println("4) Salir");
			numero = lector.nextInt();

		} while (numero != 4);

		lector.close();
	}

}
