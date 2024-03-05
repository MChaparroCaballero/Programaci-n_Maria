package main;

import java.util.Scanner;
import java.util.HashMap;

public class DiccionarioCastellanoIngles {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String,String> lista= new HashMap<String,String>();
		String castellano,ingles;
		while(true) {
			System.out.print("Dime la palabra en castellano");
			castellano=sc.nextLine();
			if(castellano.compareToIgnoreCase("FIN")==0) break;
			if(lista.containsKey(castellano)) {
				System.out.println("La traduccion es "+lista.get(castellano));
			}else {
				System.out.print("Dime la traducción");
				ingles=sc.nextLine();
				lista.put(castellano, ingles);
			}
		}
	}

}
