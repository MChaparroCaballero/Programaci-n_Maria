package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;
import javax.swing.JOptionPane;
public class Permanente extends Empleado {

	double complemento;

	public Permanente(String nombre, int id, double salario) {
		super(nombre, id, salario);
		// constrcutor basico//
	}

	
	public Permanente(String nombre, int id, double salario, double complemento) {
		super(nombre, id, salario);
		this.complemento = complemento;
	}





	public double getComplemento() {
		return complemento;
	}


	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	@Override
	public double CalcularSalario() {
		setSalario(getSalario() + complemento);
		return getSalario();

	}

	@Override
	public void MostrarDetalles() {
		JOptionPane.showMessageDialog(null, "\nTipo : Permanente "+ "\nNombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() + "\nComplementos: " + complemento);

	}
}
