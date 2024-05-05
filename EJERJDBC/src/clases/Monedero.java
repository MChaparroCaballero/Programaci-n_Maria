package clases;

public class Monedero {

	private int billetes;
	private double monedas;
	
	
	public Monedero(int billetes, double monedas) {
		super();
		this.billetes = billetes;
		this.monedas = monedas;
	}


	public int getBilletes() {
		return billetes;
	}


	public double getMonedas() {
		return monedas;
	}


	@Override
	public String toString() {
		return "Monedero [billetes=" + billetes + ", monedas=" + monedas + "]";
	}

	
	
	
	
	
}

