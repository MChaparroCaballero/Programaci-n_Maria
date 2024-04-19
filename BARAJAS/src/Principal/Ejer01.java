package Principal;

import java.util.ArrayList;
import java.util.HashMap;

import Clases.Carta;
import Clases.Jugador;

public class Ejer01 {
	public static ArrayList<Carta> BarajaEspañola = new ArrayList<Carta>();// estatico por que sino barajar no
																			// funciona//

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;

	}

	public static void barajar() {
		// dos cartas que va moviendo//
		Carta carta1 = null, carta2 = null;
		int limite_inferior = 0;
		int limite_superior = BarajaEspañola.size() - 1;
		int p, s;
		for (int i = 1; i <= 5000; i++) {
			// usamos el alea//
			p = alea(limite_inferior, limite_superior);
			s = alea(limite_inferior, limite_superior);
			// le metemos dos valores de alea dioferente cada uno a cada crat 3000 veces que
			// por cada bucle vamos añadiendo a la baraja//
			carta1 = BarajaEspañola.get(p);
			carta2 = BarajaEspañola.get(s);
			BarajaEspañola.set(s, carta1);
			BarajaEspañola.set(p, carta2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palos[] = { "Oros", "Copas", "Espadas", "Bastos" };
		String numeracion[] = { "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" };
		HashMap<String, Integer> valoraciones = new HashMap<String, Integer>();
		valoraciones.put("1", 11);
		valoraciones.put("3", 10);
		valoraciones.put("Sota", 2);
		valoraciones.put("Caballo", 3);
		valoraciones.put("Rey", 4);

		for (String p : palos) {
			for (String n : numeracion) {
				// creamos tantas cartas como numeros por palos//
				BarajaEspañola.add(new Carta(p, n));
			}
		}

		barajar();
		Jugador j1 = new Jugador("Lucas");
		Jugador j2 = new Jugador("Zaga");
		int n;
		for (int i = 1; i <= 5; i++) {
			n = alea(0, BarajaEspañola.size() - 1);
			j1.asignar(i - 1, BarajaEspañola.get(n));
			BarajaEspañola.remove(n);

			// obtenemos una carta aleatoria//
			n = alea(0, BarajaEspañola.size() - 1);
			// le asignamos una carta al jugador a su array personal//
			j2.asignar(i - 1, BarajaEspañola.get(n));

			// la quitamos del monton//
			BarajaEspañola.remove(n);
		}
		
		int suma1 = 0;
		System.out.println("Cartas del jugador 1");
		for (Carta a : j1.obtener()) {
			if (valoraciones.containsKey(a.getNumero())) {
				suma1 +=valoraciones.get(a.getNumero());
			}
			System.out.println(a);
		}
		int suma2 = 0;
		System.out.println("Cartas del jugador 2");
		for (Carta a : j2.obtener()) {
			if (valoraciones.containsKey(a.getNumero())) {
				suma2 +=valoraciones.get(a.getNumero());
			}
			System.out.println(a);
		}

		
		System.out.println("Jugador 1 " +suma1);
		System.out.println("Jugador 2 " +suma2);
		
		
		if(suma1>suma2) {
			System.out.println("Gano el jugador 1");
		}else if(suma1<suma2) {
			System.out.println("Gano el jugador 2");
		}else {
			System.out.println("Empate");
		}
	}

}
