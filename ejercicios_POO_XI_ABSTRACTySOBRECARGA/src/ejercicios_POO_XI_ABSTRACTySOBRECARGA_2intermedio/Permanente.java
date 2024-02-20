package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

public class Permanente extends Empleado {

	double complemento;

	public Permanente(String nombre, int id, double salario) {
		super(nombre, id, salario);
		// TODO Auto-generated constructor stub
	}

	
	public Permanente(String nombre, int id, double salario, double complemento) {
		super(nombre, id, salario);
		this.complemento = complemento;
	}


	@Override
	public void CalcularSalario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void MostrarDetalles() {
		// TODO Auto-generated method stub

	}


	public double getComplemento() {
		return complemento;
	}


	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	
}
