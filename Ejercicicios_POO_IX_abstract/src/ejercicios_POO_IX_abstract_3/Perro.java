package ejercicios_POO_IX_abstract_3;

import javax.swing.JOptionPane;

public class Perro extends Animal{
String nombre;
String tipo;
String dueño;

public Perro(String nombre, String dueño) {
	this.nombre=nombre;
	tipo="canino";
	this.dueño=dueño;
}

@Override
public void hacerSonido() {
	String sonido = "WOOOF!";
	JOptionPane.showMessageDialog(null, sonido);
}

@Override
public void moverse() {
	String movimiento = "ataque mordida";
	JOptionPane.showMessageDialog(null, movimiento);
}
}
