package pruebasExamenTerceraEvaluacion2;

import java.io.BufferedReader;
import java.io.FileReader;

public class principal {

	public static void main(String[] args) {
		String fichero = "C:\\pruebas2.txt";
		String linea;

		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {

			linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

		} catch (Exception e) {
			e.getMessage();
		}
	}
}
