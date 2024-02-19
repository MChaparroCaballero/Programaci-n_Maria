package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public abstract class Notificacion {
	protected String mensaje;
	private String destinatario;

	public Notificacion(String mensaje, String destinatario) {
		super();
		this.mensaje = mensaje;
		this.destinatario = destinatario;
	}

	public abstract void enviar();

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

}
