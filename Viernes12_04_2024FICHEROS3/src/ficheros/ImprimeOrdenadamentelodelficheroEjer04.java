package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ImprimeOrdenadamentelodelficheroEjer04 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>(); 
		String linea, campos[];
		String fichero = "C:\\FICHEROS\\jugadores.csv";

		System.out.print("Nombre Del club");
		String club = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {
			
			linea = br.readLine();
			while (linea != null) {
			
				campos = linea.split(",");
				if (campos[7].equalsIgnoreCase(club))
					lista.add(campos[0] + " "+campos[6] + " " + campos[7]);
				linea = br.readLine();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Collections.sort(lista);
		
		for(String item: lista) {
			System.out.println(item);
		}
	}
}
