package ejercicios_POO_IV_2;

import javax.swing.JOptionPane;

import ejercicios_POO_IV_1.Estudiante;

public class Uso_Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un array para almacenar los objetos Estudiante
		
		Empleado[] nomina = new Empleado[4];

		// Llenar el array con objetos nomina creados con datos ingresados por el
		// usuario
		for (int i = 0; i < nomina.length; i++) {
			nomina[i] = crearEmpleado();
		}
		
		// Mostrar información utilizando getters y un bucle
			for (Empleado trabajador : nomina) {
				mostrarInformacionEmpleado(trabajador);
			
			}
		
			
			
			
	}


	// Método para crear un objeto Empleado con datos introducidos por el usuario

	private static Empleado crearEmpleado() {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del trabajador:");
		int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas del trabajador:"));
		double tarifaHora = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la tarifa por hora trabajada:"));
		double salario = horasTrabajadas * tarifaHora;
		return new Empleado (nombre, horasTrabajadas, tarifaHora, salario);
	
		
	}

	
	// Método para mostrar la información de un trabajador utilizando getters
	private static void mostrarInformacionEmpleado(Empleado trabajador) {
		JOptionPane.showMessageDialog(null, "Nombre: " + trabajador.get_nombre() + "\nhoras Trabajadas: " + trabajador.get_horasTrabajadas()
				+ "\nTarifa hora: " + trabajador.get_tarifaHora() + "\nsalario: " + trabajador.get_salario());

	}
	
}