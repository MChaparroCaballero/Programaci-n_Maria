package collecciones_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ejer3 {

	public static void main(String[] args) {
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Maria", 19));
		lista.add(new Persona("juan", 18));
		lista.add(new Persona("luis", 24));

		Collections.sort(lista, new ordenar(1));
		for (Persona p : lista) {
			System.out.println(p);
		}
	}

}

class ordenar implements Comparator<Persona> {
	private int caso = 1;

	public ordenar(int caso) {
		this.caso = caso;
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		int n;
		switch (this.caso) {
		case 1:
			n = (int) Math.signum(p1.getEdad() - p2.getEdad());// para hacer la diferencia y que te devuelva por orden
																// de este asc//
			if (n == 0) {
				return p2.getNombre().compareTo(p1.getNombre());
			} else {
				return n;
			}
		case 2:
			return (int) Math.signum(p2.getEdad() - p1.getEdad());
		case 3:
			return p2.getNombre().compareTo(p1.getNombre());
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
