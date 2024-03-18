package ejerciciosdeestructurasdecontrol;

import java.util.Scanner;

public class EjercicioWhileControl {

	public static void main(String[] args) {
//Diseña un programa en Java que lea números enteros del usuario hasta que introduzca un número negativo. Después de eso, el programa debe mostrar cuántos números positivos fueron ingresados. 

		// le pedimos al usuario que ingrese un numero y los guardamos
		System.out.println("Ingrese un numero entero");
		Scanner lector;
		lector = new Scanner(System.in);
		int numero = lector.nextInt();

		while (numero >= 0) {
			numero = lector.nextInt();

		}
		lector.close();
		System.out.println(numero);

	}

}
