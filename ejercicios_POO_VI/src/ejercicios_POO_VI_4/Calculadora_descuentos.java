package ejercicios_POO_VI_4;

public class Calculadora_descuentos {
private String nombre;
private double precio;
private int cantidad;
private final int porcentaje;


public Calculadora_descuentos(String nombre, double precioU, int cantidad) {
	this.nombre= nombre;
	this.precio=precioU;
	this.cantidad=cantidad;
	porcentaje=10;
	
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
//*//

public double getPrecio() {
	return precio;
}


public void setPrecio(double precioU) {
	this.precio = precioU;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public int getPorcentaje() {
	return porcentaje;
}

}
