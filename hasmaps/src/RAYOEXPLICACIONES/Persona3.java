package RAYOEXPLICACIONES;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Persona, ArrayList<Persona>> familias = new HashMap<Persona, ArrayList<Persona>>();

		// familias.put(new Persona("Juan","Perez",50), new ArrayList<Persona>());

		Persona p1 = new Persona("Juan", "Perez", 50);
		familias.put(p1, new ArrayList<Persona>());
		familias.get(p1).add(new Persona("maria", "perez", 25));
		familias.get(p1).add(new Persona("hada", "perez", 20));

		Persona p2 = new Persona("Ana", "Perez", 50);
		familias.put(p2, new ArrayList<Persona>());
		familias.get(p2).add(new Persona("Jochi", "Marrero", 18));
		familias.get(p2).add(new Persona("Camila", "Andreina", 40));

		for (Persona p : familias.keySet()) {
			System.out.println(p);
			for (Persona hijos : familias.get(p)) {
				System.out.println("\t" + hijos);

			}

		}
	}

}
