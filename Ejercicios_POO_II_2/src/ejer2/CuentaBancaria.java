package ejer2;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	CuentaBancaria() {
		titular = "Maria";
		saldo = 1000;
	}
	
	public void set_titular(String ntitular) {
		ntitular = "Ana";
		this.titular =ntitular;
	}
	
	public String get_titular() {
		return "es " + titular;	
	}
	public void set_saldo(double nsaldo) {
		nsaldo = 2600;
		this.saldo =nsaldo;
	}
	public String get_saldo() {
		return "de " + saldo;	
	}
}
