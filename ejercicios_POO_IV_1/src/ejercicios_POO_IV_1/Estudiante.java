package ejercicios_POO_IV_1;

import javax.swing.JOptionPane;

public class Estudiante {
	private String nombre;
	private int edad;
	private String grado;


Estudiante(String nombre, int edad , String grado){//constructor//
	this.nombre =  nombre;
	this.edad =  edad;
	this.grado =  grado;
}


public  void set_nombre(String nombre) {//setter//
	this.nombre = nombre;
}
public String get_nombre() {//getter//
	return nombre;
}
public void set_edad(int edad) {//setter//
	this.edad = edad;
}
public int get_edad() {//getter//
	return edad;
}
public void set_grado(String grado) {//setter//
	this.grado = grado;
}
public String get_grado() { //getter//
	return grado;
}

}


