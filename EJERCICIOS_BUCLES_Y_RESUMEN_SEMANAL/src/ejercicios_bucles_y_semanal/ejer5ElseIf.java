package ejercicios_bucles_y_semanal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer5ElseIf {

	public static void main(String[] args) throws IOException {
//Dado un carácter, imprimir si es una vocal, una consonante, un dígito o un símbolo especial. 

		InputStreamReader info;
		BufferedReader lector;
		info = new InputStreamReader(System.in);
		lector = new BufferedReader(info);

		System.out.println("Ingrese un caracter");
		char caracter = lector.readLine().charAt(0);

		if (caracter == 'a') {
			System.out.println("Es una vocal");
		} else if (caracter == 'e') {
			System.out.println("Es una vocal");
		} else if (caracter == 'i') {
			System.out.println("Es una vocal");
		} else if (caracter == 'o') {
			System.out.println("Es una vocal");
		} else if (caracter == 'u') {
			System.out.println("Es una vocal");
		} else if (caracter == 'b') {
			System.out.println("Es una consonante");
		} else if (caracter == 'c') {
			System.out.println("Es una consonante");
		} else if (caracter == 'd') {
			System.out.println("Es una consonante");
		} else if (caracter == 'f') {
			System.out.println("Es una consonante");
		} else if (caracter == 'g') {
			System.out.println("Es una consonante");
		} else if (caracter == 'h') {
			System.out.println("Es una consonante");
		} else if (caracter == 'j') {
			System.out.println("Es una consonante");
		} else if (caracter == 'k') {
			System.out.println("Es una consonante");
		} else if (caracter == 'l') {
			System.out.println("Es una consonante");
		} else if (caracter == 'm') {
			System.out.println("Es una consonante");
		} else if (caracter == 'n') {
			System.out.println("Es una consonante");
		} else if (caracter == 'ñ') {
			System.out.println("Es una consonante");
		} else if (caracter == 'p') {
			System.out.println("Es una consonante");
		} else if (caracter == 'q') {
			System.out.println("Es una consonante");
		} else if (caracter == 'r') {
			System.out.println("Es una consonante");
		} else if (caracter == 's') {
			System.out.println("Es una consonante");
		} else if (caracter == 't') {
			System.out.println("Es una consonante");
		} else if (caracter == 'v') {
			System.out.println("Es una consonante");
		} else if (caracter == 'w') {
			System.out.println("Es una consonante");
		} else if (caracter == 'x') {
			System.out.println("Es una consonante");
		} else if (caracter == 'y') {
			System.out.println("Es una consonante");
		} else if (caracter == 'z') {
			System.out.println("Es una consonante");
		} else {
			System.out.println("es un simbolo especial");
		}

	}

}
