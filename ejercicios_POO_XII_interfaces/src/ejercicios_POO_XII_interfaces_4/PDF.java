package ejercicios_POO_XII_interfaces_4;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_4.Exportables.Exportable;

public class PDF implements Exportable {

	@Override
	public void exportarDatos() {//HACEMOS VENTANA DE MENSAJE//
		JOptionPane.showMessageDialog(null, "\nDatos exportados" + "\nFormato: PDF");
		
	}

}
