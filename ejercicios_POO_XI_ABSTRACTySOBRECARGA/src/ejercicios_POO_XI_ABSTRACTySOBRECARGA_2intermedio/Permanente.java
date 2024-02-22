package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;
import javax.swing.JOptionPane;
public class Permanente extends Empleado {

	double complemento;

	public Permanente(String nombre, int id, double salario) {
		super(nombre, id, salario);
		// constructor basico//
	}

	
	public Permanente(String nombre, int id, double salario, double complemento) {//constructor propio//
		super(nombre, id, salario);
		this.complemento = complemento;
	}





	public double getComplemento() {//getter//
		return complemento;
	}


	public void setComplemento(double complemento) {//setter//
		this.complemento = complemento;
	}

	@Override
	public double CalcularSalario() {//calculamos el salario nuevo//
		setSalario(getSalario() + complemento);
		return getSalario();

	}

	@Override
	public void MostrarDetalles() {//mostramos detalles//
		JOptionPane.showMessageDialog(null, "\nTipo : Permanente "+ "\nNombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() + "\nComplementos: " + complemento);

	}
}
