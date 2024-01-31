package ejercicios_POO_VII_1;

import java.util.*;

import javax.swing.JOptionPane;


public class Uso_ContadorInstancias {

	public static void main(String[] args) {
		//creamos array//

		ContadorInstancias[] nombres = new ContadorInstancias[3];

		for (int i = 0; i < nombres.length; i++) {

			nombres[i] = new ContadorInstancias(JOptionPane.showInputDialog("Ingrese el nombre"));

		}

		// Mostrar información utilizando getters y un bucle//

		for (ContadorInstancias numero : nombres) {

			JOptionPane.showMessageDialog(null,

					"\nNombre: " + numero.getNombre() + "\nInstancias: " + ContadorInstancias.getContador());

		}

	}

}
