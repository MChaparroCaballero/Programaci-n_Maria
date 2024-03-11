package collecciones_1;

import java.util.ArrayList;
import java.util.Collections;

public class principal {
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void main(String[] args) {
		// sortear una colleccion de primero a ultimo//
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i <= 25; i++) {
			lista.add(alea(1, 10));

		}
		Collections.sort(lista);
		for (Integer l : lista) {
			System.out.println(l);
		}
	}

}
