package ejer03;

import java.text.DecimalFormat;

public class Movil extends Terminal {

	private String tarifa;
	private double coste;
	private int tiempo_conversacion;

	public Movil(String numero, String tarifa) {
		super(numero);
		this.tarifa = tarifa;
		this.coste = 0;
		this.tiempo_conversacion=0;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	
	

	public int getTiempo_conversacion() {
		return tiempo_conversacion;
	}

	public void setTiempo_conversacion(int tiempo_conversacion) {
		this.tiempo_conversacion = tiempo_conversacion;
	}

	
	public void llama(Movil a, int t) {
		// TODO Auto-generated method stub

		this.setTiempo_conversacion(this.getTiempo_conversacion() + t);
		a.setTiempo_conversacion(a.getTiempo_conversacion() + t);
	
		
		if (this.getTarifa().equalsIgnoreCase("rata")) {
			this.setCoste(this.getCoste() + (t  * 0.001 ));

		} else if (this.getTarifa().equalsIgnoreCase("mono")) {
			this.setCoste(this.getCoste() + (t  * 0.002 ));
		} else if (this.getTarifa().equalsIgnoreCase("bisonte")) {
			this.setCoste(this.getCoste() + (t  * 0.005 ));
		} else {
			System.out.print("error tarifa inexistente");
		}

	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#0.00");
		return "Nº " + this.getNumero() + " - " + this.getTiempo_conversacion() + " s de conversación"+ " - tarifados " + df.format(this.getCoste());
	}

	

}
