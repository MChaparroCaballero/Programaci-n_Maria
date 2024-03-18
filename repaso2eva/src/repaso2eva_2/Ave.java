package repaso2eva_2;

public class Ave extends Animal {
	 // Método específico de las aves para volar
    public void volar() {
        System.out.println("El ave está volando.");
    }
    
    // Método para comer
    @Override
    public void comer() {
        System.out.println("El ave está picoteando su comida.");
    }
    
    // Método para anidar
    public void anidar() {
        System.out.println("El ave está construyendo su nido.");
    }

}
