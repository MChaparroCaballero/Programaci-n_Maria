package ejercicios_POO_XI_ABSTRACTySOBRECARGA_1FACIL;

public class Uso_declases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hacemos nuevas instancia hardcodeada//
		CorreoElectronico importante = new CorreoElectronico("PASAME LOS APUNTES POFAVOR", "ANA CHUN ", "intercambio");
		// usamos el metodo overriden//
		importante.enviar();
		// hacemos nuevas instancia hardcodeada//
		SMS saludo = new SMS("WASAAAAA", "Goku", 25);
		// usamos el metodo overriden//
		saludo.enviar();
		// hacemos nuevas instancia hardcodeada//
		NotificacionApp insta = new NotificacionApp("nuevo seguidor", "floraestela", "huawey24");
		// usamos el metodo overriden//
		insta.enviar();
	}

}
