package ejercicicios_POO_IX_abstract_2;

import javax.swing.JOptionPane;

public class Motocicleta extends Vehiculo {
	double velocidad;

	public Motocicleta(double velocidad) {
		super();
		this.velocidad = velocidad;
	}

	@Override
	public void acelerar() {
		velocidad +=1;
		JOptionPane.showMessageDialog(null, "\nvelocidad " + velocidad + "\nwuuuush");
		
	}

	@Override
	public void frenar() {
		velocidad -= 1;
		 JOptionPane.showMessageDialog(null, "\nvelocidad " + velocidad + "\npruuum pruum pruum");
		
	}

}
