package ejercicios_POO_XI_ABSTRACTySOBRECARGA_3;

public abstract class FiguraGeometrica {
	private String colorLinea;
	private String colorRelleno;

	public abstract void dibujar();

	public abstract double calcularArea();

	public FiguraGeometrica(String colorLinea, String colorRelleno) {
		super();
		this.colorLinea = colorLinea;
		this.colorRelleno = colorRelleno;
	}

	public String getColorLinea() {
		return colorLinea;
	}

	public void setColorLinea(String colorLinea) {
		this.colorLinea = colorLinea;
	}

	public String getColorRelleno() {
		return colorRelleno;
	}

	public void setColorRelleno(String colorRelleno) {
		this.colorRelleno = colorRelleno;
	}

}
