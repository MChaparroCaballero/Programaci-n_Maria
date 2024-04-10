package class10_4_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejer01 {

	public static void main(String[] args) {
		/* fusiona el contenido de dos ficheros(fi1 y fi2) en un tercero(fi3) */
		String fi1 = "C:\\FICHEROSLINKIA\\FICHEROS1.TXT";
		String fi2 = "C:\\FICHEROSLINKIA\\FICHEROS2.TXT";
		String fi3 = "C:\\FICHEROSLINKIA\\FUSION.TXT";
		String linea1, linea2;

		try (BufferedReader br1 = new BufferedReader(new FileReader(fi1));
				BufferedReader br2 = new BufferedReader(new FileReader(fi2));

				BufferedWriter bw = new BufferedWriter(new FileWriter(fi3));) {

			linea1 = br1.readLine();
			linea2 = br2.readLine();

			/*
			 * mientras que puedas leer de linea 1 y linea 2 (porque los archivos tienen
			 * diferentes cantidades de lineas) graba en el tercero
			 */
			while (linea1 != null && linea2 != null) {
				bw.write(linea1 + "\n");
				bw.write(linea2 + "\n");
				linea1 = br1.readLine();
				linea2 = br2.readLine();

			}

			/*
			 * sale del primer mientras porque o ya no puede leer linea1 o no puede linea2
			 */
			while (linea1 != null) {
				/*
				 * vuelve a intentar linea1 si le quedan las leera y grabara sino pasa al
				 * siguiente while
				 */
				bw.write(linea1 + "\n");
				linea1 = br1.readLine();

			}
			/*
			 * intenta la linea2 y si le quedan lineas por recorrer leer y grabar las hara
			 */
			while (linea2 != null) {

				bw.write(linea2 + "\n");

				linea2 = br2.readLine();
			}

		} catch (Exception e) {

		}
	}

}
