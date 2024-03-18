package repaso2eva5;

public class uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo tiempo1 = new Tiempo(0, 30, 40);
        Tiempo tiempo2 = new Tiempo(0, 35, 20);
        
        System.out.println("Tiempo 1: " + tiempo1);
        System.out.println("Tiempo 2: " + tiempo2);
        
        tiempo1.suma(tiempo2);
        System.out.println("\nSuma de tiempo 1 y tiempo 2: " + tiempo1);
        
        tiempo1 = new Tiempo(1, 30, 40);
        tiempo2 = new Tiempo(0, 35, 20);
        
        System.out.println("\nTiempo 1: " + tiempo1);
        System.out.println("Tiempo 2: " + tiempo2);
        
        tiempo1.resta(tiempo2);
        System.out.println("\nResta de tiempo 1 y tiempo 2: " + tiempo1);
    }

}
