package ejercicio2;

public class Crear_una_clase_libro {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Crear una Clase "Libro" 1.Definición de la Clase: - Atributos:
		 * `titulo (String)`, `autor (String)`, `numPaginas (int)`. - Método
		 * Constructor: asigna valores predeterminados, por ejemplo,
		 * titulo="Sin nombre", autor="Desconocido", numPaginas=100. 2.En el Main: -
		 * Crear un objeto de la clase Libro. - Mostrar en consola el título y autor del
		 * libro.
		 */
		
		Libro favorito = new Libro();
		System.out.println("El libro " + favorito.titulo + " fue escrito por " + favorito.autor);
		

	}

}
