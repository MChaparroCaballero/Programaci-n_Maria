package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class SMS extends Notificacion {
	//atributos//
	private int limiteC;

	public SMS(String mensaje, String destinatario, int limiteC) {//segundo constructor con cosas propias//
		super(mensaje, destinatario);
		this.limiteC = 100;
	}

	public SMS(String mensaje, String destinatario) {//constructor heredado//
		super(mensaje, destinatario);

	}

	@Override
	public void enviar() {//metodo overriden aka sobreescrite del del madre//
		int canm = mensaje.length();//convertimos el string a un int con longitud y comparamos//
		if (canm <= limiteC) {
			JOptionPane.showMessageDialog(null, "\nmensaje enviado " + mensaje);
		} else {
			JOptionPane.showMessageDialog(null, "\nError " + "\nEl mensaje supera el limite de caracteres");
		}

	}

	public int getLimiteC() {//getter//
		return limiteC;
	}

	public void setLimiteC(int limiteC) {//setter//
		this.limiteC = limiteC;
	}

}
