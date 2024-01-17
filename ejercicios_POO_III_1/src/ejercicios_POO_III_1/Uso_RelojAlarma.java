package ejercicios_POO_III_1;

import java.util.Scanner;

public class Uso_RelojAlarma {

	public static void main(String[] args) {
		//
		int i = 1;
		Scanner lector;
		lector = new Scanner(System.in);
		int nhoras = lector.nextInt();
		int nminutos = lector.nextInt();

		// para introducir nuevos tiempos en los parametros//
		while (i > 0) {
			// nueva instancia de la clase//
			RelojAlarma nueva = new RelojAlarma();
			nueva.set_horaAlarma(nhoras);
			nueva.set_minutosAlarma(nminutos);
			i = 0;
		}

	}

	/*
	 * public static int declaramostiempodeAlarma(int horas, int minutos) { int
	 * declaramostiempodeAlarma = horas }
	 */

}
