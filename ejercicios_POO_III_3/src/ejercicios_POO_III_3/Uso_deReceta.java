package ejercicios_POO_III_3;

public class Uso_deReceta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receta HuevoFrito = new Receta("Huevo Frito"); //instanciamos clase huevo frito
		//añadir e imprimir los ingredientes
		HuevoFrito.agregarIngrediente("Huevo");
		HuevoFrito.agregarIngrediente("Aceite");
		HuevoFrito.agregarIngrediente("Sal");
		
		//añadir e imprimir los pasos
		HuevoFrito.agregarPaso("Llenar la sarten con mucho aceite");
		HuevoFrito.agregarPaso("calentar el aceite");
		HuevoFrito.agregarPaso("romper el huevo y suavemente vertirlo sobre la sarten");
		HuevoFrito.agregarPaso("echar sal al huevo");
		HuevoFrito.agregarPaso("empujar aceite sobre el huevo con la espatula y aplastar pompas hasta que este a su gusto la llea");
		//mostrar la receta
		HuevoFrito.mostrarReceta();
	    }
	}
	
