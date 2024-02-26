package eJEMPLO_ROUND;

import java.util.ArrayList;

import Clases.Persona;
public class Ejer_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Maria",20));
		lista.add(new Persona("Ana",20));
		
		Persona p1 = new Persona ("Ana",20);
		Persona p2 = new Persona ("Ana",20);
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		if(p1.equals(p2)) {
			System.out.println("somos iguales");
		}else {
			System.out.println("somos distintos");
		}
	}

}
