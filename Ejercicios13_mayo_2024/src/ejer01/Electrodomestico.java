package ejer01;

import ejer01.ejemploEnum.Colores;
import ejer01.ejemploEnum.ConsumoEnergetico;

public class Electrodomestico {
	
	
	public static enum colores{BLANCO,NEGRO,ROJO,AZUL,GRIS};
	public static enum ConsumoElectronico{A,B,C,D,E,F};
	protected double precio_base;
	protected double peso;
	protected colores color;
	protected ConsumoElectronico miConsumo;
	
	
	
	
	public Electrodomestico() {
		super();
		this.precio_base = 100;
		this.peso = 5;
		this.color = colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
	}
	
	
	
	public Electrodomestico(double precio_base, double peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
	}


	public Electrodomestico(double precio_base, double peso, colores color, ConsumoElectronico miConsumo) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = ComprovarColor(color);
		this.miConsumo = ComprovarConsumoEnergetico(miConsumo);
	}
	
	
	public ConsumoEnergetico ComprovarConsumoEnergetico(char miConsumo2) {
		String letra = Character.toString(miConsumo2);
		for(ConsumoEnergetico e:ConsumoEnergetico.values())
			if(e.toString().equalsIgnoreCase(letra))return e;
		
		return ConsumoEnergetico.F;
	}
	
	public Colores ComprovarColor(String color2) {
		for(Colores b:Colores.values())
			if(b.toString().equalsIgnoreCase(color2)) {
				return b;
			}
		return Colores.BLANCO;
		
	}
	

	public double getPrecio_base() {
		return precio_base;
	}
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public colores getColor() {
		return color;
	}
	public void setColor(colores color) {
		this.color = color;
	}
	public ConsumoElectronico getMiConsumo() {
		return miConsumo;
	}
	public void setMiConsumo(ConsumoElectronico miConsumo) {
		this.miConsumo = miConsumo;
	}







}
