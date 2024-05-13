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
		
	
	
	
	
	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double pf=super.precioFinal();
		
		if(this.getCarga()>30) {
			pf=pf+50;
			
		}else {
			pf=pf;
		}
		return pf;
		}
	

	public double getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
