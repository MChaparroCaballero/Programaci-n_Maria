package ejercicios_POO_XII_interfaces_1;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_1.GestionDeInventarios.Inventariable;

public class Detergente implements Inventariable {
	public static int cantidad = 20;

	@Override
	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + Detergente.cantidad);

	}

	@Override
	public void actualizarStock() {
		Detergente.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese cantidad actualizada"));

	}

}
