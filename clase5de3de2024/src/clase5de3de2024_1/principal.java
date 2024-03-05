package clase5de3de2024_1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Tiempo nuevo = new Tiempo(10,35,5);
		Tiempo nuevo2 = new Tiempo(10,35,5);
		Scanner sc = new Scanner(System.in);
		System.out.println("horas");
		int h = sc.nextInt();
		System.out.println("minutos");
		int m= sc.nextInt();
		System.out.println("segundos");
		int s =sc.nextInt();
		
		System.out.println("horas");
		int h2 = sc.nextInt();
		System.out.println("minutos");
		int m2= sc.nextInt();
		System.out.println("segundos");
		int s2 =sc.nextInt();
		
		
		nuevo.suma(h,m,s);
		System.out.println(nuevo.toString());
		nuevo2.restar(h2, m2, s2);
		sc.close();
		System.out.println(nuevo2.toString());

	}

}
