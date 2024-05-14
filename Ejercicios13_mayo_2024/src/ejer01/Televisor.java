package ejer01;

public class Televisor extends Electrodomestico {
	private int resolucion;
	private boolean TDT;
		
		
		
		public Televisor() {
			super();
			this.resolucion=20;
			this.TDT=false;
		}

		public Televisor(double precio_base, int peso) {
			super();
			this.precio_base=precio_base;
			this.peso=peso;
			this.resolucion=20;
			this.TDT=false;
		}

		public Televisor(double precio_base, int peso,  String color, char miConsumo, int res, boolean tdt) {
			super();
			this.precio_base = precio_base;
			this.peso = peso;
			this.color = ComprovarColor(color);
			this.miConsumo = ComprovarConsumoEnergetico(miConsumo);
			this.resolucion=res;
			this.TDT=tdt;
		}


		public double precioFinal() {
			// TODO Auto-generated method stub
			double pf= super.precioFinal();
			if(this.resolucion>40)pf *=1.30; 
			if(this.TDT) pf+=50;
			return pf;
		}

		public int getResolucion() {
			return resolucion;
		}

		public void setResolucion(int resolucion) {
			this.resolucion = resolucion;
		}

		public boolean isTDT() {
			return TDT;
		}

		public void setTDT(boolean tDT) {
			TDT = tDT;
		}

		
}
