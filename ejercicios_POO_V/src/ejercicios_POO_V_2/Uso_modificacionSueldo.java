package ejercicios_POO_V_2;

import javax.swing.JOptionPane;

import ejercicios_POO_V_1.Empleado;

public class Uso_modificacionSueldo {

	public static void main(String[] args) {
		// primera instancia empleado 1 metemos sus valores y mostramos por pantalla//
		Empleado empleado1 = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));
		mostrarinfo(empleado1);
		
		//segundo objeto ingresamos sus valores//
		Empleado empleado2 = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));
		
		//utilizamos el metodo de subir sueldo ingresando el aumento por ventana de dialogo para el segunod objeto//
		subeSueldo(empleado2,Double.parseDouble(JOptionPane.showInputDialog("Ingrese el aumento de sueldo")));
		//mostramos por venatana de dialogo los datos actualizados de empleado 2//
		mostrarinfo(empleado2);
	}
	
	public static void subeSueldo(Empleado i,double porcentaje) {
		
		double aumento = i.dameSueldo() * porcentaje / 100;
		i.setSueldo(i.dameSueldo()+aumento);
	}
	
	public static void mostrarinfo(Empleado t) {
		
		JOptionPane.showMessageDialog(null, "Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
				+ " \nAlta de contrato: " + t.dameFechaContrato());
		System.out.println("Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
		+ " \nAlta de contrato: " + t.dameFechaContrato());
	}
	}


