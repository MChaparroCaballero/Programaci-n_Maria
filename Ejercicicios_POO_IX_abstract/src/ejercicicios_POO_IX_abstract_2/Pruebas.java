package ejercicicios_POO_IX_abstract_2;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// hacemos un menu de opcion//
		int option = 0;
		option = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\nTipo de vehiculo?" + "\n1)Automovil" + "\n2)Motocicleta" + "\n3)Salir"));

		switch (option) {
		case 1:
			// caso uno crea el auto y dentro de un bucle muestra otro menu de las
			// diferentes acciones que puede hacer el auto//
			Automovil ford = new Automovil(10);
			int x = 0;
			while (x < 3) {
				int accion = Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Acelerar" + "\n2)Frenar" + "\n3)Aparcar"));
				;
				switch (accion) {
				case 1:
					// acelera auto//
					ford.acelerar();
					break;
				case 2:
					// frena auto//
					ford.frenar();
					break;
				case 3:
					// aparca y sale del menu de acciones de auto//
					ford.velocidad = 0;
					JOptionPane.showMessageDialog(null, "\nvelocidad " + ford.velocidad + "\nScreeeeeee");
					x = 3;
					break;

				}
			}
			break;
		case 2:
			// crea una moto y muestra un menu con las diferentes acciones que puede hacer
			// la moto//
			Motocicleta honda = new Motocicleta(5);
			int y = 0;
			while (y < 3) {
				int accion = Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Acelerar" + "\n2)Frenar" + "\n3)Aparcar"));
				;
				switch (accion) {
				case 1:
					// acelera moto//
					honda.acelerar();
					break;
				case 2:
					// frena moto//
					honda.frenar();
					break;
				case 3:
					// aparca y sale del menu de acciones de moto//
					honda.velocidad = 0;
					JOptionPane.showMessageDialog(null, "\nvelocidad " + honda.velocidad + "\npruuum pruum pruum");
					y = 3;
					break;
				}

			}

			break;
		case 3:
			// sale del menu de opciones//
			JOptionPane.showMessageDialog(null, "adios");
			break;
			//555//
		}
	}

}