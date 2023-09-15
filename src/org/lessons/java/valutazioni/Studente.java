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
	}
}
