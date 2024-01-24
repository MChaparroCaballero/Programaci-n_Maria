package ejercicios_POO_V_5;

import java.time.LocalDate;
import java.util.*;

import javax.swing.JOptionPane;

import ejercicios_POO_V_1.Empleado;

public class Uso_aumentoSueldoCondicionado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hacemos un nuevo date con la fecha limite de cuando emppieza en 2021//
		Date fechaConlaquesecompara = new Date(121, 0, 1);
		// hacemos un arraylist que contenga los objetos//
		List<Empleado> ListaEmpleados = new ArrayList<>();

		// añadimos a la lista la primera instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));

		// añadimos a la lista la segunda instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));

		// añadimos a la lista la tercera instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));

		// bucle for each que nos recorre cada objeto de la lista de objetos//
		for (Empleado empleado : ListaEmpleados) {
			// guardamos en una variable el resultado de comparar la fecha de contrato de
			// cada objeto con la de cuando inicia el 2021//

			int comparacion = empleado.dameFechaContrato().compareTo(fechaConlaquesecompara);
			// si es negativa eso significa que la fecha de nuestro objeto occurio antes del
			// 2021 y si no ocurrio o ese año o después//
			if (comparacion < 0) {
				/*
				 * utiliza el metodo subir sueldo y nos lo sube al objeto que es un 5% y llama
				 * al metodo para mostar la informacion
				 */subeSueldo(empleado, 5);
				mostrarinfo(empleado);

			} else {

				// unicamente llama al metodo para mostar la informacion//
				mostrarinfo(empleado);
			}
		}
	}

	// metodo para subir el sueldo, le introduces el objeto y el porcentaje
	public static void subeSueldo(Empleado i, double porcentaje) {
		double aumento = i.dameSueldo() * porcentaje / 100;
		i.setSueldo(i.dameSueldo() + aumento);
	}

	// metodo para mostrar la info de los objetos en ventana dialogo y consola//
	public static void mostrarinfo(Empleado t) {

		// imprime por ventana dialogo//
		JOptionPane.showMessageDialog(null, "Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
				+ " \nAlta de contrato: " + t.dameFechaContrato());
		// linea de separacion//
		System.out.println("-----------------------------------------------------------------------------");
		// imprime por consola//
		System.out.println("Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo() + " \nAlta de contrato: "
				+ t.dameFechaContrato());
	}

}
