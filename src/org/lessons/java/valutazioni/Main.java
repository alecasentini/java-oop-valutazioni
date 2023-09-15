package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Studente[] studenti = new Studente[20];
		Random rand = new Random();
		
		int promossi = 0;

		for (int i = 0; i < studenti.length; i++) {
			int id = i + 1;
			int percentualeAssenze = rand.nextInt(101); 
			double mediaVoti = rand.nextDouble() * 5; 

			studenti[i] = new Studente();
			studenti[i].id = id;
			studenti[i].percentualeAssenze = percentualeAssenze;
			studenti[i].mediaVoti = mediaVoti;
			
			if (studenti[i].calcoloPromozione()) {
				promossi++;
			}

			studenti[i].printResult();
		}
		
		System.out.println("Totali promossi: " + promossi + " su 20");
	}

}
