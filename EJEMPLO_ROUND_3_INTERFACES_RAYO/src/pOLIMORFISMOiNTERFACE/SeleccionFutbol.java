package pOLIMORFISMOiNTERFACE;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	//atributos//

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		//constructor//
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	//getters y setters//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//un to string que nos devuelve los datos//
	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	//heredamos los metodos de integranteselecciondefutbol y los adaptamos a nuestra clase//
	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Clase Padre).");
		
	}

	@Override
	public void viajar() {
		System.out.println("Viajar (Clase Padre).");
		
	}

	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Clase Padre).");
		
	}

	@Override
	public void jugarPartido() {
		System.out.println("Jugar (Clase Padre).");
	}
	
}
