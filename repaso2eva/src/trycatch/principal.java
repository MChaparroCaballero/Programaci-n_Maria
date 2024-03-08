package trycatch;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

public class principal {

	// hacemos aleatorio//
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	// para meter fechas validas//
	public static LocalDate fecha() {
		LocalDate fecha = null;
		while (true) {
			try {

				fecha = LocalDate.of(alea(2000, 2050), alea(1, 12), alea(1, 31));
				return fecha;
			} catch (DateTimeException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void main(String[] args) {
		// un arraylist con 25 fechas aleatorias donde los años vayan del 2000 al 2050
		// los meses del 1-12 y de los días de 1-31//

		ArrayList<LocalDate> lista = new ArrayList<LocalDate>();

		for (int i = 0; i <= 25; i++) {
			lista.add(fecha());
		}

		for (LocalDate elemento : lista) {
			System.out.println(elemento);

		}
	}

}
