package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

public class Uso_declases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hacemos una nueva instancia//
		Permanente maria = new Permanente("María",26275 , 5000, 500);
		//mostramos los detalles//
		maria.MostrarDetalles();
		//hacemos una nueva instancia//
		Permanente alicia= new Permanente("Alicia", 12345, 3600);
		//mostramos los detalles//
		alicia.MostrarDetalles();
		//hacemos una nueva instancia//
		Temporal ana = new Temporal ("Ana", 666, 4500, 5);
		//mostramos los detalles//
		ana.MostrarDetalles();
		//hacemos una nueva instancia//
		Contratista pablo = new Contratista ("Pablo", 8975, 1000, 40);
		//mostramos los detalles//
		pablo.MostrarDetalles();
	}

}
 