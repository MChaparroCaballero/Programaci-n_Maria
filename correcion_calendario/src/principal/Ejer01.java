package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejer01 {
	public static Scanner sc = new Scanner(System.in);

	public static String centrar(String cadena, int longitud, String caracter, String posicion) {
		int n;
		String resultado = null;
		switch (posicion.toUpperCase()) {
		case "D":
			resultado = caracter.repeat(longitud - cadena.length()) + cadena;
			break;
		case "I":
			resultado = cadena + caracter.repeat(longitud - cadena.length());
			break;
		default:
			n = (longitud - cadena.length()) / 2;
			resultado = caracter.repeat(n) + cadena + caracter.repeat(longitud - cadena.length() - n);

			break;
		}

		return resultado;

	}

	public static void calendario(LocalDate fe) {
		int mes = fe.getMonth().getValue();
		String cadena;

		int n = fe.getDayOfWeek().getValue(); // 1 Lunes....7 DOMINGO

		cadena = fe.getMonth().toString() + " " + String.valueOf(fe.getYear());//concatenamos para cabecera//
		System.out.println(centrar(cadena, 21, " ", "C"));
		System.out.println(" L  M  X  J  V  S  D");
		cadena = " ".repeat((n - 1) * 3);

		while (fe.getMonth().getValue() == mes) {
			cadena += String.format("%3d", fe.getDayOfMonth());
			if (n == 7) {
				System.out.println(cadena);
				cadena = "";
			}
			fe = fe.plusDays(1);
			n = fe.getDayOfWeek().getValue();
		}
		System.out.println(cadena);
	}

	public static int menu(String opciones[]) {
		int op;
		do {
			for (String item : opciones)
				System.out.println(item);
			System.out.println("\n\tIndique la opción a realizar");
			op = Integer.valueOf(sc.nextLine());

		} while (op < 1 || op > opciones.length);

		return op;

	}

	public static LocalDate introducir() {
		int anno, mes;
		while (true) {
			try {
				System.out.print("Indique el año ");
				anno = Integer.valueOf(sc.nextLine());
				System.out.print("Indique el mes ");
				mes = Integer.valueOf(sc.nextLine());
				LocalDate fe = LocalDate.of(anno, mes, 1);
				return fe;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			;
		}
	}

	public static void main(String[] args) {
		String basura;
		LocalDate fecha = null;
		int opcion;
		String opc[] = { "1.-Pedir por pantalla el año y el mes", "2.-Imprimir por pantalla el calendario del mes",
				"3.-Imprimir calendario en el fichero", "4.-Salir" };

		do {
			opcion = menu(opc);
			switch (opcion) {
			case 1: //
				fecha = introducir();
				break;
			case 2: //
				calendario(fecha);
				break;
			case 3: //
				break;
			}
			if (opcion != opc.length) {
				System.out.print("Presione una tecla para continuar.");
				basura = sc.nextLine();
			}

		} while (opcion != opc.length);

	}

}
