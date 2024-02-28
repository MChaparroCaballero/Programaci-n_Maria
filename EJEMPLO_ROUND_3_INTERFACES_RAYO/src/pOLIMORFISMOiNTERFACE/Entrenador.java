package pOLIMORFISMOiNTERFACE;

public class Entrenador extends SeleccionFutbol{
//atributos//
private int idFederacion;

//constructor//
public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
	super(id, nombre, apellidos, edad);
	this.idFederacion = idFederacion;
}

//adaptamos los metodos de seleccionfutbol a nuestra clase//
@Override
public String toString() {
	String cadena = "Entrenador [idFederacion=" + idFederacion + "]";
	//hace lo mismo que el append pero menos claro//
	cadena +="\n"+super.toString();
	return cadena;
}

@Override
public void concentrarse() {
	System.out.println("Concentrarse (Clase Entrenador)");
}

@Override
public void viajar() {
	System.out.println("viajar (Clase Entrenador)");
}

@Override
public void entrenar() {
	System.out.println("Entrenar (Clase Entrenador)");
}

@Override
public void jugarPartido() {
	System.out.println("Asistir en el partido (Clase Entrenador)");
}

	

}
