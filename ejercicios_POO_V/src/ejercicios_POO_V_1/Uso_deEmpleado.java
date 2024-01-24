package ejercicios_POO_V_1;

import java.util.*;

import javax.swing.JOptionPane;

public class Uso_deEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));
		mostrarinfo(empleado1);
	}

	public static void mostrarinfo(Empleado t) {

		JOptionPane.showMessageDialog(null, "Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
				+ " \nAlta de contrato: " + t.dameFechaContrato());
		System.out.println("Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
		+ " \nAlta de contrato: " + t.dameFechaContrato());
	}
}
	
