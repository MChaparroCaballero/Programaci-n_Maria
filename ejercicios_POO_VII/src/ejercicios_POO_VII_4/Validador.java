package ejercicios_POO_VII_4;

import javax.swing.JOptionPane;

public class Validador {

	private static String contra;

	Validador(String contra) {// constructor//
		this.contra = contra;

	}

	public String getContra() {// getter//
		return contra;
	}

	public void setContra(String contra) {// setter//
		this.contra = contra;
	}

	// Método para validar si una cadena es un número
	public static void esNumero(String getContra) {
		try {

			/*
			 * me intenta pasarlo a un decimal, y ya que esto seria imposible para letras si
			 * lo consigue tiene que ser un numero
			 */
			Double.parseDouble(contra);
			// ventana de mensaje//
			JOptionPane.showMessageDialog(null, "La cadena es un número.");

		} catch (NumberFormatException e) {/*
											 * que no es un numero o no tiene formato de numero pues te pone el mensaje
											 * de que no lo es
											 */
			JOptionPane.showMessageDialog(null, "La cadena no es un número.");

		}
	}

	// Método para validar si un número está en un rango específico
	public static void estaEnRango(String contra) {
		// creamos los limites del rango//
		double rangomin = 0;
		double rangomax = 100;
		// pasamos double el string para poder compararlo con los limites del rango//
		double num = Double.parseDouble(contra);
		if (num >= rangomin && num <= rangomax) {
			// si esta dentro de los limites saca una ventana de mensaje diciendolo//
			JOptionPane.showMessageDialog(null, "La cadena es un número entre " + rangomin + " y " + rangomax);
		} else {
			// ventana de mensaje diciendo lo contrario//
			JOptionPane.showMessageDialog(null,
					"La cadena es un número fuera del rango de " + rangomin + " y " + rangomax);
		}
		// volvemos a convertirlo en string para que no de errores con los otros
		// metodos//
		contra = String.valueOf(num);

	}

	// Método para validar si una cadena es una letra
	public static void esLetra(String contra) {
		// el matches comprobara que el string contenga o ester formado por alguna de
		// las letras del alfabeto sea mayuscula o minuscula//
		if (contra.matches("[a-zA-Z]+")) {
			// si la condicion se cumple saca una ventana de mensaje verificando que la
			// cadena es una letra o esta formada por letras//
			JOptionPane.showMessageDialog(null, "La cadena es una letra / formada por letras");
		} else {
			// ventana de mensaje del caso contrario//
			JOptionPane.showMessageDialog(null, "La cadena no es una letra.");
		}

	}

}
