package gestioniStipendi;

public abstract class Dipendente {
	
		String name;
		String lastname;
		double stipendioBase;
		
		public Dipendente(String name, String lastname, double stipendioBase) {
			this.name = name;
			this.lastname = lastname;
			this.stipendioBase = stipendioBase;
		}
		
		abstract double calcoloStipendio();
		
}		
