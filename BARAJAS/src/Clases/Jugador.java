package Clases;

public class Jugador {
	private String Nombre;
	private Carta[] naipes;//las cartas elegidas de cada jugador//

	public Jugador(String nombre) {
		super();
		Nombre = nombre;
		naipes = new Carta[5];
	}

	public void asignar(int i, Carta c) {
		naipes[i] = c;//metodo para asignar a nuestraarray personal de cada juugador sus cartas elegidas//
	}

	public Carta[] obtener() {//para devolver el array de naipes//
		return naipes;
	}
}
