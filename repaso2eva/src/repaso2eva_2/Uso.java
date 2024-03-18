package repaso2eva_2;

public class Uso {

	public static void main(String[] args) {
		/*
		 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
		 * Lagarto. Crea,al menos, tres métodos específicos de cada clase y redefine
		 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
		 * programa en el que se instancien objetos y se les apliquen métodos
		 */

		// Crear instancias de diferentes animales
		Gato gato = new Gato();
		Perro perro = new Perro();
		Canario canario = new Canario();
		Pinguino pinguino = new Pinguino();
		Lagarto lagarto = new Lagarto();

		// Aplicar algunos métodos específicos a cada animal
		System.out.println("--- Acciones de los animales ---");
		gato.ronronear();
		perro.ladrar();
		canario.cantar();
		pinguino.nadar();
		lagarto.tomarSol();

		// Ejemplos de métodos heredados
		System.out.println("--- Métodos heredados ---");
		gato.comer();
		perro.moverse();
		canario.emitirSonido();
		pinguino.comer();
		lagarto.emitirSonido();
	}
}