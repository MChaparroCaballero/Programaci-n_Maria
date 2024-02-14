package ejercicicios_POO_IX_abstract_5;

import javax.swing.JOptionPane;

public class Testing {

	public static void main(String[] args) {

		int eleccion = Integer.parseInt(
				JOptionPane.showInputDialog(null, "\n1)Empleado tiempo completo" + "\n2)Empleado tiempo parcial"));
		switch (eleccion) {
		case 1:
			EmpleadoTiempoCompleto pepe = new EmpleadoTiempoCompleto(JOptionPane.showInputDialog(null, "\nNombre: "),
					Integer.parseInt(JOptionPane.showInputDialog(null, "\nHoras extras: ")));

			int x = 0;
			while (x < 2) {
				int opcion = (Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Calcular salario" + "\n2)salir")));

				switch (opcion) {
				case 1:
					pepe.calcularSalario();
					break;
				case 2:
					x = 2;
					break;
				}
			}

			break;

		case 2:
			EmpleadoTiempoParcial lola = new EmpleadoTiempoParcial(JOptionPane.showInputDialog(null, "\nNombre: "),
					Integer.parseInt(JOptionPane.showInputDialog(null, "\nHoras complementarias: ")));
			int y = 0;
			while (y < 2) {
				int opcion = (Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Calcular salario" + "\n2)salir")));

				switch (opcion) {
				case 1:
					lola.calcularSalario();
					break;
				case 2:
					y = 2;
					break;
				}
			}

		}

	}
}
