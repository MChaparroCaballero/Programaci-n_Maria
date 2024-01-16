package ejer2;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	CuentaBancaria() {
		titular = "Maria";
		saldo = 1000;
	}
	
	public void set_titular(String ntitular) {
		
		this.titular =ntitular;
	}
	
	public String get_titular() {
		return "es " + titular;	
	}
	public void set_saldo(double nsaldo) {
		
	
		if (nsaldo >= 0) {
			this.saldo = nsaldo;
		}else {
			System.out.println("No esta permitido los saldos negativos");
			this.saldo = (Double) null;
		}
	}
	public String get_saldo() {
		return "de " + saldo;	
	}
}
