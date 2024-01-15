package ejer1;

public class Crear_una_clase_lampara {

	public static void main(String[] args) {
		/*
		 * Crear una Clase "Lámpara" 1.Definición de la Clase: - Atributos: `tipo
		 * (String)`, `potencia (int)`, `color (String)`. - Método Constructor:
		 * inicializa los atributos con valores predeterminados, por ejemplo,
		 * tipo="LED", potencia=60, color="Blanco". 2.En el Main: - Instanciar un objeto
		 * de la clase Lámpara. - Imprimir los atributos del objeto creado.
		 */
		
		
		Clase_lampara Blanca = new Clase_lampara();
		System.out.println(" Mi lampara es de tipo " + Blanca.tipo + " De una potencia de " + Blanca.potencia + " de color " + Blanca.color);

	}

}
