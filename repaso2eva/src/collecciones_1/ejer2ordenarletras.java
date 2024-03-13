package collecciones_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ejer2ordenarletras {
	final static String cadena = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static String palabra() {
		String p = "";
		int n = alea(3, 10);
		for (int i = 1; i < n; i++)
			p += cadena.charAt(alea(0, cadena.length() - 1));
		return p;
	}

	public static void main(String[] args) {
		/*
		 * Escribe un programa que ordene 10 palabras introducidos por tecladoy
		 * almacenados en un objeto de la clase ArrayList.
		 */
		ArrayList<String> lista = new ArrayList<String>();
		for (int i = 0; i <= 25; i++)
			lista.add(palabra());
		Collections.sort(lista);
		for (String l : lista)
			System.out.println(l);
		// para que lo haga a la inversa//
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(lista, comparador);

	}

}
