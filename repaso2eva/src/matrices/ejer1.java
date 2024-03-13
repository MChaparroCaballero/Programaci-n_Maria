package matrices;

public class ejer1 {

	public static int alea(int li, int ls) {// sacar los al azar//
		return (int) (Math.random() * (ls - li)) + li;
	}

	public static void rellenar(int m[][]) {// metodo para rellenar mediante uso de un array bidimensional
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = alea(140, 210);
			}
		}
	}

	public static void imprimir(int m[][], String p[]) {
		// hacemos las variables de estatura maxima, minima y la que ira sumando //
		int maximo, minimo, suma;
		String h1 = "";
		String h2 = "";
		System.out.println(h1);
		System.out.println(h2);
		for (int i = 0; i < m.length; i++) {
			suma = 0;
			maximo = 100;
			minimo = 300;
			System.out.printf("%-10s", p[i]);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
				if (m[i][j] > maximo)// si superamos el maximo ese se convertira el nuevo maximo//
					maximo = m[i][j];
				if (m[i][j] < minimo)// si somos inferiores al minimo seremos el nuevo minimo//
					minimo = m[i][j];

				suma += m[i][j];// para que valla sumando los valores//
			}
			System.out.printf("----------->%5d %5d %5d\n", minimo, suma / m[i].length, maximo);// imprimimos el minimo
																								// el maximo y la suma
																								// de los valores entre
																								// cuantos hemos
																								// metido//
		}
	}

	public static void main(String[] args) {
		/*
		 * Realiza un programa que calcule la estatura media, mínima y máxima en
		 * centímetros de personas de diferentes países. El array que contiene los
		 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
		 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
		 * array de 4 filas por 10 columnas con números aleatorios generados al azar
		 * entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
		 * de los países se deben mostrar utilizando el array de países (no se pueden
		 * escribir directamente)
		 */

		String paises[] = { "España", "Rusia", "Japón", "Australia" };
		int tb[][] = new int[4][10];
		rellenar(tb);
		imprimir(tb, paises);
	}

}
