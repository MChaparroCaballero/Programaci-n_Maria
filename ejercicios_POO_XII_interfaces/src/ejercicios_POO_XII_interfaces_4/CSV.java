package ejercicios_POO_XII_interfaces_4;

import ejercicios_POO_XII_interfaces_4.Exportables.Exportable;
import javax.swing.JOptionPane;

public class CSV implements Exportable {

	@Override
	public void exportarDatos() {//HACEMOS VENTANA DE MENSAJE//
		JOptionPane.showMessageDialog(null, "\nDatos exportados" + "\nFormato: CSV");

	}

}
