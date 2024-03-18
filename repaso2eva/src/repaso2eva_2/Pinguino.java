package repaso2eva_2;

public class Pinguino extends Ave {

	 // Método específico de los pingüinos para nadar
    public void nadar() {
        System.out.println("El pingüino está nadando en el agua.");
    }
    
    // Método para pescar
    public void pescar() {
        System.out.println("El pingüino está pescando en el mar.");
    }
    
    // Método para proteger
    @Override
    public void moverse() {
        System.out.println("El pingüino se desliza sobre el hielo.");
    }
}
