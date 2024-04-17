package RAYOEXPLICACIONES;

public class Persona1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparamos ambas personas y vemos si tienen los mismos valores
		Persona p1 = new Persona("Jose", "Ruiz", 33);
		Persona p2 = new Persona("Jose", "Ruiz", 33);

		// Aqui aunque los datos sean los mismos, como los valores son relacionados con
		// una clase, el numero que saldrá en consoloa será diferente.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		if (p1.equals(p2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
	}

}
