package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ejer4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Implementa el control de acceso al área restringida de un programa. Se
		 * debepedir un nombre de usuario y una contraseña. Si el usuario introduce
		 * losdatos correctamente, el programa dirá“Ha accedido al área restringida”.
		 * Elusuario tendráun máximo de 3 oportunidades. Si se agotan las
		 * oportunidadesel programa dirá“Lo siento, no tiene acceso al área
		 * restringida”. Los nombresde usuario con sus correspondientes contraseñas
		 * deben estar almacenados enuna estructura de la clase HashMap
		 */

		int intentos;
		// variables//
		String usuario, contraseña;
		// hacemos hasmap con key y value//
		HashMap<String, String> lista = new HashMap<String, String>();
		// añadimos al hasmap//
		lista.put("Jose", "1234");
		lista.put("Maria", "1234");
		lista.put("Ana", "1234");
		lista.put("Juan", "1234");

		// bucle para el numero de intentos, pide usuario si funciona y coincide con el
		// usuario de la key del hasmap te pide contraseña//
		for (intentos = 1; intentos <= 3; intentos++) {
			System.out.print("Dime el usuario");
			usuario = sc.nextLine();

			if (lista.containsKey(usuario)) {
				System.out.print("Dime la contraseña");
				contraseña = sc.nextLine();

				if (lista.get(usuario).compareToIgnoreCase(contraseña) == 0) {// el get devuelve el value osea el
																				// 12345//
					System.out.println("La contraseña coincide");
					break;
				} else {
					System.out.println("La contraseña no coincide");
				}
			} else {
				System.out.println("El usuario no existe");
			}
		}

		if (intentos == 4) {
			System.out.println("Demasiados intentos");
		} else {
			System.out.println("Paso en el intento " + intentos);
		}
	}

}
