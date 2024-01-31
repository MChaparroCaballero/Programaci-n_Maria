package ejercicios_POO_VII_1;

public class ContadorInstancias {
	private String nombre;
	private static int contador;

	public ContadorInstancias(String nombre) {
		this.nombre = nombre;
		ContadorInstancias.contador = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContador() {
		return contador = ContadorInstancias.contador +1;
	}

}
