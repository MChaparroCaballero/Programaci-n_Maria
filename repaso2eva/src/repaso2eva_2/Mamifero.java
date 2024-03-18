package repaso2eva_2;

public class Mamifero extends Animal {
	  public void amamantar() {
	        System.out.println("El mamífero está amamantando a sus crías.");
	    }
	    
	    // Método para caminar
	    @Override
	    public void moverse() {
	        System.out.println("El mamífero está caminando.");
	    }
	    
	    // Método para dormir
	    public void dormir() {
	        System.out.println("El mamífero está durmiendo.");
	    }
	}

