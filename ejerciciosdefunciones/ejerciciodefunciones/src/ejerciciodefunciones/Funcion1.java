package ejerciciodefunciones;

public class Funcion1 {

	public static void main(String[] args) {
		// 1. Escribe una función en Java para calcular el promedio de tres números.

		System.out.println(promedio(10, 5, 4));
		// llamamos al metodo y le ponemos los parametros a ejecutar (lo de aqui)
	}

	private static double promedio(double num1, double num2, double num3) {
		// entre parentesisi ponemos parametros

		double promedio = (num1 + num2 + num3) / 3;
		// lo que hace el meetodo
		return promedio;
		// lo que devuelve el metodo
	}
}
