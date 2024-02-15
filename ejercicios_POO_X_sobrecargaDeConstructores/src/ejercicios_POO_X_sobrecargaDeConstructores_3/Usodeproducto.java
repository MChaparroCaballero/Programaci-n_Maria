package ejercicios_POO_X_sobrecargaDeConstructores_3;

import javax.swing.JOptionPane;

public class Usodeproducto {

	public static void main(String[] args) {

		// 1 instancia con el uso del primero construtor//
		Producto batido = new Producto("Batidos de chocolate", 6.55, 10, "hacendado");
		// mostramos datos en ventana//
		JOptionPane.showMessageDialog(null, "\nNombre: " + batido.getNombre() + "\nPrecio: " + batido.getPrecio()
				+ "\nCantidad: " + batido.getCantidad() + "\nMarca: " + batido.getMarca());
		// 2 instancia con el uso del segundo construtor//
		Producto pera = new Producto("Pera", 1.22, 3);
		// mostramos datos en ventana//
		JOptionPane.showMessageDialog(null, "\nNombre: " + pera.getNombre() + "\nPrecio: " + pera.getPrecio()
				+ "\nCantidad: " + pera.getCantidad());
		// 3 isntancia con el uso del tercer construtor//
		Producto manzana = new Producto("Manzana envy", 5, 7, 10);
		// mostramos datos en ventana//
		JOptionPane.showMessageDialog(null, "\nNombre: " + manzana.getNombre() + "\nPrecio: " + manzana.getPrecio()
				+ "\nCantidad: " + manzana.getCantidad() + "\nDescuento: " + manzana.getDescuento());
	}

}
