package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

import javax.swing.JOptionPane;

public class Contratista extends Empleado{
	int horas_de_trabajo;

	public Contratista(String nombre, int id, double salario) {//constructor heredado//
		super(nombre, id, salario);
		
	}

	public Contratista(String nombre, int id, double salario, int horas_de_trabajo) {//constructor propio//
		super(nombre, id, salario);
		this.horas_de_trabajo = horas_de_trabajo;
	}

	public int getHoras_de_trabajo() {//getter//
		return horas_de_trabajo;
	}

	public void setHoras_de_trabajo(int horas_de_trabajo) {//setter//
		this.horas_de_trabajo = horas_de_trabajo;
	}

	@Override
	public double CalcularSalario() {
		 return getSalario() ;
		
		
	}

	@Override
	public void MostrarDetalles() {
		JOptionPane.showMessageDialog(null,"\nTipo : contratista " + "\nNombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() + "\nhoras de trabajo: " + getHoras_de_trabajo());

		
	}

}
