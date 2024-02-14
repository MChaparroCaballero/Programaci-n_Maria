package ejercicicios_POO_IX_abstract_5;

import javax.swing.JOptionPane;

public class EmpleadoTiempoParcial extends Empleado{
	//atributos//
	String nombre;
	int horas_complementarias;
	double salario;
	
	public EmpleadoTiempoParcial(String nombre, int horas_complementarias) {//constructor//
		this.nombre=nombre;
		this.horas_complementarias=horas_complementarias;
		salario = 1000;
		
	
}

	@Override
	public void calcularSalario() {//adaptamos el metodo de calculo de salario//
		double plus_horas_complementarias= horas_complementarias * 20;
		salario = plus_horas_complementarias + salario;
		JOptionPane.showMessageDialog(null, "\nNombre: "+ nombre + "\n 💲Salario :" + salario);
		
	}
}
