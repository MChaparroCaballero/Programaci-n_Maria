package ejercicios_POO_X_sobrecargaDeConstructores_4;

public class Coche {
	//atributos//
 private String marca;
 private String modelo;
 private int año;
 private String color;
 private int asientos;
 
 
public Coche(String marca, String modelo, int año, String color, int asientos) {//primer constructor//
	
	this.marca = marca;
	this.modelo = modelo;
	this.año = año;
	this.color = color;
	this.asientos = asientos;
}


public Coche(String marca, String modelo, String color) {//segundo constructor//
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
}


public String getMarca() {//getter//
	return marca;
}
public void setMarca(String marca) {//setter//
	this.marca = marca;
}
public String getModelo() {//getter//
	return modelo;
}
public void setModelo(String modelo) {//setter//
	this.modelo = modelo;
}
public int getAño() {//getter//
	return año;
}
public void setAño(int año) {//setter//
	this.año = año;
}
public String getColor() {//getter//
	return color;
}
public void setColor(String color) {//setter//
	this.color = color;
}
public int getAsientos() {//getter//
	return asientos;
}
public void setAsientos(int asientos) {//setter//
	this.asientos = asientos;
}
 

}
