package ejercicios_POO_XII_interfaces_2;

import javax.swing.JOptionPane;

public class Uso_declases {

	public static void main(String[] args) {
		//nuevas instancias//
		Caixa maria = new Caixa();
		Santander ana = new Santander();

		//para diferenciar las ventanas porque van seguidas//
		JOptionPane.showMessageDialog(null, "\nCuenta de maria");
		maria.realizarPago();
		maria.reembolsarPago();
		
		//para diferenciar las ventanas por que van seguidas//
		JOptionPane.showMessageDialog(null, "\nCuenta de ana");
		ana.realizarPago();
		ana.reembolsarPago();

	}
}
