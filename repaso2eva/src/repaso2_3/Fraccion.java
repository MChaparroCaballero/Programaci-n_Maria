package repaso2_3;

public class Fraccion {
	   private int signo;
	    private int numerador;
	    private int denominador;
	    
	    public Fraccion(int n,int d) {
	   
	          this.signo= n*d<0 ? -1 :1;
	          this.numerador=Math.abs(n);
	          this.denominador=Math.abs(d);
	          
	    }
	 
		public int getNumerador() {
			return numerador;
		}
	 
		public void setNumerador(int numerador) {
			this.numerador = numerador;
		}
	 
		public int getDenominador() {
			return denominador;
		}
	 
		public void setDenominador(int denominador) {
			this.denominador = denominador;
		}
	 
		@Override
		public String toString() {
			String cadena=this.numerador+"/"+this.denominador;
		    if (this.signo==-1) cadena ="-"+cadena;
		    return cadena;
		}
	    public Fraccion invertir() {
	    	return new Fraccion(this.denominador,this.numerador);
	    }
	    public Fraccion multiplicar(int n) {
	    	return new Fraccion(this.numerador*n,this.denominador);
	    }
	    public Fraccion multiplicar(Fraccion f) {
	    	return new Fraccion(this.numerador*f.getNumerador(),this.denominador*f.getDenominador());
	    }
	    public Fraccion division(int n) {
	    	return new Fraccion(this.numerador,this.denominador*n);
	    }
	     public Fraccion division(Fraccion f) {
	    	return new Fraccion(this.numerador*f.getDenominador(),this.denominador*f.getNumerador());
	     }
	     public Fraccion simplificar() {
	    	 int misigno=this.signo;
	    	 int n=Math.abs(this.numerador);
	    	 int d=Math.abs(this.denominador);
	    	
	    	 for(int i=2;i<=Math.min(n, d);i++) {
	    		 while( (n%i==0) && (d%i==0)          ) {
	    			 n /=i;
	    			 d /=i;
	    		 }
	    	 }
	    	 return new Fraccion(misigno*n,d);
	    	
	    	
	    	
	     }
	     
	}
