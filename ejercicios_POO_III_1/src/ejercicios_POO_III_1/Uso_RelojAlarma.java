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
		Scanner lector;
		lector = new Scanner(System.in);
		InputStreamReader info;
		BufferedReader buffer;
		info = new InputStreamReader(System.in);
		buffer = new BufferedReader(info);

		//creamos array y longitud//
		RelojAlarma[] alarmas = new RelojAlarma[10];
		
		// los parametros metidos por el usuario//
		String nhoras = buffer.readLine();//tiempo metido en string por usuario//
		boolean iniciarAlarma = false;
		int eleccion = lector.nextInt();
		int crearAlarma = lector.nextInt();// para crear nuevas alarmas//
		int activacion = lector.nextInt();// para activar las alarmas//
		LocalDateTime nhorasDateTime = stringToLocalDateTime(nhoras);//para pasar el tiempo de string a datetimelocal usando una funcion que lo deja en hh y mm//

		//para empezar el proceso de crear alarmas//
		System.out.println("Desea crear una alarma? 1)si 2) no");
		if (crearAlarma == 1) {
			iniciarAlarma = true;
		} else {
			iniciarAlarma = false;
		}
		// bucle donde creamos las alarmas//
		while (iniciarAlarma = true) {

			// nueva instancia de la clase dentro del array//
			for (int numAlarmas = 0; numAlarmas < alarmas.length; numAlarmas++) {
				alarmas[numAlarmas] = new RelojAlarma();

				// metemos las horas y minutos de las alarmas//

				System.out.println("Que hora quiere que sea la alarma(horas)");

				alarmas[numAlarmas].set_horaAlarma(nhorasDateTime);

				// activamos o no las alarmas//

				System.out.println("Quiere activar su alarma? 1)Si 2)No");
				if (activacion == 1) {
					alarmas[numAlarmas].set_activada(true);
				} else {
					alarmas[numAlarmas].set_activada(false);
				}

				// le damos opcion de crear otra alarma o no, si crea otra empieza otro vez el bucle
				// sigue si no la empieza el bucle para//
				
				System.out.println("Desea crear otra alarma? 1)si 2)no");
				if (eleccion == 2) {
					iniciarAlarma = false;
				} else {
					iniciarAlarma = true;
				}

				//para actualizar la hora actual//
				alarmas[numAlarmas].set_horaActual(LocalDateTime.now());

				//en caso de que la hora actual y la de la alarma sean iguales suena un mensaje//
				if (alarmas[numAlarmas].get_horaActual().equals(alarmas[numAlarmas].get_horaAlarma())) {
					System.out.println("Alarma sonando");
				}
			}

		}

	}

	// para cambiar de string a date time local//
	public static LocalDateTime stringToLocalDateTime(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);
		return dateTime;
	}
}
