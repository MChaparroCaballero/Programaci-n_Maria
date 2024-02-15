package ejercicios_POO_X_sobrecargaDeConstructores_4;

import javax.swing.JOptionPane;

public class Uso_coche {

	public static void main(String[] args) {
		// creamos primera instancia de coche//

		Coche impala = new Coche("Chevrolet", "impala", 1969, "negro", 5);
		// mostramos datos//
		JOptionPane.showMessageDialog(null,
				"\nMarca: " + impala.getMarca() + "\nModelo: " + impala.getModelo() + "\nAño: " + impala.getAño()
						+ "\nColor: " + impala.getColor() + "\nasientos: " + impala.getAsientos());

		// creamos segunda isntancia con el segundo constuctor//
		Coche ford = new Coche("Ford", "Mustang", "Gris");
		//mostramos info//
		JOptionPane.showMessageDialog(null,
				"\nMarca: " + ford.getMarca() + "\nModelo: " + ford.getModelo() + "\nColor: " + impala.getColor());

	}

}
