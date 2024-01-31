package ejercicios_POO_VII_2;

import javax.swing.JOptionPane;

public class Uso_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int opcion;

		// iniciamos un bucle que nos hace de menu basico//
		while (i < 5) {
			// usuario elige la opcion//
			opcion = Integer.parseInt(JOptionPane
					.showInputDialog("\n1)suma" + "\n2)resta" + "\n3)multiplicación" + "\n4)divisón" + "\n5)exit"));

			switch (opcion) {
			case 1:
				// nueva instancia y usamos metodo suma//
				Calculadora ejemplosuma = new Calculadora(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 1")),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 2")));
				Calculadora.suma(ejemplosuma.getOperador1(), ejemplosuma.getOperador2());
				JOptionPane.showMessageDialog(null, ejemplosuma.getOperador1() + " + " + ejemplosuma.getOperador2()
						+ "\nResultado: " + Calculadora.getResultado());

				break;
			case 2:
				// nueva instancia y usamos metodo resta//
				Calculadora ejemploresta = new Calculadora(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 1")),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 2")));
				Calculadora.resta(ejemploresta.getOperador1(), ejemploresta.getOperador2());
				JOptionPane.showMessageDialog(null, ejemploresta.getOperador1() + " - " + ejemploresta.getOperador2()
						+ "\nResultado: " + Calculadora.getResultado());
				break;
			case 3:
				// nueva instancia y usamos metodo multiplicacion//
				Calculadora ejemplomulti = new Calculadora(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 1")),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 2")));
				Calculadora.multiplicacion(ejemplomulti.getOperador1(), ejemplomulti.getOperador2());
				JOptionPane.showMessageDialog(null, ejemplomulti.getOperador1() + " X " + ejemplomulti.getOperador2()
						+ "\nResultado: " + Calculadora.getResultado());
				break;

			case 4:
				// nueva instancia y usamos metodo division//
				Calculadora ejemplodiv = new Calculadora(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 1")),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el operador 2")));
				Calculadora.division(ejemplodiv.getOperador1(), ejemplodiv.getOperador2());
				JOptionPane.showMessageDialog(null, ejemplodiv.getOperador1() + " : " + ejemplodiv.getOperador2()
						+ "\nResultado: " + Calculadora.getResultado());

				break;

			case 5:
				JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra app");
				i = 5;
				break;

			// el default para que no puedan meter una opcion que no existe//
			default:
				JOptionPane.showMessageDialog(null, "Error, opción invalida");
				break;

			}
		}
	}
}