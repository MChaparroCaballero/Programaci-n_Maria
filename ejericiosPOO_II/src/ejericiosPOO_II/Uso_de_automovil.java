package ejericiosPOO_II;

public class Uso_de_automovil {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1: Clase Automovil Objetivo: Crear una clase Automovil con dos
		 * propiedades privadas: marca (String) y modelo (String). Implementa los
		 * métodos getter y setter para estas propiedades. Desafío adicional: Asegúrate
		 * de que el modelo no sea nulo ni esté vacío en el setter.
		 */

		
		Automovil nuevo = new Automovil();//instanciamos//
		
		//ponemos los nuevos valores del setter//
		nuevo.set_marcas("Honda");
		nuevo.set_modelo("Honda Civic");
		
		System.out.println("La marca del automovil " + nuevo.get_marcas());
		System.out.println("El modelo del automovil " + nuevo.get_modelo());
		
	}

}
