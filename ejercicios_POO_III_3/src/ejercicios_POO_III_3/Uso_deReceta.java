package ejercicios_POO_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uso_deReceta {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader info;
		info = new InputStreamReader(System.in);
		BufferedReader lector;
		lector = new BufferedReader(info);
		Scanner scanner;
		scanner = new Scanner(System.in);

		//variable unicamente para bucle//
		int i = 0;
		System.out.println("Como se llama su receta");
		String nombre = lector.readLine();
		
		//instanciamos la clase con el valor del string//
		Receta nueva = new Receta(nombre);
		while (i < 3) {//bucle para hacer un menu de opcions//
			System.out.println(
					"Pulse 1 para añadir ingrediente, pulse 2 para añadir paso, pulse 3 para eliminar ingrediente, pulse 4 para ver la receta, pulse 5 para salir del menu");
			int eleccion = scanner.nextInt();//donde se guarda la opcion del menu//
			switch (eleccion) {//menu//
			case 1://añadir ingrediente//
				System.out.println("Cual es el ingrediente a añadir");
				String ingrediente = lector.readLine();
				nueva.agregarIngrediente(ingrediente);
				break;

			case 2://añadir paso//
				System.out.println("Cual es el paso a añadir");
				String paso = lector.readLine();
				nueva.agregarPaso(paso);
				break;
			case 3://eliminar paso//
				System.out.println("Cual es el ingrediente a eliminar");
				ingrediente = lector.readLine();
				nueva.eliminarIngrediente(ingrediente);
				break;

			case 4://mostrar receta completa//
				nueva.mostrarReceta();
				break;

			case 5://salir del menu y cerrar bucle//
				System.out.println("Gracias por utilizar nuestra aplicacion de recetas hasta la proxima");
				i = 3;
				break;

			}
		}
		lector.close();
		scanner.close();
	}
}
