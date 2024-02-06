package poo_VIII_HERENCIA;

public class Vehiculo {
	//Definición de la clase base Vehiculo
	 // Propiedad protegida que puede ser accedida por las clases en el mismo paquete y subclases
	 protected String marca;
	 
	 // Constructor de la clase Vehiculo
	 public Vehiculo(String marca) {
	     this.marca = marca;
	 }
	 
	 // Método para mostrar la marca del vehículo
	 public void mostrarMarca() {
	     System.out.println("Marca del vehículo: " + marca);
	 }
	}

	//Definición de la subclase Auto que extiende de Vehiculo
	class Auto extends Vehiculo {
	 // Propiedad específica de la subclase Auto
	 private int numeroDePuertas;
	 
	 // Constructor de la subclase Auto
	 public Auto(String marca, int numeroDePuertas) {
	     // Llamada al constructor de la clase base (Vehiculo)
	     super(marca); // Con super se llama al constructor de la clase padre
	     this.numeroDePuertas = numeroDePuertas;
	 }
	 
	 // Método para mostrar la información del auto
	 public void mostrarInfo() {
	     // Llamada al método mostrarMarca de la clase base
	     mostrarMarca();
	     System.out.println("Número de puertas: " + numeroDePuertas);
	 }
	}


