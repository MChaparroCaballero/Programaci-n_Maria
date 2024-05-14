package ejer01;

import ejer01.ejemploEnum.Colores;
import ejer01.ejemploEnum.ConsumoEnergetico;

public class Electrodomestico {

	public static enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	public static enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	protected double precio_base;
	protected int peso;
	protected Colores color;
	protected ConsumoEnergetico miConsumo;

	public Electrodomestico() {
		super();
		this.precio_base = 100;
		this.peso = 5;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoEnergetico.F;
	}

	public Electrodomestico(double precio_base, int peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoEnergetico.F;
	}

	public Electrodomestico(double precio_base, int peso, String color, char letra) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = ComprovarColor(color);
		this.miConsumo = ComprovarConsumoEnergetico(letra);
	}

	public ConsumoEnergetico ComprovarConsumoEnergetico(char miConsumo2) {
		String letra = Character.toString(miConsumo2);
		for (ConsumoEnergetico e : ConsumoEnergetico.values())
			if (e.toString().equalsIgnoreCase(letra))
				return e;

		return ConsumoEnergetico.F;
	}

	public Colores ComprovarColor(String color2) {
		for (Colores b : Colores.values())
			if (b.toString().equalsIgnoreCase(color2)) {
				return b;
			}
		return Colores.BLANCO;

	}

	public double precioFinal() {
		int tb[] = { 100, 80, 60, 50, 30, 10 };
		double precioFinal = this.precio_base;
		precioFinal += tb[miConsumo.ordinal()];

		if (this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioFinal += 80;
		} else if (this.peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;

	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public ConsumoEnergetico getMiConsumo() {
		return miConsumo;
	}

	public void setMiConsumo(ConsumoEnergetico miConsumo) {
		this.miConsumo = miConsumo;
	}

}
