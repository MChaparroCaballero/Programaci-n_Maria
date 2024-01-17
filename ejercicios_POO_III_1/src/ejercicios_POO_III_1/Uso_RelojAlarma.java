package ejercicios_POO_III_1;

import java.util.Scanner;

public class Uso_RelojAlarma {

	public static void main(String[] args) {
		// 
		Scanner lector;
		lector = new Scanner(System.in);
		int nhoras = lector.nextInt();
		int nminutos = lector.nextInt();
		
		
		//nueva instancia de la clase//
		RelojAlarma nueva = new RelojAlarma();
		
		//para introducir nuevos tiempos en los parametros//
		nueva.set_horaAlarma(nhoras);
		nueva.set_minutosAlarma(nminutos);

	}
	
	/*public static int declaramostiempodeAlarma(int horas, int minutos) {
		int declaramostiempodeAlarma = horas
	}*/


}
