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
		int eleccion = lector.nextInt();//para cerrar arreglar alarmas y tiempos//
		int crear = lector.nextInt();// para crear nuevas alarmas//
		int activacion = lector.nextInt();// para activar las alarmas//
		
		InputStreamReader info;
		BufferedReader buffer;
		info = new InputStreamReader(System.in);
		buffer = new BufferedReader(info);
		
		// los parametros metidos por el usuario//
		String tiempo = buffer.readLine();//tiempo metido en string por usuario//
		String tiempoA = buffer.readLine();//tiempo metido en string por usuario//
		boolean iniciarAlarma = false;
		

		//para empezar el proceso de crear alarmas//
		System.out.println("Desea crear una alarma? 1)si 2) no");
		
		if (crear == 1) {
			iniciarAlarma = true;
		} else {
			iniciarAlarma = false;
		}
		
		// bucle donde creamos las alarmas//
		while (iniciarAlarma = true) {

			// nueva instancia de la clase//
			RelojAlarma alarma = new RelojAlarma();
				// metemos las horas y minutos de las alarmas//

				System.out.println("Que hora quiere que sea la alarma(horas)");

				alarma.set_horaActual(tiempo);

				// activamos o no las alarmas//

				
				System.out.println("Quiere activar su alarma? 1)Si 2)No");
				if (activacion == 1) {
					alarma.set_activada(true);
				} else {
					alarma.set_activada(false);
				}
				
				System.out.println(alarma.get_horaActual() + alarma.get_horaAlarma() + "esta todo correcto?1)Si 2)No");
				// le damos opcion de crear otra alarma o no, si crea otra empieza otro vez el bucle
				// sigue si no la empieza el bucle para//
				
				if (eleccion == 2) {
					iniciarAlarma = false;
					buffer.close();
				} else {
					iniciarAlarma = true;
					alarma.set_horaActual(tiempoA);
					alarma.set_horaAlarma(tiempo);
				}
				
				lector.close();
				alarma.verificacionAlarma();
				
				}
			}

		
}
