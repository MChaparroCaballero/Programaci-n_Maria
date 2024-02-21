package ejercicios_POO_XII_interfaces_4;

public class Uso_de_Exportables {

	public static void main(String[] args) {
		// creamos una nueva instancia de CSV//
		CSV notas = new CSV();
		// llamamos al metodo//
		notas.exportarDatos();

		// creamos una nueva instancia de pdf//
		PDF proyecto_final = new PDF();
		// llamamos al metodo//
		proyecto_final.exportarDatos();
	}

}
