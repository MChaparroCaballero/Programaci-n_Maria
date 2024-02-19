package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class SMS extends Notificacion {
	private int limiteC;

	public SMS(String mensaje, String destinatario, int limiteC) {
		super(mensaje, destinatario);
		this.limiteC = 100;
	}

	public SMS(String mensaje, String destinatario) {
		super(mensaje, destinatario);

	}

	@Override
	public void enviar() {
		int canm = mensaje.length();
		if (canm <= limiteC) {
			JOptionPane.showMessageDialog(null, "\nmensaje enviado ");
		} else {
			JOptionPane.showMessageDialog(null, "\nError " + "\nEl mensaje supera el limite de caracteres");
		}

	}

	public int getLimiteC() {
		return limiteC;
	}

	public void setLimiteC(int limiteC) {
		this.limiteC = limiteC;
	}

}
