package repaso2eva4;

public class Pizza {
	private String tamaño;
	private String tipo;
	private String estado;
	 private static int totalPedidas = 0;
	 private static int totalServidas = 0;
	
	public Pizza( String tipo, String tamaño) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		
		this.estado = "pedida";
		 totalPedidas++;
		
		
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void servir() {
        if (estado.equals("pedida")) {
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("¡Esta pizza ya ha sido servida!");
        }
    }
	
	  public static int getTotalPedidas() {
	        return totalPedidas;
	    }
	    
	    public static int getTotalServidas() {
	        return totalServidas;
	    }
	    
	    // Método para imprimir la información de la pizza
	    public void imprimirInfo() {
	        System.out.println("Pizza " + tipo + " - Tamaño: " + tamaño + " - Estado: " + estado);
	    }
}
