package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class NotificacionApp extends Notificacion {
	//atributos//
	private String idDispositivo;

	//constructor heredado//
	public NotificacionApp(String mensaje, String destinatario) {
		super(mensaje, destinatario);
		// TODO Auto-generated constructor stub
	}

	//segundo constructor con cosas propias//
	public NotificacionApp(String mensaje, String destinatario, String idDispositivo) {
		super(mensaje, destinatario);//lo heredado//

		this.idDispositivo = idDispositivo;
	}

	@Override
	public void enviar() {//metodo overriden aka sobreescrite del del madre//
		JOptionPane.showMessageDialog(null, "\nmensaje enviado " + mensaje + "\nIddispositivo" + idDispositivo);

	}

	public String getIdDispositivo() {//getter//
		return idDispositivo;
	}

	public void setIdDispositivo(String idDispositivo) {//setter//
		this.idDispositivo = idDispositivo;
	}

}