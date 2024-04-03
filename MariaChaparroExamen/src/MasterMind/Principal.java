package MasterMind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException {
		// b) usuario crea su intento de combinacion//

		Combinacion nueva = new Combinacion();

		InputStreamReader info = new InputStreamReader(System.in);
		BufferedReader lector = new BufferedReader(info);

		String[] resultado = new String[4];
		int intentos = 0;

		for (intentos = 0; intentos <= 20; intentos++) {/*
														 * se supone que un bucle el cual mediante una variable estatica
														 * que cuenta cuantas posiciones has acertado te ira sumando
														 * intentos o no
														 */
			System.out.println("Escribe la combinacion que crees que es");
			for (int i = 0; i < resultado.length; i++) {// usuario mete su combinacion//
				System.out.println("DIME COLOR");
				resultado[i] = lector.readLine();

			}
			Combinacion.EvaluacionCombinacion(nueva.Combi, resultado);// llamamos al metodo para validar//
			if (nueva.getContadorc() == 4) {
				System.out.println("DESCIFRASTE LA COMBINACION EN EL INTENTO" + intentos);
				intentos = 20;
			} else {
				intentos++;
			}
		}
	}
}
