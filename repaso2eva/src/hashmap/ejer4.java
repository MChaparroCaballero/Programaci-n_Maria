package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ejer4 {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intentos;
		//variables//
		String usuario,contraseña;
		//hacemos hasmap con key y value//
		HashMap<String,String> lista = new HashMap<String,String>();
		//añadimos al hasmap//
		lista.put("Jose", "1234");
		lista.put("Maria", "1234");
		lista.put("Ana", "1234");
		lista.put("Juan", "1234");
		
		//bucle para el numero de intentos, pide usuario si funciona y coincide con el usuario de la key del hasmap te pide contraseña//
		for(intentos=1;intentos<=3;intentos++) {
			System.out.print("Dime el usuario");
			usuario=sc.nextLine();
			
			if(lista.containsKey(usuario)) {
				System.out.print("Dime la contraseña");
				contraseña=sc.nextLine();
				
				if(lista.get(usuario).compareToIgnoreCase(contraseña)==0){
					System.out.println("La contraseña coincide");
					break;
				}else {
					System.out.println("La contraseña no coincide");
				}
			}else {
				System.out.println("El usuario no existe");
			}
		}
		
		if(intentos==4) {
			System.out.println("Demasiados intentos");
		}else {
			System.out.println("Paso en el intento "+intentos);
		}
	}

}
