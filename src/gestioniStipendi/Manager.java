package gestioniStipendi;

public class Manager extends Dipendente implements Stampabile {

		private double bonus;
		
		
		public Manager(String name, String lastname, double stipendioBase, double bonus) {
			super(name, lastname, stipendioBase);
			this.bonus = bonus;
		}
		
		
		
		public double getBonus() {
			return bonus;
		}



		public void setBonus(double bonus) {
			this.bonus = bonus;
		}



		@Override
		public double calcoloStipendio() {
			return this.stipendioBase + this.getBonus();
		}
		
		@Override
		public void stampaDettagli() {
			String format = String.format("%.2f", this.calcoloStipendio());
			System.out.println("Il Manager "+ this.name +" "+ this.lastname + " percepisce: €"+ format);
		}
}
