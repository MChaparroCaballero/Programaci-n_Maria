package ejer01;

import ejer01.ejemploEnum.Colores;
import ejer01.ejemploEnum.ConsumoEnergetico;

public class Electrodomestico {
	
	
	public static enum Colores{BLANCO,NEGRO,ROJO,AZUL,GRIS};
	public static enum ConsumoElectronico{A,B,C,D,E,F};
	protected double precio_base;
	protected double peso;
	protected Colores color;
	protected ConsumoElectronico miConsumo;
	
	
	
	
	public Electrodomestico() {
		super();
		this.precio_base = 100;
		this.peso = 5;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
	}
	
	
	
	public Electrodomestico(double precio_base, double peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
	}


	public Electrodomestico(double precio_base, double peso, String color, char miConsumo) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = ComprovarColor(color);
		this.miConsumo = ComprovarConsumoEnergetico(miConsumo);
	}
	
	
	public ConsumoElectronico ComprovarConsumoEnergetico(char miConsumo2) {
		String letra = Character.toString(miConsumo2);
		for(ConsumoElectronico e:ConsumoElectronico.values())
			if(e.toString().equalsIgnoreCase(letra))return e;
		
		return ConsumoElectronico.F;
	}
	
	public Colores ComprovarColor(String color2) {
		for(Colores b:Colores.values())
			if(b.toString().equalsIgnoreCase(color2)) {
				return b;
			}
		return Colores.BLANCO;
		
	}
	
	public double precioFinal() {
		int pc=0;
		int pp=0;
		int pf=0;
		switch(this.getMiConsumo()) {
		case F:
			pc=10;
			break;
		case A:
			pc=100;
			break;
		case B:
			pc=80;
			break;
		case C:
			pc=60;
			break;
		case D:
			pc=50;
			break;
		case E:
			pc=30;
			break;
		
		
		}
		if(this.getPeso()>=0 && this.getPeso()<=19) {
			pp=10;
		}else if(this.getPeso()<=49 && this.getPeso()>=20){
			pp=50;
		}else if(this.getPeso()<=79 && this.getPeso()>=50) {
			pp=80;
		}else if(this.getPeso()>=80) {
			pp=100;
		}else {
			System.out.println("invalido");
		}
		
		pf=(int) (this.getPrecio_base()+pp+pc);
		return pf;
		
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
	public Colores getColor() {
		return color;
	}
	public void setColor(Colores color) {
		this.color = color;
	}
	public ConsumoElectronico getMiConsumo() {
		return miConsumo;
	}
	public void setMiConsumo(ConsumoElectronico miConsumo) {
		this.miConsumo = miConsumo;
	}







}
