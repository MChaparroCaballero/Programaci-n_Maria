package ejercicios_bucles_y_semanal;

import java.util.Scanner;

public class Ejer7_SwitchCase {

	public static void main(String[] args) {
//Según el mes del año (1-12), imprimir la estación del año correspondiente (Invierno, Primavera, Verano, Otoño). 

		System.out.println("Ingrese un més");
		Scanner lector;
		lector = new Scanner(System.in);
		int mes = lector.nextInt();
		lector.close();

		switch (mes) {
		case 1:
			System.out.println("La estación del año correspondiente a ese més es invierno");
			break;

		case 2:
			System.out.println("La estación del año correspondiente a ese més es invierno");
			break;

		case 3:
			System.out.println("La estación del año correspondiente a ese més es invierno");
			break;

		case 4:
			System.out.println("La estación del año correspondiente a ese més es primavera");
			break;

		case 5:
			System.out.println("La estación del año correspondiente a ese més es primavera");
			break;

		case 6:
			System.out.println("La estación del año correspondiente a ese més es verano");
			break;

		case 7:
			System.out.println("La estación del año correspondiente a ese més es verano");
			break;

		case 8:
			System.out.println("La estación del año correspondiente a ese més es verano");
			break;

		case 9:
			System.out.println("La estación del año correspondiente a ese més es otoño");
			break;

		case 10:
			System.out.println("La estación del año correspondiente a ese més es otoño");
			break;

		case 11:
			System.out.println("La estación del año correspondiente a ese més es otoño");
			break;

		case 12:
			System.out.println("La estación del año correspondiente a ese més es invierno");
			break;

		default:
			System.out.println("ERROR. INGRESE NUMERO DEL MÉS");
		}
	}

}
