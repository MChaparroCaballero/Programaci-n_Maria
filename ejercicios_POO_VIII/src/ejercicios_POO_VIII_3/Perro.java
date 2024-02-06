package ejercicios_POO_VIII_3;

import javax.swing.JOptionPane;

public class Perro extends Animal {

	public Perro() {//constructor//
		super();//lo de la clase madre//

	}


	public void emitirSonido() {//metodo sobreescrito//
		JOptionPane.showMessageDialog(null, "El perro ladra");

	}
}
