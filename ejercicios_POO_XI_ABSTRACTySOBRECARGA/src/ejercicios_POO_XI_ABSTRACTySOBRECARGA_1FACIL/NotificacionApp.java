package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class NotificacionApp extends Notificacion {
	private String idDispositivo;

	public NotificacionApp(String mensaje, String destinatario) {
		super(mensaje, destinatario);
		// TODO Auto-generated constructor stub
	}

	public NotificacionApp(String mensaje, String destinatario, String idDispositivo) {
		super(mensaje, destinatario);

		this.idDispositivo = idDispositivo;
	}

	@Override
	public void enviar() {
		JOptionPane.showMessageDialog(null, "\nmensaje enviado " + "\nIddispositivo" + idDispositivo);

	}

	public String getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(String idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

}