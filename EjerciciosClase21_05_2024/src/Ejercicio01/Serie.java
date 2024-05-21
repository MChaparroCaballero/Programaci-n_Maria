package Ejercicio01;

public class Serie implements Entregable, Comparable {
	private String Titulo;
	private int Temporadas;
	private boolean entregado;
	private String Genero;
	private String Creador;

	public Serie(String titulo, String creador) {
		this(titulo, 3, "", creador);
	}

	public Serie() {
		this("", 3, "", "");
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		Titulo = titulo;
		Temporadas = temporadas;
		this.Temporadas = temporadas;
		this.entregado = false;
		Genero = genero;
		Creador = creador;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public int getTemporadas() {
		return Temporadas;
	}

	public void setTemporadas(int Temporadas) {
		this.Temporadas = Temporadas;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		this.Genero = genero;
	}

	public String getCreador() {
		return Creador;
	}

	public void setCreador(String creador) {
		this.Creador = creador;
	}

	@Override
	public void entregar() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Serie: Titulo" + Titulo + " temporadas" + Temporadas + "Entregado" + entregado + "genero" + Genero
				+ "creador" + Creador;
	}

	@Override
	public int compareTo(Object o) {
		Serie s=(Serie)o;
		return this.Temporadas-s.getTemporadas();
	}

}
