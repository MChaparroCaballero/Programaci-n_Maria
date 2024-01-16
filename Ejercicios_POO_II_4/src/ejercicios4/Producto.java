package ejercicios4;

public class Producto {// propiedades//
	private String nombre;
	private double precio;
	private int stock;

	Producto() {//constructor//
		nombre = "Naranjas";
		precio = 0.67;
		stock = 50;
	}

	public void set_nombre(String nnombre) {//setter//

		nombre = nnombre;
	}

	public String get_nombre() {//getter//
		return " producto " + nombre;
	}

	public void set_precio(double nprecio) {//setter//

		precio = nprecio;
	}

	public String get_precio() {//getter//
		return " es " + precio + " euros ";
	}

	public void set_stock(int nstock) {//setter//
		if (nstock >= 0) {
			stock = nstock;
		} else {
			nstock = (Integer) null;
		}
	}

	public String get_stock() {//getter//
		return " es de " + stock + " unidades ";
	}

}
