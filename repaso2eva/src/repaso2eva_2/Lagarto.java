package repaso2eva_2;

public class Lagarto extends Animal {

	 // Método específico de los lagartos para tomar el sol
    public void tomarSol() {
        System.out.println("El lagarto está tomando el sol sobre una roca.");
    }
    
    // Método para reptar
    public void reptar() {
        System.out.println("El lagarto está reptando por el suelo.");
    }
    
    // Método para comer
    @Override
    public void comer() {
        System.out.println("El lagarto está cazando insectos con su lengua.");
    }

}
