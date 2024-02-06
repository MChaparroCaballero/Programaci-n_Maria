package ejercicios_POO_VIII_1;

public class Automóvil extends Vehículo {
	String tipoDeCombustible;

	public Automóvil(String marca, String modelo, int año, String tipoDeCombustible) {
		super(marca, modelo, año);
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}

}
