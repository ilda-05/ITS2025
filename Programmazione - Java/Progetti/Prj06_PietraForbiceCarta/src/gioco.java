import java.util.Random;
import java.util.Scanner;

public class gioco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] scelte = {"Pietra","Forbici","Carta"};
		
		String sceltaUmano = sceltaUmano(scelte);
		String sceltaMacchina = sceltaMacchina(scelte);
		System.out.println("Scelta umano : " + sceltaUmano);
		System.out.println("Scelta macchina : " + sceltaMacchina);
		
		
		
		risultatoPartita(sceltaUmano, sceltaMacchina);

	}

	private static void risultatoPartita(String sceltaUmano, String sceltaMacchina) {
		switch(sceltaUmano) {
		
			case "Pietra" : 
				
				if(sceltaMacchina=="Carta") {
					System.out.println("Hai perso");
					break;
				}
				else if (sceltaMacchina=="Forbici") {
					System.out.println("Hai Vinto");
					break;
				}
				else {
					System.out.println("Pareggio");
					break;
				}
			
			case "Forbici" : 
				
				if(sceltaMacchina=="Carta") {
					System.out.println("Hai vinto");
					break;
				}
				else if (sceltaMacchina=="Forbici") {
					System.out.println("Pareggio");
					break;
				}
				else {
					System.out.println("Hai perso");
					break;
				}
				
			case "Carta" : 
				
				if(sceltaMacchina=="Carta") {
					System.out.println("Pareggio");
					break;
				}
				else if (sceltaMacchina=="Forbici") {
					System.out.println("Hai perso");
					break;
				}
				else {
					System.out.println("Hai vinto");
					break;
				}
				
			default :
				
				System.out.println("input non valido");
			
		
		}
	}

	private static String sceltaMacchina(String[] scelte) {
		Random rand = new Random();
		int casuale = rand.nextInt(0,scelte.length);
		return scelte[casuale];
	}

	private static String sceltaUmano(String[] scelte) {
		System.out.println("Scegli tra : ");
		for(String scelta : scelte) {
			
			System.out.println(scelta);
			
		}
		
		Scanner input = new Scanner(System.in);
		String risposta = input.nextLine();
		return risposta;
	}

}
