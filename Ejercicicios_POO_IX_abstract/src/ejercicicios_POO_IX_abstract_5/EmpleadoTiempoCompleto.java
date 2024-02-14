package ejercicicios_POO_IX_abstract_5;

import javax.swing.JOptionPane;

public class EmpleadoTiempoCompleto extends Empleado {
//atributos//
String nombre;
int horas_extras;
double salario;

public EmpleadoTiempoCompleto(String nombre, int horas_extras) {//constructor//
	this.nombre=nombre;
	this.horas_extras=horas_extras;
	salario = 2000;
}
@Override
public void calcularSalario() {//adaptamos el metodo calcular salario//
	double plus_horas_extras =  horas_extras * 50;
	salario = salario +  plus_horas_extras ;
	JOptionPane.showMessageDialog(null, "\nNombre: "+ nombre + "\nSalario :" + salario);
}

}
