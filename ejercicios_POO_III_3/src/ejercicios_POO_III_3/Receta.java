package ejercicios_POO_III_3;

import java.util.ArrayList;

public class Receta {
	//declarar variables
	  private String plato;
	  private ArrayList<String> ingredientes;
	  private ArrayList<String> pasos;
	 
	  //constructor
	  public Receta(String plato) {
	      this.plato = plato;
	      this.ingredientes = new ArrayList<>();
	      this.pasos = new ArrayList<>();
	  }
	  
	  public void setplato(String plato) { //setter
	      this.plato = plato;
	  }
	  
	  public String getplato() { //getter
	      return this.plato;
	  }
	 
	  public void setingredientes(ArrayList<String> ingredientes) { //setter
	      this.ingredientes = ingredientes;
	  }
	  public ArrayList<String> getingredientes() { //getter
	      return this.ingredientes;
	  }
	 
	  public void setpasos(ArrayList<String> pasos) { //setter
	      this.pasos = pasos;
	  }
	  public ArrayList<String> getpasos() { //getter
	      return this.pasos;
	  }
	  
	   public void agregarIngrediente(String ingrediente) { //método para añadir ingredientes a la lista de ingredientes
	  	this.ingredientes.add(ingrediente);
	  }
	   
	  public void eliminarIngrediente(String ingrediente) { //método para eliminar ingredientes de la lista de ingredientes
	  	this.ingredientes.remove(ingrediente);
	  }
	  public void agregarPaso(String paso) { //método para añadir pasos a la lista de pasos
	  	this.pasos.add(paso);
	  }
	  //método para mostrar la receta imprimiendo el nombre del plato, la lista de ingredientes y la de pasos
	  public void mostrarReceta() {
	      System.out.println("Receta para " + plato + ":");
	      System.out.println("\nIngredientes:");
	      for (String ingrediente : ingredientes) {
	          System.out.println("- " + ingrediente);
	      }
	    
	      System.out.println("\nPasos:");
	      int numPaso = 1;
	      for (String paso : pasos) {
	          System.out.println(numPaso++ + ". " + paso);
	      }
	  }
}
