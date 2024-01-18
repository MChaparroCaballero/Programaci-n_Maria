package ejercicios_POO_III_1;

import java.util.Scanner;

public class Uso_RelojAlarma {

	public static void main(String[] args) {
		//
		Scanner lector;
		lector = new Scanner(System.in);
		
		//los parametros metidos por el usuario//
		int nhoras = lector.nextInt();
		int nminutos = lector.nextInt();
		boolean iniciarAlarma = false;
		int eleccion = lector.nextInt();
		int crearAlarma = lector.nextInt();//para crear nuevas alarmas//
		int activacion = lector.nextInt();//para activar las alarmas//

		System.out.println("Desea crear una alarma? 1)si 2) no");
		if (crearAlarma == 1) {
			iniciarAlarma = true;
		} else {
			iniciarAlarma = false;
		}
		// bucle donde creamos las alarmas//
		while (iniciarAlarma = true) {
			
			// nueva instancia de la clase//
			RelojAlarma nueva = new RelojAlarma();
			
			//metemos las horas y minutos de las alarmas//
			System.out.println("Que hora quiere que sea la alarma(horas)");
			nueva.set_horaAlarma(nhoras);
			System.out.println("Que hora quiere que sea la alarma(minutos)");
			nueva.set_minutosAlarma(nminutos);
			
			//activamos o no las alarmas//
			System.out.println("Quiere activar su alarma? 1)Si 2)No");
			if (activacion == 1) {
				nueva.set_activada(true);
			} else {
				nueva.set_activada(false);
			}
			
			//le damos opcion de crear otra alarma o no, si crea otra empieza otra el bucle sigue si no la empieza el bucle para//
			System.out.println("Desea crear otra alarma? 1)si 2)no");
			if (eleccion == 2) {
				iniciarAlarma = false;
			} else {
				iniciarAlarma = true;
			}

		}

	}

}
