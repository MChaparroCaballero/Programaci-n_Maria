package martes_16_4_2024FICHEROS4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//de un archivo imprimeme todos los jugadores de cada club de un fichero//
		String linea, campos[];
		String fichero = "C:\\FICHEROS\\jugadores.csv";
		HashMap<String, ArrayList<String>> datos = new HashMap<String, ArrayList<String>>();

		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {

			linea = br.readLine();
			while (linea != null) {
				campos = linea.split(",");

				if (!datos.containsKey(campos[7])) {
					datos.put(campos[7], new ArrayList<String>());

				}
				datos.get(campos[7]).add(linea);
				linea = br.readLine();

			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

		for (String club : datos.keySet()) {// entramos al hasmap obteniendo la keyset del hasmap//
			System.out.println(club);// imprimimos el club osea el campo7 el cual es la keyset//
			for (String jugador : datos.get(club))// otro for donde imprimios la linea aka jugador obtenido del array de
													// club que era campo[7] porque recuerda que hicimos un arraylist
													// por posicion de campo[] pues esos son los values//
				System.out.println("\t" + jugador);
		}

	}

}
