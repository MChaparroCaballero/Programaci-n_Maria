package repaso2eva_2;

public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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