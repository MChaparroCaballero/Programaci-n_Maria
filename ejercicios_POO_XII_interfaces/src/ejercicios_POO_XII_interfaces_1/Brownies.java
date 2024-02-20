package ejercicios_POO_XII_interfaces_1;

import javax.swing.JOptionPane;
import ejercicios_POO_XII_interfaces_1.GestionDeInventarios.Inventariable;

public class Brownies implements Inventariable {
	public static int cantidad = 33;

	@Override
	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + Brownies.cantidad);

	}

	@Override
	public void actualizarStock() {
		Brownies.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese cantidad actualizada"));

	}

}
