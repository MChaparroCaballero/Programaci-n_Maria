package ejer2;

public class Uso_deCuentaBancaria {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Clase CuentaBancaria Objetivo: Diseña una clase CuentaBancaria
		 * con dos propiedades privadas: titular (String) y saldo (double). Crea los
		 * métodos getter y setter para ambas propiedades. Desafío adicional: En el
		 * setter del saldo, no permitas que el saldo sea negativo.
		 */

		
		CuentaBancaria millonaria = new CuentaBancaria();
		millonaria.set_titular("Ana");
		millonaria.set_saldo(2600);
		
		System.out.println("El titular " + millonaria.get_titular() + " con un saldo " + millonaria.get_saldo());
	}

}
