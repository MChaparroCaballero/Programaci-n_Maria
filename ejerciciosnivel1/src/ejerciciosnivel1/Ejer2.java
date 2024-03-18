package ejerciciosnivel1;

public class Ejer2 {

	public static void main(String[] args) {
		// Declara 2 variables numéricas (con el valor que desees), he indica cual es
		// mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
		// para comprobar que funciona.

		int a = 15;
		int b = 20;

		if (b > a) {
			System.out.println(b + " es mayor que " + a);
		} else if (b == a) {
			System.out.println(b + " es igual a " + a);
		} else {
			System.out.println(b + " es menor que " + a);
		}
	}

}
