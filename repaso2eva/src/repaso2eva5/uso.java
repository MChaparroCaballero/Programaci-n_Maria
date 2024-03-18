package repaso2eva5;

public class uso {

	public static void main(String[] args) {
		/*
		 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
		 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
		 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
		 * horas, los minutos y los segundos respectivamente. Crea el método toString
		 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
		 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
		 * programa de prueba para comprobar que la clase funciona bien
		 */
		Tiempo tiempo1 = new Tiempo(0, 30, 40);
		Tiempo tiempo2 = new Tiempo(0, 35, 20);

		System.out.println("Tiempo 1: " + tiempo1);
		System.out.println("Tiempo 2: " + tiempo2);

		tiempo1.suma(tiempo2);
		System.out.println("\nSuma de tiempo 1 y tiempo 2: " + tiempo1);

		tiempo1 = new Tiempo(1, 30, 40);
		tiempo2 = new Tiempo(0, 35, 20);

		System.out.println("\nTiempo 1: " + tiempo1);
		System.out.println("Tiempo 2: " + tiempo2);

		tiempo1.resta(tiempo2);
		System.out.println("\nResta de tiempo 1 y tiempo 2: " + tiempo1);
	}

}
