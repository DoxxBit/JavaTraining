package banca2;
import java.util.ArrayList;

public class Banca {
	private String name;
	private ArrayList<Conto> conti;
	
	public Banca(String name) {
		this.name = name;
		conti = new ArrayList<>();
	}
	public void addConti(Conto conto) {
		conti.add(conto);
	}
	
	public String getName() {
		return name;
	}
	
	// CHECK CHE IN BANCA CI SIA IL NUMNERO DI CONTO PASSATO
	public int checkCarta(long numeroCarta) {
		int check = 0;
		for(Conto conto : conti) {
			if(conto.getNumeroCarta() == numeroCarta) {
				check += 1;
			}
		}
		return check;
	}
	public String getNameConto(long numeroCarta) {
		String name = " ";
		for(Conto conto : conti) {
			if(conto.getNumeroCarta() == numeroCarta) {
				name = conto.getFullName();
			}
		}
		return name;
	}
	public void setDeposito(int deposito, long numeroCarta) {
		for(Conto conto : conti) {
			if(conto.getNumeroCarta() == numeroCarta) {
				double contoAttuale = conto.getConto();
				conto.setConto(contoAttuale += deposito);
			}
		}
	}
	public double getSaldo(long numeroCarta) {
		double saldo = 0;
		for(Conto conto : conti) {
			if(conto.getNumeroCarta() == numeroCarta) {
				saldo = conto.getConto();
			}
		}
		return saldo;
	}
	
	public double getPrelievo(int importo, long numeroCarta) {
		double prelievo = importo;
		for(Conto conto : conti) {
			if(conto.getNumeroCarta() == numeroCarta) {
				double contoAttuale = conto.getConto();
				if(prelievo > contoAttuale) {
					System.out.println("Importo troppo alto, controlla che il conto sia superiore al prelievo.");
					prelievo = 0;
				}else {
					conto.setConto(contoAttuale -= prelievo);	
				}
				
			}
		}
		return prelievo;
	}
	
	public Conto getLastConto(){
		return conti.get(conti.size()-1);
	}
	
}
