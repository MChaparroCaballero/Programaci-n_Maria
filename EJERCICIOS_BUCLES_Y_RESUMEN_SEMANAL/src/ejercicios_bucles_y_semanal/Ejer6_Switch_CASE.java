package ejercicios_bucles_y_semanal;

import java.util.Scanner;

public class Ejer6_Switch_CASE {

	public static void main(String[] args) {
//Dada una calificación numérica (1-5), imprimir la calificación en palabras (Insuficiente, Suficiente, Bien, Notable, Sobresaliente). 

		System.out.println("Ingrese una calificación");
		Scanner lector;
		lector = new Scanner(System.in);
		int calificacion = lector.nextInt();
		lector.close();

		switch (calificacion) {

		case 1:
			System.out.println("insuficiente");
			break;
		case 2:
			System.out.println("suficiente");
			break;
		case 3:
			System.out.println("bien");
			break;
		case 4:
			System.out.println("notable");
			break;
		case 5:
			System.out.println("sobresaliente");
			break;
		default:
			System.out.println("De uno al cinco idiota");
		}
	}

}
