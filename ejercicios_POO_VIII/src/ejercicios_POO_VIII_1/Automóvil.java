package ejercicios_POO_VIII_1;

public class Automóvil extends Vehículo {
	String tipoDeCombustible;//atributos//

	//constructor//
	public Automóvil(String marca, String modelo, int año, String tipoDeCombustible) {
		super(marca, modelo, año); //los atributos de la clase madre//
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public void setTipoDeCombustible(String tipoDeCombustible) {//setter//
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public String getTipoDeCombustible() {//getter//
		return tipoDeCombustible;
	}

}
