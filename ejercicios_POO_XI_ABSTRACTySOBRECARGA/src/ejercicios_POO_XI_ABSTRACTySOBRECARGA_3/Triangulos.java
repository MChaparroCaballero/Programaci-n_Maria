package ejercicios_POO_XI_ABSTRACTySOBRECARGA_3;

import javax.swing.JOptionPane;

public class Triangulos extends FiguraGeometrica {
//atributos//
	double base;
	double altura;

	public Triangulos(String colorLinea, String colorRelleno) {//constructor heredado//
		super(colorLinea, colorRelleno);
		// TODO Auto-generated constructor stub
	}

	public Triangulos(String colorLinea, String colorRelleno, double base, double altura) {//constructor propio//
		super(colorLinea, colorRelleno);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {//getter//
		return base;
	}

	public void setBase(double base) {//setter//
		this.base = base;
	}

	public double getAltura() {//getter//
		return altura;
	}

	public void setAltura(double altura) {//setter//
		this.altura = altura;
	}

	@Override
	public void dibujar() {
		JOptionPane.showMessageDialog(null, "🔺 " + "\nDibujar ectangulo con: " + "\nBase: " + base + "\nAltura: "
				+ altura + "\nColor de linea:  " + getColorLinea() + " \nColor de relleno " + getColorRelleno());

	}

	@Override
	public double calcularArea() {
		double area = (base * altura) / 2;
		return area;
	}

}
