package ejercicios_POO_XII_interfaces_3;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_3.SistemadeNoificaciones.Notificable;

public class SMS implements Notificable{

	@Override
	public void enviarNotificacion() {//adaptamos el metodo de la interfaz a esta clase//
		JOptionPane.showMessageDialog(null,"\nSMS: " + "\nNotificacion recibida");
		
	}

}
