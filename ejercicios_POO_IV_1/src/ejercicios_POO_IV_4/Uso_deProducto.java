package ejercicios_POO_IV_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ejercicios_POO_IV_2.Empleado;

public class Uso_deProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] inventario = new Producto[2];

		for (int i = 0; i < inventario.length; i++) {

			inventario[i] = crearproducto();

		}
		
		for (Producto inventarios : inventario) {

		resumenInventario(inventarios);

		}

	}

	private static Producto crearproducto() {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del producto:");
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad"));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio/unidad del producto"));

		return new Producto(nombre, cantidad, precio);

	}
	
	
	private static void resumenInventario(Producto inventarios) {
		System.out.println("Resumen de inventario: ");	
		System.out.println("Nombre: " + inventarios.getNombre() + "\nCantidad: " + inventarios.getCantidad()
				+ "\nPrecio/unidad: " + inventarios.getPrecio() + "\ntotal: " + (inventarios.getCantidad() * inventarios.getPrecio()) + " euros");
		System.out.println("------------------------------------------------------------------------");
	}
	
}
