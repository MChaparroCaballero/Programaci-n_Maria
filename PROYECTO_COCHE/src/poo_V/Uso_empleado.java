package poo_V;

import java.util.*;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado nuevo = new Empleado(JOptionPane.showInputDialog("Ingrese el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo diario")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el més de incorporacion")),
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de incorporacion")));
		mostrarinfo(nuevo);
	}

	public static void mostrarinfo(Empleado t) {

		JOptionPane.showMessageDialog(null, "Nombre: " + t.dameNombre() + " \nSueldo: " + t.dameSueldo()
				+ " \nAlta de contrato: " + t.dameAlta_contrato());
	}
}

class Empleado {// clase//

	public Empleado(String nom, double sue, int agno, int mes, int dia) {// constructor//
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		alta_contrato = calendario.getTime();
	}

	public String dameNombre() {// getter//
		return nombre;
	}

	public void setNombre(String nombre) {// setter//
		this.nombre = nombre;
	}

	public double dameSueldo() {// getter//
		return sueldo;
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	public Date dameAlta_contrato() {// getter//

		return alta_contrato;
	}

	public void setAlta_contrato(Date alta_contrato) {
		this.alta_contrato = alta_contrato;
	}

	private String nombre;
	private double sueldo;
	private Date alta_contrato;

}