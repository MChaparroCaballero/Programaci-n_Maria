package ejerciciosnivel1;

public class Ejer12 {

	public static void main(String[] args) {
		// muestrame los numeros del 1 al 100(ambos incluidos) que sean divisibles entre
		// 2 y 3 utiliza el bucle que desees

		int num = 1;
		while (num <= 100) {
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
