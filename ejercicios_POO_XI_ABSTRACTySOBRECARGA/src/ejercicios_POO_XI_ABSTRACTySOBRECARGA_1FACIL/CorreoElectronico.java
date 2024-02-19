package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class CorreoElectronico extends Notificacion {
	private String asunto;

	public CorreoElectronico(String mensaje, String destinatario) {
		super(mensaje, destinatario);
		// TODO Auto-generated constructor stub
	}

	public CorreoElectronico(String mensaje, String destinatario, String asunto) {
		super(mensaje, destinatario);
		this.asunto = asunto;

	}

	@Override
	public void enviar() {
		JOptionPane.showMessageDialog(null, "\nmensaje: " + asunto + "\nenviado ");

	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

}
