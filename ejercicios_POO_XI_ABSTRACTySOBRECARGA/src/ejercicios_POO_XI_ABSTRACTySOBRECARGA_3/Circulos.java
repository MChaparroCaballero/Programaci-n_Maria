package ejercicios_POO_XI_ABSTRACTySOBRECARGA_3;

import javax.swing.JOptionPane;

public class Circulos extends FiguraGeometrica {
	// atributos//
	double radio;

	public Circulos(String colorLinea, String colorRelleno) {// constructor heredado//
		super(colorLinea, colorRelleno);
	}

	public Circulos(String colorLinea, String colorRelleno, double radio) {// constructor propio//
		super(colorLinea, colorRelleno);
		this.radio = radio;
	}

	public double getRadio() {// getter//
		return radio;
	}

	public void setRadio(double radio) {// setter//
		this.radio = radio;
	}

	@Override
	public void dibujar() {
		JOptionPane.showMessageDialog(null, "⚫ " + "\nDibujar circulo con: " + "\nRadio: " + radio
				+ "\nColor de linea:  " + getColorLinea() + " \nColor de relleno " + getColorRelleno());

	}

	@Override
	public double calcularArea() {
		double area = Math.PI * radio * radio;
		return area;
	}

}
