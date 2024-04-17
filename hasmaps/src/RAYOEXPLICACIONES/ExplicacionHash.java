package RAYOEXPLICACIONES;

import java.util.HashMap;

public class ExplicacionHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> productos = new HashMap<>();

		productos.put("Peras", 1.23); // el put modifica y añade
		productos.put("Manzanas", 3.45);

		System.out.println(productos.get("Peras"));// Esto lo hacemos paraq ue nos de el valor double, en este caso el
													// 1.23

		/*
		 * Aqui es para que so,lo obtengamos el valor double, que es como una clave
		 * primaria, EL String es porque el valor inicial es string, clave es el nombre
		 * que le hemos puesto nosotros y productos key set es para obetener ese numero
		 */
		for (String clave : productos.keySet()) {
			System.out.println("key= " + clave + " valor= " + productos.get(clave));// Aqui es para obtener el numero de
																					// todos los productos

		}
	}

}
