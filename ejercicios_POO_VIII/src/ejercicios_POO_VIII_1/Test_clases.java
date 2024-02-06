package ejercicios_POO_VIII_1;
import java.util.*;
import javax.swing.JOptionPane;
public class Test_clases {

	public static void main(String[] args) {
		//creamos una nueva instancia//
		Automóvil cochemaria = new Automóvil(JOptionPane.showInputDialog("Ingrese la marca del vehiculo"), 
				JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"), 
				Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de compra")), JOptionPane.showInputDialog("Ingrese lel tipo de combustible que necesita"));

		JOptionPane.showMessageDialog(null, "\nLa marca de su vehiculo es: " + cochemaria.getMarca() + "\nEl modelo de su vehiculo es: " 
				+ cochemaria.getModelo() + "\nEl año de compra de su vehiculo es: " + cochemaria.getAño() + "\nEl tipo de combustible necesario para su vehiculo es: " 
				+ cochemaria.getTipoDeCombustible());
	}

}
