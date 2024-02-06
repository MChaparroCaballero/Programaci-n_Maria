package ejercicios_POO_VIII_1;

public class Vehículo {
	private String marca;
	private String modelo;
	private int año;
	
	public Vehículo(String marca, String modelo, int año) {
		this.marca= marca;
		this.modelo= modelo;
		this.año= año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
}
