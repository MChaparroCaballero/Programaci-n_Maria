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


	public static double precioFinal(Television a) {
		// TODO Auto-generated method stub
		int pc=0;
		int pp=0;
		double pf=0;
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
		
		
		if(a.getResolucion()>40) {
			pf=(double) (pf+(pf*0.30));
		
		}
		
		if(a.isSintonizadorTDT()==true) {
			pf+=50;
		}
		
		return pf+a.getPrecio_base()+pp+pc;
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
