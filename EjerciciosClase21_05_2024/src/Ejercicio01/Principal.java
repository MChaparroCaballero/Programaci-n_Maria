package Ejercicio01;

import java.util.Arrays;

public class Principal {
	public static void cargar(Serie l[]) {
		l[0] = new Serie();
		l[1] = new Serie("Juego de tronos", "juan");
		l[2] = new Serie("simpsons", 25, "humor", "pepe");
		l[3] = new Serie("star wars", 12, "accion", "pedro");
		l[4] = new Serie("principito", 5, "niños", "su madre");

	}

	public static void cargar2(Videojuego l[]) {
		l[0] = new Videojuego();
		l[1] = new Videojuego("juan", 22);
		l[2] = new Videojuego("simpsons", 25, "humor", "pepe");
		l[3] = new Videojuego("star wars", 12, "accion", "pedro");
		l[4] = new Videojuego("principito", 5, "niños", "su madre");

	}

	
	public static void contarS(Serie b ) {
		int c=0;
		
			if(b.isEntregado()==true) {
				c++;
				System.out.println(b+" "+c);
			}
		}
	
	
	
	public static void contarV(Videojuego listav) {
		int c=0;
			if(listav.isEntregado()==true) {
				c++;
				System.out.println(listav+" "+c);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie listaSeries[] = new Serie[5];
		Videojuego listav[] = new Videojuego[5];
		cargar(listaSeries);
		cargar2(listav);

		for (int i = 0; i <= 3; i++) {
			listav[i].entregar();
			listaSeries[i].entregar();

		}

		for(int i=0; i<=listav.length;i++) {
			contarV(listav[i]);
			contarS(listaSeries[i]);
		}
		// con el compare to y luego sorts no hace falta llamar al metodos, vectores o
		// variable staticas solo el sorts//
		Arrays.sort(listaSeries);
		for (Serie l : listaSeries) {
			System.out.println(l);
		}

		Arrays.sort(listav);
		for (Videojuego l : listav) {
			System.out.println(l);
		}
	}

}
