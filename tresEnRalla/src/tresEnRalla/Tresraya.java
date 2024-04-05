package tresEnRalla;

import java.util.Scanner;

public class Tresraya {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("indique el numero de filas");
		int d = Integer.valueOf(scanner.nextLine());
		int nf = (d * 2) + 2;
		int lista[][] = new int[d][d];
		int soluciones[][] = new int[nf][d];

		rellenar(lista);
		imprimir(lista);
		resolucion(soluciones);
		System.out.println("\n********************************");
		imprimir(soluciones);

	}

	/* rellenamos la lista */
	public static void rellenar(int matriz[][]) {
		int k = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = k++;
			}
		}
	}

	/* metodo para imprimir la lista */
	public static void imprimir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			/*ponemos matriz de i porque no todas tienen i como longitud asique hay que especificar*/
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%4d", matriz[i][j]);
			}
		}
	}

	public static void resolucion(int[][] matriz) {
		/*metodo para sacar las soluciones de mi lista*/
		
		/*d es numero de columna de soluciones*/
		/*k es la fila de soluciones*/
		int k = 0, d = matriz[0].length;
		/*longtitud*/
		int nf = (d * 2) + 2;
		for (int i = 0; i < d; i++) {
			matriz[nf - 2][i] = (i * d) + (i + 1);
			matriz[nf - 1][i] = (i * d) + (d - i);
			for (int j = 0; j < d; j++) {
				matriz[k][j] = (i * d) + (j + 1);
				matriz[k + d][j] = (j * d) + (i + 1);
			}
			k++;
		}

	}
}
