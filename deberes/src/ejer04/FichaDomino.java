package ejer04;

public class FichaDomino {
	private int lado1;
	private int lado2;

	public FichaDomino(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public FichaDomino voltea() {
		return new FichaDomino(lado2, lado1);
	}

	// comparamos para ver si el alguno de los lados de la primera ficha coincide
	// con alguno de la segunda, si es asi sera true si no es false asi sabremos si
	// son capaces de encajar//
	public boolean encaja(FichaDomino otra) {
		boolean encajan = false;
		if (this.getLado1() == otra.getLado1()) {
			return encajan = true;

		} else if (this.getLado2() == otra.getLado1()) {
			return encajan = true;
		} else if (this.getLado2() == otra.getLado2()) {
			return encajan = true;
		} else if (this.getLado2() == otra.getLado1()) {
			return encajan = true;
		} else {
			return encajan = false;
		}

	}

	@Override
	public String toString() {

		// en caso de que la ficha sea 0 lo cambiamos a un string//
		if (lado1 == 0) {
			String lad1 = " ";
			return "[" + lad1 + "|" + lado2 + "]";
		} else if (lado2 == 0) {
			String lad2 = " ";
			return "[" + lado1 + "|" + lad2 + "]";
		}
		return "[" + lado1 + "|" + lado2 + "]";
	}

}
