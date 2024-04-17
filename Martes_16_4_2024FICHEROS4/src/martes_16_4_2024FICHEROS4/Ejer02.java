package martes_16_4_2024FICHEROS4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import Clases.Jugador;

public class Ejer02 {

	public static void main(String[] args) {
		//imprimeme todos los jugadores//
		String linea, campos[];
		String fichero = "C:\\FICHEROS\\jugadores.csv";
		HashMap<String, ArrayList<Jugador>> datos = new HashMap<String, ArrayList<Jugador>>();//hacemos un arralist de jugadores//

		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {

			linea = br.readLine();
			while (linea != null) {
				campos = linea.split(",");

				if (!datos.containsKey(campos[7])) {
					datos.put(campos[7], new ArrayList<Jugador>());

				}
				datos.get(campos[7]).add(new Jugador(campos[0],Integer.valueOf(campos[1]),campos[6],campos[7],campos[11]));//añadimos un nuevo jugador al hasmap//
				linea = br.readLine();

			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}

		for (String club : datos.keySet()) {// entramos al hasmap obteniendo la keyset del hasmap//
			System.out.println(club);// imprimimos el club osea el campo7 el cual es la keyset//
			for (Jugador item : datos.get(club))// otro for donde imprimios el item aka jugador obtenido del array de
													// club que era campo[7] porque recuerda que hicimos un arraylist
													// por posicion de campo[] pues esos son los values//
				System.out.println("\t" + item);
		}

	}


}
