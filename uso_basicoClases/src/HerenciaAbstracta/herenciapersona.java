package HerenciaAbstracta;

public class herenciapersona extends Persona {
	private int edad;

	public herenciapersona(String nombre, int edad) {
		super(nombre);
		this.edad=edad;
		
	}
	

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public void infO() {
		System.out.println("Nombre: " + getNombre() + " edad: "  + edad);
		
	}

}
