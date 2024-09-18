package class10_4_2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer02 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// crea un programa que cree un fichero y busque una palabra que pides por
		// pantalla en le fichero y que nos muestre c uantas veces se la encuentra en el
		// fichero*/

		
		/*ruta esta incompleta*/
		String ruta="C:\\FICHEROSLINKIA\\";
		String fichero, linea, palabra;
		/*pides datos*/
		System.out.print("Dime el nombre del fichero");
		fichero = sc.nextLine();
		System.out.print("DIME LA PALABRA A BUSCAR");
		palabra = sc.nextLine();

		/*creas el buffer el fichero ya ha sido creado asique metes que va a leer la ruta ruta completandola con fichero*/
		try (BufferedReader br = new BufferedReader(new FileReader(ruta+fichero))) {
			/*lees a ver si esta escrito algo*/
			linea = br.readLine();
			while (linea != null) {
				/*te busca la palabra y si esta te imprime la linea*/
				if (linea.indexOf(palabra) > -1)
					System.out.println(linea);
				linea = br.readLine();

			}

		} catch (Exception e) {

		}

	}

}
