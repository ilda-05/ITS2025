package figure;

public class Triangolo {

	Punto a, b, c;
	Segmento ab, ac, bc;
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a,b);
		this.ac = new Segmento(a,c);
		this.bc = new Segmento(b,c);
	}
	
	public double perimetro() {
		
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
		
	}
	
	public double area() {
		
		double sp=perimetro()/2;
		
		double area = Math.sqrt(sp * (sp - ab.lunghezza()) * (sp - ac.lunghezza()) * (sp-bc.lunghezza()));
		
		return area;
		
	}

	@Override
	public String toString() {
		return "Triangolo [perimetro()=" + perimetro() + ", area()=" + area() + "]";
	}
	
	
	
}
