package ejer02;

public class Terminal {
	private String numero;
	private int tiempoConversacion;

	public Terminal(String numero) {
		this.numero = numero;
		this.tiempoConversacion = 0;
	}

	public void llama(Terminal terminal, int segundos) {
		this.tiempoConversacion += segundos;
		System.out.println("Nº "+ terminal+ " - " + terminal.tiempoConversacion+"s de conversacion");
		
	}
}
