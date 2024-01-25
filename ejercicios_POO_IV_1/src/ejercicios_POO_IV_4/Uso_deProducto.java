package ejercicios_POO_IV_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ejercicios_POO_IV_2.Empleado;

public class Uso_deProducto {

	public static void main(String[] args) {
		// instanciamos el array de objetos//
		Producto[] inventario = new Producto[2];

		for (int i = 0; i < inventario.length; i++) {
			/*
			 * usamos el metodo crear producto para introducir los datos de los objetos por
			 * cada posicion del array
			 */
			inventario[i] = crearproducto();

		}
		/*
		 * pongo aqui este print para que no me lo repita cada vez que se ejecute el
		 * bucle
		 */
		System.out.println("Resumen de inventario: ");
		for (Producto inventarios : inventario) {
			// bucle for each que recorrera el array de objetos mostrando sus datos
			// utilizando el metodo resuemenInventario//
			resumenInventario(inventarios);

		}

	}

	/* metodo para introducir datos de los productos */
	private static Producto crearproducto() {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del producto:");
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad"));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio/unidad del producto"));

		return new Producto(nombre, cantidad, precio);

	}

	/* Metodo con el que se imprimen los datos de cada objetos en modo lista */
	private static void resumenInventario(Producto inventarios) {
		System.out.println("Nombre: " + inventarios.getNombre() + "\nCantidad: " + inventarios.getCantidad()
				+ "\nPrecio/unidad: " + inventarios.getPrecio() + "\ntotal: "
				+ (inventarios.getCantidad() * inventarios.getPrecio()) + " euros");
		System.out.println("------------------------------------------------------------------------");
	}

}
