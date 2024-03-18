package ejerciciosnivel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer4 {

	public static void main(String[] args) throws IOException {
		// Modifica la aplicación anterior, para que nos pida el nombre que queremos
		// introducir por consola.

		System.out.println("Introduzca su nombre");
		InputStreamReader info;
		BufferedReader lector;

		info = new InputStreamReader(System.in);
		lector = new BufferedReader(info);

		String nombre = lector.readLine();
		lector.close();
		System.out.println("Bienvenido/a " + nombre);

	}

}
