package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

import javax.swing.JOptionPane;

public class Temporal extends Empleado{

	
	int mesesC;
	public Temporal(String nombre, int id, double salario) {
		super(nombre, id, salario);
		// TODO Auto-generated constructor stub
	}
	
	

	public Temporal(String nombre, int id, double salario, int mesesC) {
		super(nombre, id, salario);
		this.mesesC = mesesC;
	}



	public int getMesesC() {
		return mesesC;
	}



	public void setMesesC(int mesesC) {
		this.mesesC = mesesC;
	}



	@Override
	public double CalcularSalario() {
		return getSalario();
		
		
	}

	@Override
	public void MostrarDetalles() {
		JOptionPane.showMessageDialog(null,"\nTipo : Temporal " +"\nNombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() + "\nMeses de contrato: " + getMesesC());

		
	}

}
