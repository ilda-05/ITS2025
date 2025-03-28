package figure;

public class Segmento {

	public Punto a, b;

	public Segmento(Punto a, Punto b) {
		
		this.a = a;
		this.b = b;
	}
	
	public double lunghezza() {
		
		return Math.sqrt( Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
		
	}
	
	@Override //sovrascrittua di un metodo di una super classe
	public String toString() {
		return "Segmento (" + " punto a = " + a + ", punto b = " + b +" lunghezza = " +lunghezza() + ")";
	}
	

	
}
