package gestioniStipendi;

public class Impiegato extends Dipendente implements Stampabile {

	
		public Impiegato(String name, String lastname, double stipendioBase) {
			super(name, lastname, stipendioBase);
		}
		
		@Override
		public double calcoloStipendio() {
			return this.stipendioBase;
		}
		
		@Override
		public void stampaDettagli(){
			String format = String.format("%.2f", this.calcoloStipendio());
			System.out.println("L\'impiegato " +this.name +" "+ this.lastname + " percepisce: €"+ format);
		}
}
