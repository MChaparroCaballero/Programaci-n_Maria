package ejer01;

import ejer01.Electrodomestico.Colores;
import ejer01.Electrodomestico.ConsumoElectronico;

public class Lavadora extends Electrodomestico {

	private double carga;
	
		public Lavadora() {
		this.precio_base = 100;
		this.peso = 5;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
		this.carga=5;
		
	}

	
	
	public Lavadora(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
		this.carga=5;
	}

	public Lavadora(double precio_base, double peso, double carga, String color, char miConsumo) {
		super(precio_base, peso, color, miConsumo);
		this.carga=carga;
	}
		
	
	
	
	
	
	public static double precioFinal(Lavadora a) {
		// TODO Auto-generated method stub
		int pc=0;
		int pp=0;
		int pf=0;
		switch(a.getMiConsumo()) {
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
		if(a.getPeso()>=0 && a.getPeso()<=19) {
			pp=10;
		}else if(a.getPeso()<=49 && a.getPeso()>=20){
			pp=50;
		}else if(a.getPeso()<=79 && a.getPeso()>=50) {
			pp=80;
		}else if(a.getPeso()>=80) {
			pp=100;
		}else {
			System.out.println("invalido");
		}
		
		
		if(a.getCarga()>30) {
			pf=pf+50;
			
		}else {
			pf=pf;
		}
		return pf+a.getPrecio_base()+pp+pc;
		}
	

	public double getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
