package gestioniStipendi;

public class Main {

	public static void main(String[] args) {
		Impiegato[] impiegati = {
				new Impiegato("Pippo", "Rossi", 1800),
				new Impiegato("Paperino", "Gialli", 1600),
				new Impiegato("Topolino", "Verdi", 1700)
		};
		
		Manager mana1 = new Manager("Zio Papero" , "Gialli", 2200, 300);

		for(Impiegato impiegato : impiegati) {
			impiegato.stampaDettagli();
		}
		
		mana1.stampaDettagli();
		
	}

}
