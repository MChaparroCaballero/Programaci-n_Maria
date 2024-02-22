package ejercicios_POO_XI_ABSTRACTySOBRECARGA_3;

import javax.swing.JOptionPane;

public class Uso_deFiguraGeometrica {

	public static void main(String[] args) {
		// nueva instancia//
		Triangulos amarillos = new Triangulos("negro", "amarillo", 6, 2);
		// dibujamos y hacemos el area//
		amarillos.dibujar();
		JOptionPane.showMessageDialog(null, "\nArea: " + amarillos.calcularArea());
		// nueva instancia//
		Circulos rojo = new Circulos("negro", "Rojo", 1.5);
		// dibujamos y hacemos el area//
		rojo.dibujar();
		JOptionPane.showMessageDialog(null, "\nArea: " + rojo.calcularArea());
		// nueva instancia//
		Circulos azul = new Circulos("Negro", "Azul");
		// dibujamos y hacemos el area//
		azul.dibujar();
		JOptionPane.showMessageDialog(null, "\nArea: " + azul.calcularArea());
		// nueva instancia//
		Rectangulos verde = new Rectangulos("Negro", "Verde", 5, 6.3);
		// dibujamos y hacemos el area//
		verde.dibujar();
		JOptionPane.showMessageDialog(null, "\nArea: " + verde.calcularArea());
	}

}
