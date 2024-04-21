package ejer03;

import java.text.DecimalFormat;

public class Movil extends Terminal {

	private String tarifa;
	private double costeMinuto;

	public Movil(String numero, String tarifa) {
		super(numero);
		this.tarifa = tarifa.toLowerCase();
		switch (tarifa) {
		case "rata":
			this.costeMinuto = 0.06;
			break;
		case "mono":
			this.costeMinuto = 0.12;
			break;
		case "bisonte":
			this.costeMinuto = 0.30;
			break;
		default:
			System.out.println("tarifa invalida");
		}

	}

	@Override
	public void llama(Terminal terminal, int segundos) {
		super.llama(terminal, segundos);
		double coste = segundos * this.costeMinuto / 60;
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Tarificados " + df.format(coste) + " euros");
	}

	@Override
	public String toString() {
		return super.toString() + " - tarificados 0,00 euros";
	}
}
