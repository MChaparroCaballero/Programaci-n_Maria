package ejer05;



public class Principal {


	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FichaDomino[] Fichas = new FichaDomino[8];
		Fichas [0]= new FichaDomino(alea(0,6), alea(0,6));
		
		
		for(int i=1;i<Fichas.length;i++) {
			Fichas[i]=new FichaDomino(Fichas[i-1].getLado2(),alea(0,6));
		}
		
		for(int i=0; i<Fichas.length;i++) {
			System.out.print(Fichas[i]);
			
		}
		
	}

}
