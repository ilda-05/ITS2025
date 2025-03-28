package prove;

import java.util.Scanner;

public class ProvaCentralinoTelefonico {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
	
		boolean gira = true;
		
		metodoMenu(input, gira);
		
	}

	private static void metodoMenu(Scanner input, boolean gira) {
		while(gira) {
			
			menu();
			
			String risposta = input.nextLine();
			
			switch(risposta) {
			
			case "1" :
				System.out.println("Sono l'operatore Jimmy, dimmi");
				break;
			case "2" :
				System.out.println("Il tuo saldo è 3 euro");
				break;
			case "3" :
				System.out.println("Credito ricaricato");
				break;
			case "4" :
				System.out.println("Contratto rinnovato");
				break;
			case "0" :
				System.out.println("Sei uscito");
				gira = false;
				break;
			default :
				System.out.println("Inserisci un'opzione valida da 0 a 4");
				break;
			
			}
			
		}
	}
	
	private static void menu() {
		
		System.out.println("1) Parlare con un operatore");
		System.out.println("2) Conoscere il tuo saldo");
		System.out.println("3) Ricarica cellulare");
		System.out.println("4) Nuovo contratto");
		System.out.println("0) Terminare la chiamata");
		
		
	}

}
