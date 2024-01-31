package ejercicios_POO_VI_5;

import javax.swing.JOptionPane;

public class Uso_deDeterminadorAñoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int opcion;

		//iniciamos un bucle que nos hace de menu basico//
		while (i < 2) {
			opcion = Integer.parseInt(JOptionPane
					.showInputDialog("Para calcular si es bisiesto o no pulse 1, para salir de la aplicacion pulse 2"));
			switch (opcion) {
			case 1:
				// utiliza la aplicacion//
				// instanciamos un nuevo objeto y le meteremos por pantalla el año, todo el programa en el caso 1//
				DeterminadorAñoBisiesto ano1 = new DeterminadorAñoBisiesto(
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año")));

				//escalera de if, va comprobando el primero, que no se cumple mira haber si se cumple el siguiente, que no al siguiente y si no al else//
				
				if (ano1.getAno() % ano1.getDivisor1() == 0 && ano1.getAno() % ano1.getDivisor2() == 0
						&& ano1.getAno() % ano1.getDivisor3() == 0) {
					JOptionPane.showMessageDialog(null, "\n año: " + ano1.getAno() + "\nEs bisiesto");
				} else if (ano1.getAno() % ano1.getDivisor1() == 0 && ano1.getAno() % ano1.getDivisor2() == 0) {
					JOptionPane.showMessageDialog(null, "\n año: " + ano1.getAno() + "\nNo es bisiesto");

				} else if (ano1.getAno() % ano1.getDivisor1() == 0) {
					JOptionPane.showMessageDialog(null, "\n año: " + ano1.getAno() + "\nEs bisiesto");

				} else {
					JOptionPane.showMessageDialog(null, "\n año: " + ano1.getAno() + "\nNo es bisiesto");
				}
				break;

			case 2:
				//caso dos el usuario a elegido no hacer nada o cerrar la app//
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestra app");
				i = 2;
				break;
			}

		}
	}
}