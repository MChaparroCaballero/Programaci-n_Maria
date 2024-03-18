package repaso2eva_2;

public class Canario extends Ave {

	  // Método específico de los canarios para cantar
    public void cantar() {
        System.out.println("El canario está cantando melodías.");
    }
    
    // Método para jugar
    @Override
    public void comer() {
        System.out.println("El canario está picoteando sus semillas.");
    }
    
    // Método para revolotear
    public void revolotear() {
        System.out.println("El canario está revoloteando en su jaula.");
    }

}
