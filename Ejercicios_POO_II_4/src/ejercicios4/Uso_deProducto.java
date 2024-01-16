package ejercicios4;

public class Uso_deProducto {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4: Clase Producto Objetivo: Crea una clase Producto con tres
		 * propiedades privadas: nombre (String), precio (double), y stock (int).
		 * Desarrolla los métodos getter y setter necesarios. Desafío adicional: En el
		 * setter de stock, asegúrate de que no sea un número negativo.
		 * 
		 */

		Producto peras = new Producto();//instanciamos//
		peras.set_nombre("Peras");//los nuevos valores del setter//
		peras.set_precio(1.76);
		peras.set_stock(30);

		System.out.println("La crisís ha traido una subida de precios entre ellos de el" + peras.get_nombre() + " el cual su nuevo precio" + peras.get_precio() + "y actualmente con un stock que" + peras.get_stock());
	}

}
