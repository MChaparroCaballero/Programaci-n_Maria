package clase5de3de2024_1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Tiempo nuevo = new Tiempo(18,30,10);
		Scanner sc = new Scanner(System.in);
		System.out.println("horas");
		int h = sc.nextInt();
		System.out.println("minutos");
		int m= sc.nextInt();
		System.out.println("segundos");
		int s =sc.nextInt();
		
		nuevo.suma(s,m,h);
		sc.close();
		nuevo.toString();
		

	}

}
