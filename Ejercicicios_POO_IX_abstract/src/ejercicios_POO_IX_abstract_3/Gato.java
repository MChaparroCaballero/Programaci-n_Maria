package ejercicios_POO_IX_abstract_3;

import javax.swing.JOptionPane;

public class Gato extends Animal {
String nombre;
String tipo;

public Gato(String nombre){
	this.nombre=nombre;
	String tipo="Felino";
	
}
@Override
public void hacerSonido() {
	String sonido = "MEOWWWW!🎶";
	JOptionPane.showMessageDialog(null, sonido);
	
}
@Override
public void moverse() {
	String movivimiento_sexy= "Ataque arañazo 😼";
	JOptionPane.showMessageDialog(null, movivimiento_sexy);
}


}
