package ejercicios_POO_III_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Uso_RelojAlarma {

	public static void main(String[] args) throws IOException {
		//
		boolean iniciarAlarma = false;
		Scanner lector;
		lector = new Scanner(System.in);
		InputStreamReader info;
		BufferedReader buffer;
		info = new InputStreamReader(System.in);
		buffer = new BufferedReader(info);
		int i = 0;// variable random para el segundo bucle//

		System.out.println("Desea crear una alarma? 1)si 2) no");
		int eleccion = lector.nextInt();// para que el usuario introduzca su opcion//

		if (eleccion == 1) {
			iniciarAlarma = true;// una variable que iniciara o no el bucle del proceso de alarmas//
		} else {
			iniciarAlarma = false;
		}

		// bucle donde creamos las alarmas//
		while (iniciarAlarma == true) {

			// nueva instancia de la clase//
			RelojAlarma alarma = new RelojAlarma();

			// metemos las horas de la alarma//
			System.out.println("Que hora quiere que sea la alarma(horas)");
			String tiempo = buffer.readLine();// tiempo metido en string por usuario//
			alarma.set_horaAlarma(tiempo);// cambiamos el setter de la clase con lo introducio por el usuario//

			// activamos o no las alarmas//
			System.out.println("Quiere activar su alarma? 1)Si 2)No");
			eleccion = lector.nextInt();
			if (eleccion == 1) {
				alarma.set_activada(true);
			} else {
				alarma.set_activada(false);
			}

			// verificamos que la hora de alarma y actual no sean iguales//
			alarma.verificacionAlarma();
			System.out.println("SU ALARMA ESTA PROGRAMADA A LAS " + alarma.get_horaAlarma() + " son las "
					+ alarma.get_horaActual() + " esta todo correcto?1)Si 2)No");

			// le damos opcion de modificar los datos de hora actual y alarma en caso de
			// error o de actualización o cerrar proceso//

			int eleccion2 = lector.nextInt();
			while (i < 3) {
				switch (eleccion2) {
				case 1:// todo esta correcto y cerramos proceso//
					iniciarAlarma = false;
					buffer.close();
					System.out.println("Gracias por utilizar nuestro sistema");
					i = 3;
					break;
				case 2:// noe sta correcto todos los datos asique haremos esto hasta que lo esten//
					System.out.println("Que hora actual deberia ser?");
					String tiempoA = buffer.readLine();// tiempo metido en string por usuario//
					alarma.set_horaActual(tiempoA);
					System.out.println("A que hora deberia ser la alarma?");
					String tiemponuevo = buffer.readLine();// tiempo metido en string por usuario//
					alarma.set_horaAlarma(tiemponuevo);
					System.out.println("SU ALARMA ESTA PROGRAMADA A LAS " + alarma.get_horaAlarma() + " son las "
							+ alarma.get_horaActual() + " esta todo correcto?1)Si 2)No");
					eleccion2 = lector.nextInt();
					break;
				}
			}

		}
		// cerramos bucle de proceso de alarmas//
		iniciarAlarma = false;

	}
}
