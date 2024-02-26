package principal;

import clases.Libro;

public class Ejer_01 {

	public static void main(String[] args) {
		Libro l1= new Libro("111","Rey perez", 2000);
		System.out.println(l1.getNumero());
		Libro l2= new Libro("111","Rey perez", 2000);
		System.out.println(l2.getNumero());
	}

}
