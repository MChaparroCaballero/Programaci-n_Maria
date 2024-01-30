package ejercicios_POO_VI_3;

import javax.swing.JOptionPane;

public class Uso_Comprovador_edad_votar {

	public static void main(String[] args) {

		/*
		 * instanciamos el objeto utilizando el joption pane para que el usuario meta
		 * los valores de nombre y edad el voto esta vacio por ahora, solo se cambiara
		 * si cumple los requisitos de edad
		 */
		Comprovador_edad_votar voto1 = new Comprovador_edad_votar(
				JOptionPane.showInputDialog("Introduzca su nombre completo"),
				Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad")), "");

		/*
		 * veemos si cumple los requisitos de edad minima comprovando la edad
		 * introducida con la edad minima en caso de ser cumplida puede
		 * introducir/cambiar el partido a votar
		 */
		if (voto1.getEdad() >= voto1.getEdad_minima()) {
			voto1.setvoto(
					(JOptionPane.showInputDialog("Introduzca el nombre del partido que quiere votar").toLowerCase()));
			JOptionPane.showMessageDialog(null, "\nNombre: " + voto1.getNombre() + "\nEdad :" + voto1.getEdad()
					+ "\nPartido votado: " + voto1.getvoto());
		} else {
			/*en caso de no cumplir los requisitos de edad minima te muestra este mensaje y
			 te manda a tu casa*/
			JOptionPane.showMessageDialog(null,
					"Error, o ha introducido su edad mal o no cumple lo requesitos para votar");
		}

	}
}