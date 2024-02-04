package ejercicios_POO_VII_4;

import javax.swing.JOptionPane;

public class Validador {
	
	private static String contra;
	
	Validador(String contra){
		this.contra= contra;
		
	}
	
	
	

	    public String getContra() {
		return contra;
	}




	public void setContra(String contra) {
		this.contra = contra;
	}




		// Método para validar si una cadena es un número
	    public static void esNumero(String getContra) {
	        try {
	        	
	            Double.parseDouble(contra);
	            JOptionPane.showMessageDialog(null, "La cadena es un número.");
	           
	        } catch (NumberFormatException e) {
	        	JOptionPane.showMessageDialog(null, "La cadena no es un número.");
	            
	        }
	    }

	    // Método para validar si un número está en un rango específico
	    public static void estaEnRango(String contra) {
	    	double rangomin = 0;
	    	double rangomax = 100;
	    	double num = Double.parseDouble(contra);
	    	if(num >=rangomin && num <= rangomax) {
	    	JOptionPane.showMessageDialog(null, "La cadena es un número entre " + rangomin + " y " + rangomax);
	    	}else {
	    		JOptionPane.showMessageDialog(null, "La cadena es un número fuera del rango de " + rangomin + " y " + rangomax);
	    	}
	    	contra = String.valueOf(num);
	    	
	    }

	    // Método para validar si una cadena es una letra
	    public static void esLetra(String contra) {
	    	if(contra.matches("[a-zA-Z]+")) {
	    		JOptionPane.showMessageDialog(null, "La cadena es una letra / formada por letras");
	    	}else {
	    		JOptionPane.showMessageDialog(null, "La cadena no es una letra.");
	    	}
	       
	    }

	   
	}


