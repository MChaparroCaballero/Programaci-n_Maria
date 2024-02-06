package ejercicios_POO_VIII_2;

import javax.swing.JOptionPane;

public class Teste_herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos una nueva instancia//
		Estudiante maria = new Estudiante(JOptionPane.showInputDialog("ingrese su nombre"),Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad")),JOptionPane.showInputDialog("ingrese su carrera de estudio"));
		
		//mostramos la información de los atributos de la clase//
		JOptionPane.showMessageDialog(null, "\nNombre: " + maria.getNombre() + "\nEdad: " + maria.getEdad() + "\nCarrera: " + maria.getCarrera());
	}

}
