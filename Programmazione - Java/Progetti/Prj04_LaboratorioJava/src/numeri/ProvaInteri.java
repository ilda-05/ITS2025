package numeri;

public class ProvaInteri {

	public static void main(String[] args) {
		
		final byte b = 1; // 8 bit , final serve per rendere costante una variabile
		short s = 2; // 16 bit
		int i = 3; // 32 bit
		long lo = 4; // 64 bit
		
		int somma = b + s + i + (int)lo;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(lo);	
		System.out.println("LA SOMMA VALE : " + somma);

	}

}
