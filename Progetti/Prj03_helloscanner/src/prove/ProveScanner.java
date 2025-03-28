package prove;

import java.util.Scanner;

public class ProveScanner {

	public static void main(String[] args) {
		
		System.out.println("ciao socio, come ti chiami?");
		
		Scanner giorno = new Scanner(System.in);
		
		String nome = giorno.nextLine();
	
		System.out.println("ciao " + nome);
		
		System.out.println("user");
		
		String usr = giorno.nextLine();
		
		System.out.println("pass");
		
		String pass = giorno.nextLine();
		
		if( usr.equals("dario") && pass.equals("123")) {
			
			System.out.println("Sei entrato");
			
		}
		else {
			
			System.out.println("GET OUTT");
			
		}
		
	}
	
}