package ejer03;


public class Terminal {
	private String numero;
	private int tiempo_conversacion;

	public Terminal(String numero) {
		super();
		this.numero = numero;
		this.tiempo_conversacion = 0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getTiempo_conversacion() {
		return tiempo_conversacion;
	}

	public void setTiempo_conversacion(int tiempo_cnversion) {
		this.tiempo_conversacion = tiempo_cnversion;
	}

	public void llama(Terminal a, int t) {

		this.setTiempo_conversacion(this.getTiempo_conversacion() + t);
		a.setTiempo_conversacion(a.getTiempo_conversacion() + t);
		

	}

	@Override
	public String toString() {
		return "Nº " + numero + " - " + tiempo_conversacion + " s de conversación";
	}

	
}
