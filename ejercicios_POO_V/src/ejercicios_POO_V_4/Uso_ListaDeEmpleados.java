package ejercicios_POO_V_4;

import java.util.*;

import javax.swing.JOptionPane;

import ejercicios_POO_V_1.Empleado;

public class Uso_ListaDeEmpleados {

	public static void main(String[] args) {
		
		//creamos el arraylist de empleados//
		List<Empleado> ListaEmpleados = new ArrayList<>();
		
		//añadimos a la lista la primera instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));
		
		//añadimos a la lista la segunda instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));
		
		//añadimos a la lista la tercera instancia//
		ListaEmpleados.add(new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion"))));

		//bucle for each con un objeto empleado al azar que recorre cada objeto de la lista de objetos//
		for (Empleado empleado : ListaEmpleados) {
			JOptionPane.showMessageDialog(null, "\nNombre: " + empleado.dameNombre()
			+ " \nSueldo: " + empleado.dameSueldo() + " \nAlta de contrato: " + empleado.dameFechaContrato());
			System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Nombre: " + empleado.dameNombre() + ", Sueldo: " + empleado.dameSueldo() + " Alta de contrato: " + empleado.dameFechaContrato() );
        }


	}

}
