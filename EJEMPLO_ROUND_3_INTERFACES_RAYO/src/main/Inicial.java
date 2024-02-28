package main;

import pOLIMORFISMOiNTERFACE.Futbolista;

public class Inicial {

	public static void main(String[] args) {
		Futbolista rayo = new Futbolista(1, "Jose manuel", "Rayo", 40, 4, "medio");
		rayo.concentrarse();
		rayo.entrenar();
		rayo.jugarPartido();
		rayo.viajar();
	}

}
