package ejercicios_bucles_y_semanal;

import java.util.Scanner;

public class ejercicio4_if_else {

	public static void main(String[] args) {
//Si un alumno tiene un promedio mayor a 85 y menos de 3 faltas, imprimir "Excelente rendimiento", de lo contrario, "Rendimiento regular".

		System.out.println("Ingrese su promedio");
		Scanner lector;
		lector = new Scanner(System.in);
		int promedio = lector.nextInt();
		System.out.println("Ingrese su numero de faltas");
		int faltas = lector.nextInt();
		lector.close();

		if (promedio > 85 || faltas < 3) {
			System.out.println("Excelente rendimiento");
		} else {
			System.out.println("Rendimiento regular");
		}

	}

}
