package cuadradoMagico;

import java.util.Scanner;

public class CUADRADO_MAGICO {

	public static void main(String[] args) {
		//
		int num[][] = new int[3][3];
		Scanner lector;
		lector = new Scanner(System.in);
		int sumacolumnas = 0;
		int sumafilas = 0;
		int diagonal = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = lector.nextInt();
			}
		}

		lector.close();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}

		int i = 0;
		int j = 0;

		for (i = 0; i < 3; i++) {
			j = 0;
			sumacolumnas = sumacolumnas + num[i][j];
		}

		for (j = 0; i < 3; j++) {
			i = 0;
			sumafilas = sumafilas + num[i][j];
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					diagonal = diagonal + num[i][j];
				}
			}

		}

		if (diagonal == 15 && sumacolumnas == 15 && sumafilas == 15) {
			System.out.println("Enorabuena es un cuadrado magico");
		}

	}
}
