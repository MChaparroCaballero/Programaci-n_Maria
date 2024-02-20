package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

import javax.swing.JOptionPane;

public class CorreoElectronico extends Notificacion {
	//atributo//
	private String asunto;

	//constructor heredado//
	public CorreoElectronico(String mensaje, String destinatario) {
		super(mensaje, destinatario);
		// TODO Auto-generated constructor stub
	}

	//segundo constructor con cosas propias//
	public CorreoElectronico(String mensaje, String destinatario, String asunto) {
		super(mensaje, destinatario);//lo heredado//
		this.asunto = asunto;

	}

	@Override
	public void enviar() {//metodo overriden aka sobreescrite del del madre//
		JOptionPane.showMessageDialog(null, "\nmensaje: " + mensaje + "\nAsunto: "+ asunto + "\nenviado " );

	}

	public String getAsunto() {//getter//
		return asunto;
	}

	public void setAsunto(String asunto) {//setter//
		this.asunto = asunto;
	}

}
