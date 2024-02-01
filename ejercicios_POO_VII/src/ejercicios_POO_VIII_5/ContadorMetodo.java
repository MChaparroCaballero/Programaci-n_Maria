package ejercicios_POO_VIII_5;

import javax.swing.JOptionPane;

public class ContadorMetodo {
	private String nombre;
	private int cantidad;
	private double precio;
	private static int count;

	ContadorMetodo(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		count = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		ContadorMetodo.count = count;
	}

	public static void total (String nom, int cant, double prec) {
		//operacion basica al azar para que haga algo//
		double total = cant * prec;
		//lo que contara los usos del metodo//
		ContadorMetodo.count = ContadorMetodo.count + 1;
		//impresion de los valores y del contador de metodo utilizado//
		JOptionPane.showMessageDialog(null,"\nnombre " + nom + "\nprecio " + prec + "\ncantidad " + cant + "\ntotal " + total + "\ncontador compras "
				+ ContadorMetodo.count );
		

	}

	
}
