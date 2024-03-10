package repaso2eva_2;

public class Gato extends Mamifero {
	private String color;
	

	public Gato(String color) {
		super();
		this.color = color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void info() {
		super.info();
		System.out.println(color);
	}

	public static void sonido() {
		System.out.print("meow");
	}
}
