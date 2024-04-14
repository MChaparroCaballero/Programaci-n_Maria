package class10_4_2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer03 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// crea un programa que cree un fichero y busque una palabra que pides por
		// pantalla en le fichero y que nos muestre cuantas veces se la encuentra en el
		// fichero en la misma linea */

		/* ruta esta incompleta */
		String cadena = "Hola jose como estais jose maria andres jose manuel", palabra = "jose";
		int n = cadena.indexOf("jose"), c = 0;

		while (n > -1) {
			c++;
			/*
			 * ahi decimes que ahora cadena empieza desde la siguiente posicion donde
			 * encontro jose por eso desde donde empieza la palabra + la longitud de la
			 * palabra 
			 */
			cadena = cadena.substring(n + palabra.length());
			/*ahora n sera igual a el nuevo valor de cadena y como es un bucle pues ta ta ta lo va haciendo hasta que se termine*/
			n = cadena.indexOf(palabra);
		}

		System.out.println(c);
		/*
		 * System.out.println(cadena.substring(5));
		 * System.out.println(cadena.substring(2, 6));
		 */

	}

}