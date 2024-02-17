package ejercicios_POO_X_sobrecargaDeConstructores_5;

import javax.swing.JOptionPane;

public class Uso_deEstudiante {

	public static void main(String[] args) {
		// creamos instancia con el primero constructor//

		Estudiante pablo = new Estudiante(JOptionPane.showInputDialog(null, "Ingrese su nombre: "),
				JOptionPane.showInputDialog(null, "Ingrese su apellido: "),
				Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: ")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su promedio academico: ")));

		// creamos instancia con el segundo constructor//
		Estudiante lucia = new Estudiante(JOptionPane.showInputDialog(null, "Ingrese su nombre: "),
				Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: ")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su promedio academico: ")));

		// creamos instancia con el tercer constructor//
		Estudiante paula = new Estudiante(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: ")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su promedio academico: ")),
				JOptionPane.showInputDialog(null, "Ingrese su nombre: "));

		// mostramos la info de los tres//
		JOptionPane.showMessageDialog(null, "\nNombre: " + pablo.getNombre() + "\nApellido: " + pablo.getApellido()
				+ "\nEdad: " + pablo.getEdad() + "\nPromedio: " + pablo.getPromedioA());
		JOptionPane.showMessageDialog(null, "\nNombre: " + lucia.getNombre() + "\nEdad: " + lucia.getEdad()
				+ "\nPromedio: " + lucia.getPromedioA());
		JOptionPane.showMessageDialog(null, "\nEdad: " + paula.getEdad() + "\nPromedio: " + paula.getPromedioA()
				+ "\nNombre: " + paula.getNombre());
	}

}
