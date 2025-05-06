package banca2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	// STATO SPORTELLO BANCARIO	
	boolean statoSportello = true;
	
	Scanner scan = new Scanner(System.in);
	// CREAZIONE ISTANZA BANCA 
	Banca intesaSP = new Banca("Intesa S.P.");
	
	// CREAZIONE ISTANZA CONTI INSERITI PER DEFAULT IN ARRYLIST BANCA
	new Conto("Paperino", 1001, 2000, intesaSP);
	
	
	System.out.printf("Benvenuto in %s\nInserisci numero di carta: ",intesaSP.getName());
	
	// INSERIMENTO NUMERO DI CARTA 
		long numeroConto = scan.nextLong();
		// PULIZIA BUFFER
		scan.nextLine();
	
	do{
		
		// VALIDAZIONE E GENERAZIONE DI ERRORE SE NUMERO DI CONTO SIA PRESENTE O NO NELL'ARRAYLIST DI BANCA 
		if(intesaSP.checkCarta(numeroConto) != 0){
			
			/* ENTRATA + EFFETTUAZIONE SCELTA */
			System.out.println("Benvenuto " + intesaSP.getNameConto(numeroConto) + " in " + intesaSP.getName()+"\neffettua un operazione:");
			
			while(statoSportello) {
				System.out.println("[1] > Depositare\n[2] > Prelevare\n[3] > Saldo\n[4] > ESCI");
				int scelta = scan.nextInt();
				scan.nextLine();
				
				// BLOCCO SWITCH 
				switch(scelta) {
				case 1:
					System.out.print("Inserisci importo da depositare: ");
					int deposito = scan.nextInt();
					// PULIZIA DEL BUFFER 
					scan.nextLine();
					intesaSP.setDeposito(deposito, numeroConto);
					break;
				// GESTIONE PRELIEVO	
				case 2:
					System.out.println("\nSeleziona importo da prelevare:\n[1] > €20\t[2] > €200\n[3] > €50\t[4] > €500\n[5] > €100\t[6] > ESCI.");
					int importo = -1;
					
					while(importo < 0) {
						int scelta2 = scan.nextInt();
						scan.nextLine();
							// BLOCCO SWITCH AVANZATO
							importo = switch(scelta2){
							case 1 -> 20;
							case 2 -> 200;
							case 3 -> 50;
							case 4 -> 500;
							case 5 -> 100;
							case 6 -> 0;
							default -> {System.out.println("Scelta non valida, Reinserisci.");
								yield -1;}
							};
					}	
					if(importo > 0) {
						String prelievo = String.format("Hai prelevato: €%.2f",intesaSP.getPrelievo(importo, numeroConto));
						System.out.println(prelievo);
					}
					break;
				// GESTIONE SALDO	
				case 3:
					System.out.println("Il tuo saldo attuale ammonta a: €"+ intesaSP.getSaldo(numeroConto));
					break;
				// USCITA	
				case 4:
					System.out.println("Grazie " + intesaSP.getNameConto(numeroConto) + " per aver usato la nostra banca\nArrivederci !!!");
					statoSportello = false;
					break;
				// GESTIONE DEGLI ERRORI	
				default:
					System.out.println("Scelta non valida, riprova !!");
				}
			}
			
			
		}else{
			System.out.printf("Il numero di carta da te inserito \"%d\" e' invalido\n[1] > Reinserisci numero di carta.\n[2] > Crea nuovo conto.\n[3] > Esci.",numeroConto);
			int scelta = scan.nextInt();
			// PULIZIA BUFFER
			scan.nextLine();
			//REINSERIMENTO DI N CARTA
			if(scelta == 1) {
				// INSERIMENTO NUMERO DI CARTA 
				numeroConto = scan.nextLong();
				// PULIZIA BUFFER
				scan.nextLine();
			}
			// CREAZIONE DI UN NUOVO CONTO
			else if(scelta == 2){
				System.out.print("Inserisci Nome Completo: ");
				String fullName = scan.nextLine();
				new Conto(fullName,intesaSP);
				System.out.println(intesaSP.getLastConto());
			}
			// USCITA DA PROGRAMMA
			else{
				break;
			}
				
			
		}
		
	}while(statoSportello);
	
	
	scan.close();
	}
}
