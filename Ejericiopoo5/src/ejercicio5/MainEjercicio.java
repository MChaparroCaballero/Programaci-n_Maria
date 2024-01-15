package ejercicio5;

public class MainEjercicio {

	public static void main(String[] args) {
		/*
		 * Ejercicio 5: Crear una Clase "Celular" 1.Definición de la Clase: - Atributos:
		 * `modelo (String)`, `almacenamiento (int)`, `camaraMP (int)`. - Método
		 * Constructor: inicializar con modelo="Genérico", almacenamiento=64,
		 * camaraMP=12. 2.En el Main: - Instanciar un objeto Celular. - Imprimir el
		 * modelo y la capacidad de almacenamiento del celular
		 */
		
		Celular Huawei = new Celular();
		System.out.println("El modelo " + Huawei.modelo + " de huawei tiene una capacidad de almacenamiento de " + Huawei.almacenamiento + " megas");

	}

}
