package ejerciciodefunciones;

public class Ejer2funcionconversion {

	public static void main(String[] args) {
		// 2. Crea una función en Java que convierta kilómetros a millas.

		System.out.println("55 kilometros son " + conversion(55) + " millas");

	}

	private static double conversion(double num1) {

		double conversion = (double) (num1 * 0.62);
		return conversion;
	}
}
