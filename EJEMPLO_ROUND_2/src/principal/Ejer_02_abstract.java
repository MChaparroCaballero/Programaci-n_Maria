package principal;

import java.util.ArrayList;

import clases_herencia.Circulo;
import clases_herencia.Cuadrado;
import clases_herencia.FigurasGeometricas;
import clases_herencia.Rectangulo;

public class Ejer_02_abstract {

	public static void main(String[] args) {
		//creamos arraylist//
		ArrayList<FigurasGeometricas> lista = new ArrayList<FigurasGeometricas>();
		//añadimos instancias de cuadrado//
		lista.add(new Cuadrado(10));
		lista.add(new Cuadrado(103));
		lista.add(new Cuadrado(104));

		//añadimos instancias de rectangulo//
		lista.add(new Rectangulo(20, 10));
		lista.add(new Rectangulo(30, 20));
		lista.add(new Rectangulo(10, 43));
		
		//añadimos instancias de circulo//
		lista.add(new Circulo(50));
		lista.add(new Circulo(10));
		lista.add(new Circulo(10));
		
		for(FigurasGeometricas p : lista) {
			//imprimimos formatos a no se. 2 decimas //
			System.out.printf("area=%.2f perimetro=%.2f s\n",
					p.area() , + p.perimetro(), p);
		}
	}

}
