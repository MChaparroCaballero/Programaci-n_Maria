package collecciones_1;

public class Persona {
	private String Nombre;
	private int edad;
	

	public Persona() {

	}

	public Persona( String Nombre, int edad) {
		super();
		this.Nombre = Nombre;
		this.edad = edad;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	

}
