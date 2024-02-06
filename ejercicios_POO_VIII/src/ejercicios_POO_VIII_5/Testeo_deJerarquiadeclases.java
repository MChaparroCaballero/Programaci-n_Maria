package ejercicios_POO_VIII_5;

import javax.swing.JOptionPane;

public class Testeo_deJerarquiadeclases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone plus = new Smartphone(JOptionPane.showInputDialog("Ingrese el fabricante "),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación ")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono")),
				JOptionPane.showInputDialog("que app se quiere instalar "));
		
		JOptionPane.showMessageDialog(null, "\nDispositivo nuevo: " + "\nFabricante: " + plus.getFabricante() + "\nAño de fabricación: " + plus.getAñoDeFabricación() + 
				"\nNumero de telefono: " + plus.recibirLlamadas() + "\nApp: " + plus.getAplicacion());
	}

}
