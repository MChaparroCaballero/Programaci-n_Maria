package ejercicicios_POO_IX_abstract_5;

import javax.swing.JOptionPane;

public class Testing {

	public static void main(String[] args) {

		//variable de eleccion entre tipo de empleados//
		int eleccion = Integer.parseInt(
				JOptionPane.showInputDialog(null, "\n1)Empleado tiempo completo" + "\n2)Empleado tiempo parcial"));
		switch (eleccion) {
		//menu de eleccion de que empleado es//
		case 1:
			//somos empleado a tiempo completo asique creamos una nueva instancia y pedimos los datos//
			EmpleadoTiempoCompleto pepe = new EmpleadoTiempoCompleto(JOptionPane.showInputDialog(null, "\nNombre: "),
					Integer.parseInt(JOptionPane.showInputDialog(null, "\nHoras extras: ")));

			int x = 0;
			while (x < 2) {//bucle donde hacemos el menu de que puede hacer//
				int opcion = (Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Calcular salario" + "\n2)salir")));

				switch (opcion) {
				case 1:
					//opcion calcular su salario//
					pepe.calcularSalario();
					break;
				case 2:
					//salir del menu//
					x = 2;
					break;
				}
			}

			break;

		case 2:
			EmpleadoTiempoParcial lola = new EmpleadoTiempoParcial(JOptionPane.showInputDialog(null, "\nNombre: "),
					Integer.parseInt(JOptionPane.showInputDialog(null, "\nHoras complementarias: ")));
			int y = 0;
			while (y < 2) {//bucle con el menu de que puede hacer//
				int opcion = (Integer
						.parseInt(JOptionPane.showInputDialog(null, "\n1)Calcular salario" + "\n2)salir")));

				switch (opcion) {
				case 1:
					//opcion calcular su salario//
					lola.calcularSalario();
					break;
				case 2:
					//salir del menu//
					y = 2;
					break;
				}
			}

		}

	}
}
