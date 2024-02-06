package ejercicios_POO_VIII_5;

public class DispositivoElectrónico {
	private String fabricante;
	private int añoDeFabricación;
	
	public DispositivoElectrónico(String fabricante, int añoDeFabricación) {
		this.fabricante=fabricante;
		this.añoDeFabricación=añoDeFabricación;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAñoDeFabricación() {
		return añoDeFabricación;
	}

	public void setAñoDeFabricación(int añoDeFabricación) {
		this.añoDeFabricación = añoDeFabricación;
	}
	
	
}
