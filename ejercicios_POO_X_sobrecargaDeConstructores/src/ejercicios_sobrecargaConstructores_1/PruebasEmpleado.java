package ejercicios_sobrecargaConstructores_1;
import javax.swing.JOptionPane;
public class PruebasEmpleado {

	public static void main(String[] args) {
		//creamos una instancia con el primer tipo de constructor//
		Empleado alex = new Empleado("alex",2500,"ventas");
		//creamos instancia con el segundo tipo de constructor//
		Empleado mauro = new Empleado("mauro",5000,2);
		
		//mostramos ventana con los datos del primero//
		JOptionPane.showMessageDialog(null,"\nnombre: " + alex.getNombre() + "\nSalario: " + alex.getSalario() + 
				"\nDepartamento: "	 + alex.getDepartamento());
		
		//mostramos ventana con los datos del segundo//
		JOptionPane.showMessageDialog(null,"\nnombre: " + mauro.getNombre() + "\nSalario: " + mauro.getSalario());

	}

}
