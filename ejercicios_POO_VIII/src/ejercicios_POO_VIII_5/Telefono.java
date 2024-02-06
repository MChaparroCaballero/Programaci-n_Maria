package ejercicios_POO_VIII_5;

public class Telefono extends DispositivoElectrónico{
	private int llamada;

	public Telefono(String fabricante, int añoDeFabricación, int llamada) {//constructor//
		super(fabricante, añoDeFabricación);
		this.llamada = llamada;
	}

	public int recibirLlamadas() {//getter//
		return llamada;
	}

	public void Llamar(int llamada) {//setter//
		this.llamada = llamada;
	}

	

	

}
