package banca2;

public class Conto {
	static long generationNewCarta = 1003;
	private String fullName;
	private long numeroCarta;
	private double conto;
	
	// CONSTRUCCTOR PER GENERAZIONE DEL CONTO PER ISTANZA 
	public Conto(String fullName, long numeroCarta, double conto, Banca banca) {
		this.fullName = fullName;
		this.numeroCarta = numeroCarta;
		this.conto = conto;
		/* AGGIUNTA DI DEFAULT L'ISTANAZA DEL CONTO CREATO ALL'ARRAYLIST DI CONTI IN BANCA  */
		banca.addConti(this);
	}
	// CONSTRUCCTOR PER GENERAZIONE NEW CONTO DA INPUT
	public Conto(String fullName, Banca banca){
		this.fullName = fullName;
		this.numeroCarta = generationNewCarta;
		generationNewCarta++;
		this.conto = 0;
		banca.addConti(this);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(long numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public double getConto() {
		return conto;
	}

	public void setConto(double conto) {
		this.conto = conto;
	}
	
	@Override
	public String toString() {
		return "Al numero di Carta #" + this.numeroCarta + " intestata a " + this.fullName.toUpperCase() + "\nil saldo ammonta a: €" + this.conto;
	}
	
	
}
