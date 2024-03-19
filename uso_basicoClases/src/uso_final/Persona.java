package uso_final;

public class Persona {
	private String nombre;
	private int edad;
	private final int anon;

	public Persona(String nombre, int edad, int anon) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.anon = anon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnon() {
		return anon;
	}

	public void info() {
		System.out.print("\nnombre: " + nombre + "\nedad: " + edad + "\nañonacimiento" + anon);
	}
}
