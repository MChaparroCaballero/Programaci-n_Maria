package Ejercicio01;

public class Videojuego implements Entregable{
private String titulo;
private int horasestimadas;
private boolean entregado;
private String genero;
private String compañia;

public Videojuego() {
	super();
	this.titulo = " ";
	this.horasestimadas = 10;
	this.entregado = false;
	this.genero = " ";
	this.compañia = " ";
}
public Videojuego(String titulo, int horasestimadas) {
	super();
	this.titulo = titulo;
	this.horasestimadas = horasestimadas;
	this.entregado = false;
	this.genero = " ";
	this.compañia = " ";
}
public Videojuego(String titulo, int horasestimadas, String genero, String compañia) {
	super();
	this.titulo = titulo;
	this.horasestimadas = horasestimadas;
	this.entregado = false;
	this.genero = genero;
	this.compañia = compañia;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getHorasestimadas() {
	return horasestimadas;
}
public void setHorasestimadas(int horasestimadas) {
	this.horasestimadas = horasestimadas;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getCompañia() {
	return compañia;
}
public void setCompañia(String compañia) {
	this.compañia = compañia;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
@Override
public void entregar() {
	this.entregado = true;
	
}
@Override
public void devolver() {
	this.entregado = false;
	
}
@Override
public boolean isEntregado() {
	// TODO Auto-generated method stub
	return this.entregado;
}



}
