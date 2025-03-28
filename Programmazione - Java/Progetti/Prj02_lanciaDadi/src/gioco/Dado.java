package gioco;

public class Dado {

	byte facce = 6;
	
	int valoreFacciaSuperiore = 1;
	
	void lanciaDado() {
		
		valoreFacciaSuperiore = (int)(Math.random()*facce)+1;

	}
	
	
		
}

