package ejercicios_sobrecargaConstructores_2;

import javax.swing.JOptionPane;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rojo = new Rectangulo(23, 54.6);
		Rectangulo azul = new Rectangulo(100, 25);

		JOptionPane.showMessageDialog(null, "\naltura: " + azul.getAltura() + "\nancho: " + azul.getAncho());
		JOptionPane.showMessageDialog(null, "\naltura: " + rojo.getAltura() + "\nancho: " + rojo.getAncho());
	}

}
