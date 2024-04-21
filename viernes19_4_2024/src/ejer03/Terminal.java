package ejer03;


public class Terminal {
	private String numero;
	private int tiempoConversacion;

	public Terminal(String numero) {
		this.numero = numero;
		this.tiempoConversacion = 0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getTiempoConversacion() {
		return tiempoConversacion;
	}

	public void setTiempoConversacion(int tiempoConversacion) {
		this.tiempoConversacion = tiempoConversacion;
	}

	public void llama(Terminal terminal, int segundos) {
		this.setTiempoConversacion(this.getTiempoConversacion() + segundos);
		System.out.println("Nº " + this.getNumero() + " - " + this.getTiempoConversacion() + "s de conversacion");

	}

	@Override
	public String toString() {
		return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
	}
}
