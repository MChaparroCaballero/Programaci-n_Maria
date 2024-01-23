package ejercicios_POO_IV_3;

import javax.swing.JOptionPane;

public class Uso_curso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();

        // Solicitar al usuario ingresar el nombre del curso y la calificación
        curso.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del curso:"));

        curso.setCalificacion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación:")));

        // Obtener la calificación en formato de letra
        String calificacionLetra = obetenercalificacionletra(curso.getCalificacion());
        	

        // Mostrar el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "Nombre del curso: " + curso.getNombre() +
                "\nCalificación: " + curso.getCalificacion() +
                "\nEstado: " + calificacionLetra);
    }

	
	//metodo para obtener mensaje segun calificacion//
	private static String obetenercalificacionletra(double calificacion) {
		if (calificacion >= 5 && calificacion <= 6.9) {

			return "Aprobado";

		} else if (calificacion >= 7 && calificacion <= 8.9) {
			return "Notable";
		} else if (calificacion >= 9 && calificacion <= 10) {
			return "Sobresaliente";
		} else if (calificacion >= 0 && calificacion <= 4.9) {
			return "Suspenso";
		} else {
			return "Error, valor fuera del sistema permitido";}

	
	}
}
	


