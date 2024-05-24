package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class ejer01 {

	public static void main(String[] args) {
		String rutaEntrada="C:\\FICHEROS\\jugadores.csv";
		String linea;
		String [] campos;
		String club;
		HashMap<String,ArrayList<String>> lista= new HashMap<String,ArrayList<String>>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(rutaEntrada));){
			linea=br.readLine();
			while(linea!=null) {
				campos = linea.split(",");
				if(!lista.containsKey(campos[7])) {//si no existe el club que es la clave nos crea un arraylist vacio//
					lista.put(campos[7], new ArrayList<String>());
					
				} (lista.get(campos[7])).add(linea);//acto seguido accedemos al arraylist mediante la key del club y añadimos la linea//
				linea = br.readLine();
			
			}
		}catch(Exception e) {
			
		}
		/****************************************************************************/
		String fichero="C:\\FICHEROS\\jugadoresOrdenado.csv";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));){
			for (String clave:lista.keySet()) {//nos recorremos las claves//
				for(String v:lista.get(clave)) {//acedemos a los valores donde tengan esa clave//
					bw.write(v+"\n");
				}
			}

		}catch(Exception e) {
			
		}
	}
}

