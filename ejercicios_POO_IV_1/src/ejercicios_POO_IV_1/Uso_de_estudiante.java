package ejercicios_POO_IV_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uso_de_estudiante {

	public static void main(String[] args) {

		// Crear un array para almacenar los objetos Estudiante
		Estudiante[] estudiantes = new Estudiante[3];

		// Llenar el array con objetos Estudiante creados con datos ingresados por el
		// usuario
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i] = crearEstudiante();
		}
		
		// Mostrar información utilizando getters y un bucle
			for (Estudiante estudiante : estudiantes) {
				mostrarInformacionEstudiante(estudiante);
			}
		
	}


	// Método para crear un objeto Estudiante con datos introducidos por el usuario

	private static Estudiante crearEstudiante() {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del estudiante:");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad del estudiante:"));
		String grado = JOptionPane.showInputDialog("Cual es el grado del estudiante:");

		return new Estudiante(nombre, edad, grado);
	}

	// Método para mostrar la información de un estudiante utilizando getters
	private static void mostrarInformacionEstudiante(Estudiante estudiante) {
		JOptionPane.showMessageDialog(null, "Nombre: " + estudiante.get_nombre() + "\nEdad: " + estudiante.get_edad()
				+ "\nGrado: " + estudiante.get_grado());

	}

}
