package EJERCICIO3;

public class Uso_deEstudiante {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3: Clase Estudiante Objetivo: Construye una clase Estudiante con
		 * tres propiedades privadas: nombre (String), edad (int), y calificacion
		 * (double). Implementa los getters y setters correspondientes. Desafío
		 * adicional: Asegúrate de que la edad sea un número positivo y que la
		 * calificación esté en el rango de 0 a 100.
		 */

		Estudiante once = new Estudiante();//instanciamos//
		once.set_Nombre("Jimena");//los nuevos valores del setter//
		once.set_Edad(18);
		once.set_calificacion(5.5);

		System.out.println("El estudiante" + once.get_nombre() + ",su edad" + once.get_Edad() + " y su calificación"
				+ once.get_calificacion());

		
	}

}
