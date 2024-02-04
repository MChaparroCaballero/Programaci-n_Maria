package ejercicios_POO_VII_4;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Uso_deValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos una instancia de la clase//
		Validador contrasena = new Validador(JOptionPane.showInputDialog("Ingresa una cadena:"));
		
		//primero intentamos ver si es un numero, sino probamos a ver si es una letra o conjunto de letras y sino mensaje de que no es ninguna//
		try {

			Validador.esNumero(contrasena.getContra());
			Validador.estaEnRango(contrasena.getContra());

		} catch (NumberFormatException e) {
			Validador.esLetra(contrasena.getContra());
		} catch (InputMismatchException a) {
			JOptionPane.showMessageDialog(null, "La cadena no es ni un numero ni una letra");

		}	

	}

}
