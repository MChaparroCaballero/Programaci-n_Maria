package main;

import pOLIMORFISMOiNTERFACE.Entrenador;
import pOLIMORFISMOiNTERFACE.Futbolista;

public class Inicial {

	public static void main(String[] args) {
		Futbolista rayo = new Futbolista(1, "Jose manuel", "Rayo", 40, 4, "medio");
		Entrenador pepe = new Entrenador(2,"Juan Pedro", "Ruiz",55,1);
		rayo.concentrarse();
		rayo.entrenar();
		rayo.jugarPartido();
		rayo.viajar();
		System.out.println(rayo);
		pepe.concentrarse();
		pepe.entrenar();
		pepe.jugarPartido();
		pepe.viajar();
		System.out.println(pepe);
	}

}
