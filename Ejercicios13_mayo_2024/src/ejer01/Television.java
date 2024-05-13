package ejer01;

import ejer01.Electrodomestico.Colores;
import ejer01.Electrodomestico.ConsumoElectronico;

public class Television extends Electrodomestico {
private double resolucion;
private boolean sintonizadorTDT;
	
	
	
	public Television() {
		super();
		this.precio_base = 100;
		this.peso = 5;
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	public Television(double precio_base, double peso) {
		super(precio_base, peso);
		this.color = Colores.BLANCO;
		this.miConsumo = ConsumoElectronico.F;
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	public Television(double precio_base, double peso,double resolucion, boolean sintonizadorTDT, String color, char miConsumo) {
		super(precio_base, peso, color, miConsumo);
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}


	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double pf=super.precioFinal();
		
		if(this.getResolucion()>40) {
			pf=pf+(pf*0.30);
		
		}else {
			pf=pf;
			
		}
		
		if(this.isSintonizadorTDT()==true) {
			pf+=50;
		}else {
			pf=pf;
		}
		
		return pf;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	

}
