package ejercicios_POO_III_2;

public class Habitacion {
	private int numhabitacion;
	private String tipo;
	private boolean ocupada;
	
	public Habitacion(int numhabitacion, String tipo){
		this.numhabitacion = numhabitacion;
		this.tipo = tipo;
		ocupada = false;
	}
		
	public void set_numhabitacion(int numhabitacion) { //setter
		if (numhabitacion < 1) {
			System.out.println("El número de habitación tiene que ser mayor a cero");
		}else {
			this.numhabitacion = numhabitacion;
		}
	}
	

	    public int get_numerohabitacion() {//getter//
	        return numhabitacion;
	    }

		public void set_tipo(String tipo) { //setter
			if (tipo.equalsIgnoreCase("simple") || tipo.equalsIgnoreCase("doble") || tipo.equalsIgnoreCase("suite")) {
				this.tipo = tipo;
			}else {
				System.out.println("Solo se  puede elegir entre ser tipo simple, doble o suite");
			}
		}
	   
	    public String get_tipo() {//getter//
	    	return tipo;
	    }
	    
	    public void setOcupada(boolean ocupada) {//setter//
	        this.ocupada = ocupada;
	    }
	    
	    public boolean esOcupada() {//getter//
	        return ocupada;
	    }

	    
	}
	


