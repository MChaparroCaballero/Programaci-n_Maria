package ejercicios_POO_III_2;

public class Habitacion {
	private int numhabitacion;
	private String tipo;
	private boolean ocupada;
	
	Habitacion(){
		numhabitacion = 1;
		tipo = "simple";
		ocupada = false;
	}
		public Habitacion(int numerohabitacion, String tipo) {
	        this.numhabitacion = numerohabitacion;
	        this.tipo = tipo;
	        this.ocupada = false;
	    }

	    public int getNumeroHabitacion() {
	        return numhabitacion;
	    }

	    public void setNumeroHabitacion(int numhabitacion) {
	        this.numhabitacion = numhabitacion;
	    }
	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    public boolean esOcupada() {
	        return ocupada;
	    }

	    public void setOcupada(boolean ocupada) {
	        this.ocupada = ocupada;
	    }
	}
	


