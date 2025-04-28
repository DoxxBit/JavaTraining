package EsercizioAuto;
import java.util.Scanner;



public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci Marca auto:");
		String marca = scan.next();
		System.out.print("Inserisci Modello auto: ");
		String modello = scan.next();
		System.out.print("Inserisci Anno di immatricolazione: ");
		int anno = scan.nextInt();
		
		Auto auto1 = new Auto();
		
		Auto auto2 = new Auto(marca, modello, anno);
		auto2.stampaAuto();
		
		
		scan.close();
	}
}


