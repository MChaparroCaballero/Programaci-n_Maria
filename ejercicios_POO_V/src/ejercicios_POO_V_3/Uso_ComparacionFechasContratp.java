package ejercicios_POO_V_3;

import javax.swing.JOptionPane;

import ejercicios_POO_V_1.Empleado;

public class Uso_ComparacionFechasContratp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia empleado 3 metemos sus valores y mostramos por pantalla//

		Empleado empleado3 = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));

		// instancia empleado 4 metemos sus valores y mostramos por pantalla//
		Empleado empleado4 = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));

		// usamos el metodo en los objetos//
		comparacionFechasContrato(empleado3, empleado4);
	}

	// metodo pra comparativa de fechas//
	public static void comparacionFechasContrato(Empleado i, Empleado c) {
		// guardamos en una variable int el resultado de comparar una fecha con la
		// otra//
		int comparacion = i.dameFechaContrato().compareTo(c.dameFechaContrato());

		// si el valor de la int es negativo aka primera fecha - segunda fecha <0 ==
		// ocurrio antes la primera fecha
		if (comparacion < 0) {
			JOptionPane.showMessageDialog(null, "\nFue contratado primero: " + "\nNombre: " + i.dameNombre()
					+ " \nSueldo: " + i.dameSueldo() + " \nAlta de contrato: " + i.dameFechaContrato());
			// imprime por ventana dialogo//
			System.out.println("Fue contratado primero " + " Nombre: " + i.dameNombre() + " \nSueldo: " + i.dameSueldo()
					+ " \nAlta de contrato: " + i.dameFechaContrato());
			// imprime por consola//

		} else if (comparacion > 0) {
			// si el valor de la int es positivo aka primera fecha - segunda fecha >0 ==
			// ocurrio antes la segunda fecha fecha

			JOptionPane.showMessageDialog(null, "\nFue contratado primero: " + "\nNombre: " + c.dameNombre()
					+ " \nSueldo: " + c.dameSueldo() + " \nAlta de contrato: " + c.dameFechaContrato());
			// imprime por ventana dialogo
			System.out.println("\nFue contratado primero " + " Nombre: " + c.dameNombre() + " \nSueldo: "
					+ c.dameSueldo() + " \nAlta de contrato: " + c.dameFechaContrato());
			// imprime por consola//
		} else {
			JOptionPane.showMessageDialog(null, "\nError");
		}

	}

}
