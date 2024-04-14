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
				/*
				 * Si tedas cuenta la primera linea del documentos son los campos, y el del club
				 * es el numero 7 nosotros al dividir por comas hara que en el array de campos
				 * el club sea lo que haya en la posicion 7 y luego simplemente comparamos que
				 * en la posicion 7 sea igual a lo que hemos introducido por escanner si es
				 * correcto te imprime la linea y porque esto no da error despues de todo
				 * estamos comprandando a campo no a linea, PUES PORQUE TODO EL CONTENIDO DEL
				 * CAMPO ES LINEA ASIQUE CON QUE DE IGUAL NOS LA IMRPIME PORQUE ES LO MISMO EN
				 * LOS DOS Y COMO VA LINEA A LINEA TE EL CICLO ES ENTRA EN EL ARCHIVO MIRA LEELE
				 * LA LINEA ENTRA AL WHILE ENTRA AL IF I COMPARA SI ES ESE CLUB TE lo añade al arraylist lista que utilizaremos mas tarde (PONIENDO linea en el print) try (BufferedReader br = new
				 * BufferedReader(new FileReader(fichero));) { linea = br.readLine(); while
				 * (linea != null) { campos = linea.split(","); if
				 * (campos[7].equalsIgnoreCase(club)) System.out.println(linea); linea =
				 * br.readLine(); }
				 * 
				 * 
				 * SALE DEL IF LEE LA SIGUIENTE LINEA Y EMPIEZA EL BUCLE DE NUEVO pero si
				 * quieres que te imprima ciertos campos solo debes cambiar que campos imprimir
				 * en el print:
				 */
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
