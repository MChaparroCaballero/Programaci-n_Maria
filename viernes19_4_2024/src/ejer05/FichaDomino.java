package ejer05;
 

public class FichaDomino {
	 private int lado1;
	    private int lado2;

	    public FichaDomino(int lado1, int lado2) {
	        this.lado1 = lado1;
	        this.lado2 = lado2;
	    }

	    public String toString() {
	        String lado1String = lado1 == 0 ? " " : String.valueOf(lado1);
	        String lado2String = lado2 == 0 ? " " : String.valueOf(lado2);
	        return "[" + lado1String + "|" + lado2String + "]";
	    }

	    public FichaDomino voltea() {
	        return new FichaDomino(lado2, lado1);
	    }

	    public boolean encaja(FichaDomino otraFicha) {
	        return this.lado1 == otraFicha.lado1 || this.lado1 == otraFicha.lado2 ||
	               this.lado2 == otraFicha.lado1 || this.lado2 == otraFicha.lado2;
	    }

		public int getLado1() {
			return lado1;
		}

		public void setLado1(int lado1) {
			this.lado1 = lado1;
		}

		public int getLado2() {
			return lado2;
		}

		public void setLado2(int lado2) {
			this.lado2 = lado2;
		}
	    
	    
}
