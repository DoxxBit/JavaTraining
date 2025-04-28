package EsercizioAuto;

public class Auto {
	String marca = "Fiat";
	String modello = "Panda";
	int annoDiImmatricolazione = 2003;
	
	public Auto(String marca, String modello, int annoDiImmatricolazione){
		this.marca = marca;
		this.modello = modello;
		this.annoDiImmatricolazione = annoDiImmatricolazione;
	}
	public Auto(){
		stampaAuto();
	}
	
	public void stampaAuto(){
		System.out.println("\nQuesta auto e' una " + this.marca + " " + this.modello + "\nimmatricolata in anno: "+ this.annoDiImmatricolazione);
	}
}
