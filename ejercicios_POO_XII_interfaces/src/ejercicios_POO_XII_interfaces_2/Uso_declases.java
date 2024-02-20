package ejercicios_POO_XII_interfaces_2;

import javax.swing.JOptionPane;

public class Uso_declases {

	public static void main(String[] args) {
		Caixa maria = new Caixa();
		Santander ana = new Santander();

		JOptionPane.showMessageDialog(null, "\nCuenta de maria");
		maria.realizarPago();
		maria.reembolsarPago();
		
		JOptionPane.showMessageDialog(null, "\nCuenta de ana");
		ana.realizarPago();
		ana.reembolsarPago();

	}
}
