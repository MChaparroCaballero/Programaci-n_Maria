package principal;

import java.util.Scanner;

public class Ejer01 {
	public static Scanner sc = new Scanner(System.in);

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void main(String[] args) {
		System.out.print("de cuantas parejas quieres el juego?");
		int n = Integer.valueOf(sc.nextLine());
		int matriz[] = new int[n * 2];
		int m;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2; j++) {
				while (true) {
					m = alea(0, matriz.length - 1);
					if (matriz[m] == 0) {
						matriz[m] = i;
						break;
					}
				}

			}
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(i + " " + matriz[i]);
		}
	}

}
