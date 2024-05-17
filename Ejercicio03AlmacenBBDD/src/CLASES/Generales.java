package CLASES;

import java.util.Scanner;

public class Generales {

	public static int menu(String opciones[], Scanner sc) {
		int op;
		do {
			for (String e : opciones)
				System.out.println(e);
			System.out.println("\tOpción a realizar");
			op = Integer.valueOf(sc.nextLine());
		} while (op < 1 || op > opciones.length);

		return op;

	}
}
