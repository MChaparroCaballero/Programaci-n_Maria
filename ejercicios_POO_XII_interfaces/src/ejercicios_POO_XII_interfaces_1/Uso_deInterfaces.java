package ejercicios_POO_XII_interfaces_1;

import javax.swing.JOptionPane;

public class Uso_deInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;

		Brownies chocolate = new Brownies();
		Detergente nenuco = new Detergente();

		int producto = Integer.parseInt(JOptionPane.showInputDialog("\n1)Brownies" + "\n2)Detergente"));

		//menu de productos//
		switch (producto) {

		case 1:
			while (x < 3) {
				int opcion = Integer
						.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion) {//menu de opciones//
				case 1:
					chocolate.obtenerStock();
					break;
				case 2:
					chocolate.actualizarStock();
					break;

				case 3:
					x = 3;
					break;
				}
			}

			break;

		case 2:
			int y = 3;
			while (y < 3) {
				int opcion2 = Integer
						.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion2) {//menu de opciones//
				case 1:
					nenuco.obtenerStock();
					break;
				case 2:
					nenuco.actualizarStock();
					break;

				case 3:
					y = 3;
					break;
				}
			}
			break;
		}
	}

}
