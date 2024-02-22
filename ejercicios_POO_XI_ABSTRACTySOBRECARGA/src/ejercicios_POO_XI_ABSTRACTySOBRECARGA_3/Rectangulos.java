package ejercicios_POO_XI_ABSTRACTySOBRECARGA_3;

import javax.swing.JOptionPane;

public class Rectangulos extends FiguraGeometrica {
	// atributos//
	private double ancho;
	private double alto;

	public Rectangulos(String colorLinea, String colorRelleno) {// constructor heredado//
		super(colorLinea, colorRelleno);

	}

	public Rectangulos(String colorLinea, String colorRelleno, double ancho, double alto) {// constructor propio//
		super(colorLinea, colorRelleno);
		this.ancho = ancho;
		this.alto = alto;
	}

	public double getAncho() {// getter//
		return ancho;
	}

	public void setAncho(double ancho) {// setter//
		this.ancho = ancho;
	}

	public double getAlto() {// getter//
		return alto;
	}

	public void setAlto(double alto) {// setter//
		this.alto = alto;
	}

	@Override
	public void dibujar() {
		JOptionPane.showMessageDialog(null, "\nDibujar ectangulo con: " + "\nAncho: " + ancho + "\nAlto: " + alto
				+ "\nColor de linea:  " + getColorLinea() + " \nColor de relleno " + getColorRelleno());

	}

	@Override
	public double calcularArea() {
		double area = ancho * alto;
		return area;
	}

}
