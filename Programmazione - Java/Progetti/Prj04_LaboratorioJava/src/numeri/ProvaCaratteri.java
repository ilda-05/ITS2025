package numeri;

public class ProvaCaratteri {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = 'b';
		char c3 = 'c';
		
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		
		for(int i = 0; i < 32268; i++) {
			
			//System.out.println(("il valore di i : "+i+" char : " + (char)i));
			System.out.print( (char) i );
			
			if (i%80 == 0)
				System.out.println();
			
		}

	}

}
