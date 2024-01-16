package ejer2;

public class Uso_deCuentaBancaria {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Clase CuentaBancaria Objetivo: Diseña una clase CuentaBancaria
		 * con dos propiedades privadas: titular (String) y saldo (double). Crea los
		 * métodos getter y setter para ambas propiedades. Desafío adicional: En el
		 * setter del saldo, no permitas que el saldo sea negativo.
		 */

		
		CuentaBancaria millonaria = new CuentaBancaria();//instanciamos//
		
		millonaria.set_titular("Isabela");//los nuevos valores del setter//
		millonaria.set_saldo(260.6);
		
		System.out.println("El titular " + millonaria.get_titular() + " con un saldo " + millonaria.get_saldo() + " euros");
	}

}
