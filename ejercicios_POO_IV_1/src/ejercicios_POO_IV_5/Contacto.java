package ejercicios_POO_IV_5;

public class Contacto {
String nombre;
int num_tel;
String email;

	public Contacto(String nombre, int num_tel, String email) {
		this.nombre=nombre;
		this.num_tel=num_tel;
		this.email=email;
	}

	
	public void setNombre(String nombre) {//setter//
		this.nombre = nombre;
	}
	
	public String getNombre() {//getter//
		return nombre;
	}

	public void setNum_tel(int num_tel) {//setter//
		this.num_tel = num_tel;
	}

	public int getNum_tel() {//getter//
		return num_tel;
	}

	public void setEmail(String email) {//setter//
		this.email = email;
	}

	public String getEmail() {//getter//
		return email;
	}

	
}
