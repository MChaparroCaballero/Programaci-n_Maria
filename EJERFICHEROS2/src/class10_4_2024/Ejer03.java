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

		/*
		 * ruta esta incompleta/ String
		 * cadena="Hola jose como estais jose maria andres jose manuel", int
		 * n=cadena.indexOf("jose"),c=0;
		 * 
		 * while(n>-1) { c++; cadena=cadena.substring(n+palabra.length());
		 * n=cadena.indexOf(palabra); }
		 * 
		 * System.out.println(c); /* System.out.println(cadena.substring(5));
		 * System.out.println(cadena.substring(2, 6));
		 */

		/* ruta esta incompleta */
		String ruta = "C:\\FICHEROSLINKIA\\";
		String fichero, linea, palabra;
		/* pides datos */
		System.out.print("Dime el nombre del fichero");
		fichero = sc.nextLine();
		System.out.print("DIME LA PALABRA A BUSCAR");
		palabra = sc.nextLine();

		int c = 0;

		/*
		 * creas el buffer el fichero ya ha sido creado asique metes que va a leer la
		 * ruta ruta completandola con fichero
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(ruta + fichero))) {
			/* lees a ver si esta escrito algo */
			linea = br.readLine();
			while (linea != null) {
				String cadena = linea;
				/* te busca la palabra y si esta te imprime la linea */
				if (linea.indexOf(palabra) > -1)
					c++;
				int n = linea.indexOf(palabra);
				linea = br.readLine();

				while (n > -1) {
					c++;
					cadena = cadena.substring(n + palabra.length());
					n = cadena.indexOf(palabra);
				}

				System.out.println(c);

			}

		} catch (Exception e) {

		}

	}

}
