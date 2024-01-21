package ejercicios_POO_III_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uso_deHotel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader info;
		info = new InputStreamReader(System.in);
		BufferedReader lector;
		lector = new BufferedReader(info);
		Scanner scanner;
		scanner = new Scanner(System.in);
		Hotel hotel = new Hotel(); // instanciar la clase
		int i = 0;

		
		//los valores de las variables, estan son dos predefinidas para comprobar que funciona bien todo y no puede escoger el usuario dos del mismo numero//
		Habitacion habitacion10 = new Habitacion(10, "doble");
		Habitacion habitacion3 = new Habitacion(3, "suite");
		
		//las añadimos al hotel//
		hotel.habitaciones.add(habitacion3);
		hotel.habitaciones.add(habitacion10);
		
		//las reservamos//
		hotel.reservarHabitacion(10);
		hotel.reservarHabitacion(3);

		while (i < 3) {
			System.out.println("Pulse 1 para hacer una reserva, pulse 2 para cancelar una reserva, 3 salir del menu");
			int eleccion = scanner.nextInt();
			switch (eleccion) {

			case 1: // reserva habitacion//
				System.out.println("Bajo que nombre quiere la reserva");
				String nombre = lector.readLine();
				System.out.println("que numero de habitacion quiere");
				int num = scanner.nextInt();
				System.out.println("Que tipo de habitación quiere, simple , doble, suite");
				String type = lector.readLine();

				// carga los valores de las variables
				Habitacion habitacion1 = new Habitacion(num, type);

				// añadir habitaciones al hotel
				hotel.habitaciones.add(habitacion1);

				hotel.reservarHabitacion(num);

				break;

			case 2:// cancelar reservas
				System.out.println("Que numero es la reserva que quiere cancelar");
				num = scanner.nextInt();
				System.out.println("Que tipo de habitacion es la reserva que quiere cancelar");
				type = lector.readLine();
				hotel.cancelarReserva(num);
				break;

			case 3:// salir del menu//
				System.out.println("Gracias por su tiempo");
				i = 3;
				lector.close();
				scanner.close();
			}
		}
	}
}
