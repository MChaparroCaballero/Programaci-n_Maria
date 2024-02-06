package ejercicios_POO_VIII_1;

public class Vehículo {//atributos//
	private String marca;
	private String modelo;
	private int año;
	
	public Vehículo(String marca, String modelo, int año) {//constructor//
		this.marca= marca;
		this.modelo= modelo;
		this.año= año;
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
	
	
}
