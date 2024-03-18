package repaso2eva5;

public class Tiempo {
	   // Atributos
    private int horas;
    private int minutos;
    private int segundos;
    
    // Constructor
    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    // Método para sumar un tiempo dado a este tiempo
    public void suma(Tiempo otroTiempo) {
        segundos += otroTiempo.segundos;
        minutos += otroTiempo.minutos;
        horas += otroTiempo.horas;
        
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos %= 60;
        }
        if (minutos >= 60) {
            horas += minutos / 60;
            minutos %= 60;
        }
    }
    
    // Método para restar un tiempo dado a este tiempo
    public void resta(Tiempo otroTiempo) {
        segundos -= otroTiempo.segundos;
        minutos -= otroTiempo.minutos;
        horas -= otroTiempo.horas;
        
        if (segundos < 0) {
            segundos += 60;
            minutos--;
        }
        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        if (horas < 0) {
            horas += 24;
        }
    }
    
    // Método toString para representar el tiempo en formato "Xh Ym Zs"
    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}
