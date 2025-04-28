package Exercises;

public class Libro {
	
	String titolo;
	String autore;
	int numPagine;
	
	public Libro(String titolo, String autore, int numPagine) {
		
		this(); //stampa la classe liibro senza l'assegnazzione dei valori negli attributi di istanza.
		this.titolo = titolo;
		this.autore = autore;
		this.numPagine = numPagine;
		
	}
	
	public Libro(){
		stampaLibro();
	}
	
	
	public void stampaLibro(){
		System.out.println("L'Autore: " + this.autore + "\nTitolo: " + this.titolo + "\nNumero di pagine: " + this.numPagine);
	}

}
