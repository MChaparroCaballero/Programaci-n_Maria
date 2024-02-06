package ejercicios_POO_VIII_5;

public class Smartphone extends Telefono {
	private String aplicacion;

	public Smartphone(String fabricante, int añoDeFabricación, int llamada, String aplicacion) {
		super(fabricante, añoDeFabricación, llamada);
		this.aplicacion = aplicacion;
	}

	public String getAplicacion() {//getter//
		return aplicacion;
	}

	public void InstalarAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	

}
