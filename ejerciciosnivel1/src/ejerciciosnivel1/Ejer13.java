package ejerciciosnivel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) throws IOException {
		System.out.println("introduceme un numero de ventas");
		Scanner lector;
		lector = new Scanner(System.in);
		int numV=lector.nextInt();
		lector.close();
		System.out.println("introduceme las diferentes ventas");
		InputStreamReader info;
		BufferedReader scan;
		info = new InputStreamReader(System.in);
		scan = new BufferedReader(info);
		
		String ventas=scan.readLine();
		
		int numero=0;
		while(numero<=numV)	{
			System.out.print(ventas);
			numero++;
			ventas=scan.readLine();
			
		}
		
	}

}
