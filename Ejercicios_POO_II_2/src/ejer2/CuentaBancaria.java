package ejer2;

public class CuentaBancaria {//atributos//
	private String titular;
	private double saldo;

	CuentaBancaria() {//constructor//
		titular = "Maria";
		saldo = 1000;
	}

	public void set_titular(String titular) {//setter//

		this.titular = titular;
	}

	public String get_titular() {//getter//
		return "es " + titular;
	}

	public void set_saldo(double saldo) {//setter//

		if (saldo >= 0) {//restringimos el funcionamiento en caso de saldo en numeros negaivos//
			this.saldo = saldo;
		} else {
			System.out.println("No esta permitido los saldos negativos");
			this.saldo = (Double) null;
		}
	}

	public String get_saldo() {//getter//
		return "de " + saldo;
	}
}
