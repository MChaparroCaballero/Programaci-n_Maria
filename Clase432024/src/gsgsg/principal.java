package gsgsg;

import java.util.Scanner;

public class principal {
	static Scanner sc = new Scanner(System.in);

	// metodo para hacer nuemeros enteros aleatorios//
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
		/*
		 * la parte de ls-ls+1 es el limite superior, porque no va a llegar a uno nunca
		 * pero hay que aproximar sin que sea un numero falso pero claro ten en cuenta
		 * que si tu restas y luegos suma se anulan las acciones osea ahi le estamos
		 * diciendo como debe actuar con los parametros de superior y inferior
		 * 
		 */
	}

	public static void rellenar(int matriz[]) {
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = alea(0, 225);
		}
	}

	public static String d_a_b(int numero) {//decimal a binario//
		//string que es para dar espacio//
		String cadena = "";
		//bucle en el cual mientras numero sea mayor que 0 la cadena sera un string del valor que tendria el resto de numero/2 + el espacio de cadena
		while (numero > 0) {
			cadena = String.valueOf(numero % 2) + cadena;
			numero = (int) (numero / 2);
		}

		return cadena;
	}

	public static String d_a_h(int numero) {//decimal a hexadecimal//
		String cadenita = "0123456789ABCDEF";
		String cadena = "";
		while (numero > 0) {
			cadena = cadenita.charAt(numero % 16) + cadena;//obtenemos la posicion segun la cadena //
			numero = (int) (numero / 16);
		}
		return cadena;
	}

	public static void main(String[] args) {
		/* CREAR UN PROGRAMA EN JAVA QUE NOS PIDA UN NUMERO ENTERO DE 200-255 */
		int tb[] = new int[50];
		int numero;
		System.out.println("Dime un número");
		numero = Integer.valueOf(sc.nextLine());

		System.out.println(d_a_b(numero));
		rellenar(tb);
		for (int b : tb) {
			System.out.printf("valor=%5d binario=%8s\n", b, d_a_b(b));
		}
		String cadenita = "0123456789ABCDEF";
		for (int elemento : tb) {
			System.out.printf("valor=%5d binario=%8s\n", elemento, d_a_h(elemento));
		}
	}

}
