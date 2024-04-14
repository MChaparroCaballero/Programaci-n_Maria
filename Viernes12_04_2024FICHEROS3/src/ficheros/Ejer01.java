package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer01 {

	public static Scanner sc = new Scanner(System.in);
	public static int nlineas=0;

	public static void contar(String l, String p) {
		/*BUSCA UNA PALABRA EN UN ARCHIVO
		 * 
		 * l de linea y p de palabra, les pasas la linea y la palabra una variable c que
		 * cuenta cuantas veces se encuentra la palabra, y en n buscamos la palbra
		 * dentro de la cadena si n es mayor que -14 osea la encontro, suma al c y
		 * actualiza la linea a empezar desde la n hasta al final de la lontiud de la y actualiza n a hacer otra vz la busqueda y si c es mayor que 0 osea el texto contiene la palabra imprime la cadena y la posicion 
		 * palabra
		 */
		nlineas++;//nlineas es en que linea esta//
		String linea=l;//la cadena en la que buscar//
		int c = 0, n = l.indexOf(p);
		while (n > -1) {
			c++;//c es cuantas veces encuentra la palabra ya que el bucle se repite cada vez que encuentra la palabra//
			l = l.substring(n + p.length());
			n = l.indexOf(p);
		}
		if (c > 0)
			System.out.println(String.valueOf(nlineas)+" "+linea + " " + String.valueOf(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String linea;
		String ruta = "C:\\FICHEROS\\";

		System.out.print("Nombre Del fichero");
		String fichero = sc.nextLine();

		System.out.print("Palabra a buscar");
		String palabra = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta + fichero));) {
			linea = br.readLine();
			while (linea != null) {

				contar(linea, palabra);
				linea = br.readLine();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
