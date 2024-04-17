package Clases;

public class Jugador {
	private String Nombre;
	private int Edad;
	private String Position;
	private String Club;
	private String Nacionalidad;
	
	public Jugador(String nombre, int edad, String position, String club, String nacionalidad) {
		super();
		Nombre = nombre;
		Edad = edad;
		Position = position;
		Club = club;
		Nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getClub() {
		return Club;
	}

	public void setClub(String club) {
		Club = club;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Jugador [Nombre=" + Nombre + ", Edad=" + Edad + ", Position=" + Position + ", Club=" + Club
				+ ", Nacionalidad=" + Nacionalidad + "]";
	}
	
	/*0 nombre, 6 posicion, */
	
}
