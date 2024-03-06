package clase5de3de2024_1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Tiempo nuevo = new Tiempo(5,25,30);
		Tiempo nuevo2 = new Tiempo(2,30,55);
		Tiempo nuevo3 = new Tiempo(11, 20, 10);
		
		System.out.println(nuevo);
		System.out.println(nuevo2);
		System.out.println("La suma de tiempo 1 + tiempo 2= " + nuevo.suma(nuevo2));
		System.out.println("La resta de tiempo 1 + tiempo 2= " + nuevo.resta(nuevo2));
		
		
	}

}
