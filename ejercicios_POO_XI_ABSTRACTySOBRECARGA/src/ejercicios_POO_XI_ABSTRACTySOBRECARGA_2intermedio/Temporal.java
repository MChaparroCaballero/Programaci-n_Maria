package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

import javax.swing.JOptionPane;

public class Temporal extends Empleado{

	
	int mesesC;
	public Temporal(String nombre, int id, double salario) {//constructor basico//
		super(nombre, id, salario);
		
	}
	
	

	public Temporal(String nombre, int id, double salario, int mesesC) {//constructor propio//
		super(nombre, id, salario);
		this.mesesC = mesesC;
	}



	public int getMesesC() {//getter//
		return mesesC;
	}



	public void setMesesC(int mesesC) {//setter//
		this.mesesC = mesesC;
	}



	@Override
	public double CalcularSalario() {//calculamos salario//
		return getSalario();
		
		
	}

	@Override
	public void MostrarDetalles() {//mostramos los detalles//
		JOptionPane.showMessageDialog(null,"\nTipo : Temporal " +"\nNombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() + "\nMeses de contrato: " + getMesesC());

		
	}

}
