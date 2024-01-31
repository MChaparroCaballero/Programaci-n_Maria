package ejercicios_POO_VI_1;

import java.util.*;

import javax.swing.JOptionPane;

public class Uso_Calculadora_Impuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int opcion;

		while (i < 2) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Para calcular los impuestos sobre un producto pulse 1, para salir de la aplicacion pulse 2"));
			switch (opcion) {
			case 1:
				// utiliza la aplicacion//
				// instanciamos un nuevo objeto y le meteremos por pantalla el nombre y el
				// precio pero el porcentaje sera predefinido porque es final//
				Calculadora_Impuestos peras = new Calculadora_Impuestos(
						JOptionPane.showInputDialog("Ingrese el nombre del producto"),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto")), 15);

				// imprimos los datos del objeto antes de aplicar el impuesto sobre el precio//
				JOptionPane.showMessageDialog(null, "\nNombre: " + peras.getNombre() + "\nprecio antes de impuestos : "
						+ peras.getPrecio() + "\nporcentaje a aplicar: " + peras.getporcentaje() +"%");

				// aplicamos el impuesto sobre el precio//
				peras.setPrecio(peras.getPrecio() + ((peras.getPrecio() * peras.getporcentaje()) / 100));

				// imprimimos los datos del objetos despues de aplicar el impuesto sobre el
				// precio//
				JOptionPane.showMessageDialog(null, "\nNombre: " + peras.getNombre() + "\n nuevo precio con impuestos: "
						+ peras.getPrecio() + "\nporcentaje aplicado: " + peras.getporcentaje() + "%");

				break;
			case 2:
				// cuando el usuario elige no calcular impuestos mostrara un mensaje y se
				// terminara el programa//
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestra app");
				i = 2;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Error, opción invalida");

			}
		}

		/*
		 * Soy consciente que este programa solo sirve para un unico producto pero ya
		 * que no pide hacer varios lo he hecho asique que es más rapido, si hubiera
		 * querido para varios hubiera utilizado un array de objetos un for y un while y
		 * ovbiamente el switch
		 */
	}

}
