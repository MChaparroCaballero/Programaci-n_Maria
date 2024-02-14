package ejercicicios_POO_IX_abstract_5;

import javax.swing.JOptionPane;

public class EmpleadoTiempoCompleto extends Empleado {
String nombre;
int horas_extras;
double salario;

public EmpleadoTiempoCompleto(String nombre, int horas_extras) {
	this.nombre=nombre;
	this.horas_extras=horas_extras;
	double salario = 2000;
}
@Override
public void calcularSalario() {
	double plus_horas_extras=  horas_extras * 50;
	salario = plus_horas_extras + salario;
	JOptionPane.showMessageDialog(null, "\nNombre: "+ nombre + "\nSalario :" + salario);
}

}
