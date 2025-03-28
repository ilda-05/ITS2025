package demo;

import figure.Punto;
import figure.Quadrato;
import figure.Rettangolo;
import figure.Segmento;
import figure.Triangolo;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		Segmento ab = new Segmento(a, b);
		Segmento ac = new Segmento(a, c);
		
		System.out.println(ab);
		
		Triangolo tr1 = new Triangolo(a, b, c);
		
		System.out.println(tr1);
		
		Rettangolo rt1 = new Rettangolo(ab, ac);
		
		System.out.println(rt1);
		
		Quadrato qt1 = new Quadrato(ab);
		
		System.out.println(qt1);
		
		
		
	}

}
