package rellenarparejasbidimensionalrandom;

import java.util.Scanner;

public class principal {
	static Scanner sc = new Scanner(System.in);//scanner estatico//

	public static int alea(int li, int ls) {//metodo para hacer numero al azar//
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void imprimir(int m[][]) {//metodo para imprimir//
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// haz una matriz bidimensional, donde el numero de filas es igual al de
		// columnas, pidiendo el numero por teclado,que te meta un numero random dentro
		// de las posiciones

		/*
		 * pedimos el numero de filas y columnas, van a ser iguales osea el array sera
		 * filas*columnas
		 */
		System.out.println("Dime el numero de filas/columnas");
		int n, nalea, col, row;
		boolean pudoser;
		n = Integer.valueOf(sc.nextLine());

		int tb[][] = new int[n][n];
		// imprimir(tb);//

		/*algoritmos:
		 * numero a insertar random numero al azar/n = nfilas anteriore a donde estamos
		 * (nfilas*n)+ x = numero al azar esto es una equacion que para despejar x, las
		 * necesarias hasta llegar a nuestra posicion es x= num al azar - (nfilas*n)
		 */

		/* calculamos las posiciones totales */
		int pos = n * n;

		/* pones pos/2 porque queremos insertar de cada i dos ejemplares. */
		for (int i = 1; i <= pos / 2; i++) {
			for (int j = 1; j <= 2; j++) {

				// ponemos que el booleana es false, proque aun no hemos escrito nada en las
				// posiciones//
				pudoser = false;
				// mientras que pudoser sea falso aka el cotenido de el array en esa posicion es
				// 0//
				while (!pudoser) {

					/*
					 * variable nalea sera igual al metodo alea(numero random) entre un limite
					 * inferior de 0 y un limite superior de las posiciones totales-1
					 */
					nalea = alea(0, pos - 1);

					/*
					 * las filas seran igual a nalea entre el numero de filas para saber el
					 * numero de columna de un numero dado
					 */
					row = nalea / n;
					/*
					 * las columnas seran igual a nalea entre el numero de columnas para saber el
					 * numero de columna de un numero dado
					 */
					col = nalea - (row * n);

					/*si el contenido del array es igual a 0 escribes lo de i y pasas el booleano pudoser a true para que no pueda escribir sobre este*/
					if (tb[row][col] == 0) {
						tb[row][col] = i;
						pudoser = true;
					}
				}
			}

		}
		//usamos el metodo imprimir para imprimir el array//
		imprimir(tb);

	}
	

}
