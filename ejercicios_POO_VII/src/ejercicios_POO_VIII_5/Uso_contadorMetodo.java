package ejercicios_POO_VIII_5;

import javax.swing.JOptionPane;

import ejercicios_POO_VII_1.ContadorInstancias;

public class Uso_contadorMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array de objetos//
		ContadorMetodo[] compras = new ContadorMetodo[3];

		for (int i = 0; i < compras.length; i++) {
			//bucle de instancias//
			compras[i] = new ContadorMetodo(JOptionPane.showInputDialog("Ingrese el nombre del producto"),
					Integer.parseInt(JOptionPane.showInputDialog("cantidad del producto")),
					Double.parseDouble(JOptionPane.showInputDialog("precio unidad del producto")));

		}

		//utilizamos el metodo static por cada objeto//
		for (ContadorMetodo numero : compras) {

			ContadorMetodo.total(numero.getNombre(), numero.getCantidad(),
			 numero.getPrecio());

		}
	}
}
