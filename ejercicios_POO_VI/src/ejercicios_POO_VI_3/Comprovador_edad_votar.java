package ejercicios_POO_VI_3;

public class Comprovador_edad_votar {
	private String nombre;
	private int edad;
	private final int edad_minima;
	private String voto;

	Comprovador_edad_votar(String nombre, int edad, String voto) {
		this.nombre = nombre;
		this.edad = edad;
		edad_minima =18;
		this.voto = voto;
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

	public int getEdad_minima() {
		return edad_minima;
	}
	
	public String getvoto() {
		return voto;
	}

	public void setvoto(String voto) {
		this.voto = voto;
	}

}
