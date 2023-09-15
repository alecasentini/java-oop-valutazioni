package org.lessons.java.valutazioni;

public class Studente {
	
	public int id;
	public int percentualeAssenze;
	public double mediaVoti;

	public boolean calcoloPromozione() {
		if(percentualeAssenze > 50) {
			return false;
		} else if (percentualeAssenze >= 25 && mediaVoti <= 2) {
			return false;
		} else if (percentualeAssenze < 25 && mediaVoti < 2) {
			return false;
		} else {
			return true;
		}
	};
	
	public void printResult() {
		System.out.println("Studente " + id + ": ");
		System.out.println("Percentuale Assenze: " + percentualeAssenze);
		System.out.printf("Media Voti: %.2f\n", mediaVoti);
		System.out.println("Promosso: " + (calcoloPromozione() ? "Sì" : "No"));
		System.out.println("-------------------");
	}
	
}
