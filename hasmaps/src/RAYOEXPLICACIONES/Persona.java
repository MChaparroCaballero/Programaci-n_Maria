package RAYOEXPLICACIONES;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}

}
