package ejemplo;

public class Primeraclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CONTENIDO DEL MAIN:
		// Esto es instanciar una clase
		// Esto es crear un ejemplar de una clase
		Coche Renault = new Coche();
		Coche subaru = new Coche();
		
		// Ahora quiero ver las características de este coche
		System.out.println("mi coche tiene " + Renault.getMotor());
		System.out.println("Mi coche tiene " + Renault.getColor() );
		
		
		System.out.println("Mi coche tiene " + subaru.getColor());
		System.out.println("Mi coche tiene " + subaru.getRuedas());
	}
}
