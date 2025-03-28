package gioco;

public class GiocoDadiUguali {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		long start_tempo = System.currentTimeMillis();
		
		int vittoriaDado1 = 0;
		int vittoriaDado2 = 0;
		int pareggio = 0;
		
		final int NUM_LANCI = 100000000;
		
		dado1.lanciaDado();
		dado2.lanciaDado();
		
		System.out.println("dado1 : " + dado1.valoreFacciaSuperiore);
		System.out.println("dado2 : " + dado2.valoreFacciaSuperiore);
		
		if (dado1.valoreFacciaSuperiore == dado2.valoreFacciaSuperiore)
			System.out.println("hai vinto");
		else 
			System.out.println("hai perso");
		
		for(int i = 0; i < NUM_LANCI; i++) {
			
			dado1.lanciaDado();
			dado2.lanciaDado();
			
			if(dado1.valoreFacciaSuperiore > dado2.valoreFacciaSuperiore) {
				
				vittoriaDado1++;
				
			}
			else if (dado1.valoreFacciaSuperiore == dado2.valoreFacciaSuperiore) {
				
				pareggio++;
				
			}
			else {
				
				vittoriaDado2++;
				
			}
			
		}
		
		long stop_tempo = System.currentTimeMillis();

		System.out.println("numero vittorie dado1 : " + vittoriaDado1);	
		System.out.println("numero vittorie dado2 : " + vittoriaDado2);
		System.out.println("numero pareggio : " + pareggio);	
		System.out.println( "percentuale vittorie dado1 : " + (float) vittoriaDado1/NUM_LANCI*100);	
		System.out.println( "percentuale vittorie dado2 : " +(float) vittoriaDado2/NUM_LANCI*100);	
		System.out.println( "percentuale pareggio : " +(float) pareggio/NUM_LANCI*100);	
		System.out.println(stop_tempo-start_tempo);
		
		
	}

}
