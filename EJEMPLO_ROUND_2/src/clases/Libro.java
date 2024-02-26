package clases;

public class Libro {
	//ejemplo de un atributo estatico//
	private String Isbn;
	private String Autor;
	private int Año;
	private static int numero = 0;

	public Libro(String isbn, String autor, int año) {
		super();
		Isbn = isbn;
		Autor = autor;
		Año = año;
		numero++;//se va a conservar entre instancias//
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public int getNumero() {//quitamos el static para poder llamar al getter //
		return numero;
	}

	public static void setNumero(int numero) {
		Libro.numero = numero;
	}

	@Override
	public String toString() {//metodo default en el que lo debemos dejar//
		return "Libro [Isbn=" + Isbn + ", Autor=" + Autor + ", Año=" + Año + "]";
	}

}
