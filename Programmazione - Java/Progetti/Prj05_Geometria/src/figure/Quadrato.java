package figure;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	/**
	 * 
	 * @param lato
	 */
	public Quadrato(Segmento lato) {
		super(lato, lato);
		
		this.lato = lato;
		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		System.out.println("Metodo di Quadrato");
		return lato.lunghezza() * 4;
	}

	@Override
	public String toString() {
		return "Quadrato [perimetro()=" + perimetro() + ", area()=" + area() + "]";
	}
	
}
