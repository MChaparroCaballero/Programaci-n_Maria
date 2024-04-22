package ejer03;

import java.text.DecimalFormat;

public class Movil extends Terminal {

	private String tarifa;
	private double costeMinuto;
	private double coste=0;

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
	
	
	

	public String getTarifa() {
		return tarifa;
	}




	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}




	public double getCosteMinuto() {
		return costeMinuto;
	}




	public void setCosteMinuto(double costeMinuto) {
		this.costeMinuto = costeMinuto;
	}




	public double getCoste() {
		return coste;
	}




	public void setCoste(double coste) {
		this.coste = coste;
	}




	@Override
	public void llama(Terminal terminal, int segundos) {
		super.llama(terminal, segundos);
		this.setCoste(segundos * this.getCosteMinuto() / 60);
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Tarificados " + df.format(this.getCoste()) + " euros");
	}

	@Override
	public String toString() {
		return super.toString() + " - tarificados "+ coste +" euros";
	}
}
