package ejercicios_POO_XII_interfaces_3;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_3.SistemadeNoificaciones.Notificable;

public class CorreoElectronico implements Notificable {

	@Override
	public void enviarNotificacion() {//adaptamos el metodo de la interfaz a esta clase//
		JOptionPane.showMessageDialog(null, "\nGmail: "+"\nNotificacion recibida");
		
	}

	

}
