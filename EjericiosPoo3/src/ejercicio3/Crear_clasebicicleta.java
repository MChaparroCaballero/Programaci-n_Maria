package ejercicio3;

public class Crear_clasebicicleta {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3: Crear una Clase "Bicicleta" 1.Definición de la Clase: -
		 * Atributos: `numRuedas (int)`, `tipo (String)`, `tamaño (int)`. - Método
		 * Constructor: establecer valores iniciales, por ejemplo, numRuedas=2,
		 * tipo="Montaña", tamaño=26. 2.En el Main: - Instanciar una Bicicleta. -
		 * Imprimir el tipo y tamaño de la bicicleta.
		 */

		Bicicleta nueva = new Bicicleta();
		System.out.println("La nueva bicicleta de " + nueva.tipo + " tiene un tamaño de " + nueva.tamaño );
		
	}

}
