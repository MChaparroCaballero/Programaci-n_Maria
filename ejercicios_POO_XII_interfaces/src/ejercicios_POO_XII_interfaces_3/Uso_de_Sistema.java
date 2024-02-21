package ejercicios_POO_XII_interfaces_3;

public class Uso_de_Sistema {

	public static void main(String[] args) {
		//nueva instancia de correoelectronico//
		CorreoElectronico deberes = new CorreoElectronico();
		deberes.enviarNotificacion();
		//nueva instancia de SMS//
		SMS banco = new SMS();
		banco.enviarNotificacion();

	}

}
