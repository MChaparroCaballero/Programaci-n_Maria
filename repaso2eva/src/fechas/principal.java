package fechas;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class principal {

	// en mi empresa pagan los ultimos viernes de cada mes quiero saber el año el
	// curso la fecha en la que les pagan en cada uno de estos meses//
	// para meter fechas validas//

	// hacemos aleatorio//
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

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

	public static LocalDate viernes (LocalDate fecha) {
			
			while(fecha.getDayOfWeek()!= DayOfWeek.FRIDAY) {
				fecha= fecha.minusDays(1);
			}
			return fecha;
		}
	
	
	
	public static void main(String[] args) {
		// un arraylist con 25 fechas aleatorias donde los años vayan del 2000 al 2050
		// los meses del 1-12 y de los días de 1-31//

		ArrayList<LocalDate> lista = new ArrayList<LocalDate>();

		for (int i = 0; i <= 25; i++) {
			lista.add(fecha());
		}

		for (LocalDate elemento : lista) {
			System.out.println(elemento + "" + elemento.getDayOfWeek());

			LocalDate fecha = LocalDate.now();
			int año = fecha.getYear();

			LocalDate fecha2 = LocalDate.now(), fecha3;
			for (int i = 1; i <= 12; i++) {
				fecha3 = fecha.of(fecha2.getYear(), i, 1);
				fecha3 = fecha3.plusMonths(1).minusDays(1);
				System.out.println(viernes(fecha3));
			}
		}

	}
}
