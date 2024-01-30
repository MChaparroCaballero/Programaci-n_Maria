package poo_VII;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Epifanio");
		Empleados trabajador2 = new Empleados("Dolores");
		
		System.out.println(trabajador1.devuelveDatos());
		trabajador1.cambiaSeccion("Recursos Humanos");
		System.out.println(trabajador1.devuelveDatos());

	}
}

class Empleados {
	private final String nombre;
	private String seccion;

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
	}

	/*public String getNombre() {

	}*/

	public String devuelveDatos() {//gettter//
		return "El nombre es " + nombre + " y la sección es " + seccion;
	}

	/*public void cambiaNombre(String nombre) {// setter//
		this.nombre = nombre;
	}estop es lo que habia antes del final pero una vez que lo pones el setter queda inservivble porque ya no se podra cambiar*/


	public void cambiaSeccion(String seccion) {// setter//
		this.seccion = seccion;
	}

}
