package ejer05;

public class Principal {
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			FichaDomino[] secuencia = new FichaDomino[8];
	        for (int i = 0; i < 8; i++) {
	            
	            // Crear una ficha de dominó con los números generados
	            FichaDomino ficha = new FichaDomino(alea(0,6), alea(0,6));
	            secuencia[i] = ficha;
	            for(int j=0;j<8;j++) {
	            	if(secuencia[j]!=secuencia[j++]) {
	            		System.out.print(ficha.voltea());
	            		
	            	}else {
	            		System.out.print(ficha+" ");
	            	}
	            }
	        }
	        
	     
	    }
		
	}


