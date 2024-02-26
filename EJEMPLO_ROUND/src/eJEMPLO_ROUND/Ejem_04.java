package eJEMPLO_ROUND;

import java.util.ArrayList;

import Clases.Persona;

public class Ejem_04 {

	public static void main(String[] args) {
		//creamos un nuevo arraylist//
		ArrayList<Persona> lista = new ArrayList<Persona>();
		//añadimos instancias de la lista de objetos al arraylist //
		lista.add(new Persona("Ana",20));
		lista.add(new Persona("Maria",50));
		lista.add(new Persona("ines",33));
		lista.add(new Persona("andres",33));
		
		//quitamos la instancia donde su hascode sea igual a esto, esto es remover por objeto//
		lista.remove(new Persona ("Maria",50));
		
		for(Persona p :lista) {
			System.out.println(p);
		}
	}

}
