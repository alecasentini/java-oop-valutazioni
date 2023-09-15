package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Studente[] studenti = new Studente[20];
        Random rand = new Random();

        int promossi = 0;
        int bocciati = 0;

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
            } else {
                bocciati++;
            }

            studenti[i].printResult();
        }

        String[] listaPromossi = new String[promossi];
        String[] listaBocciati = new String[bocciati];

        int promossiIndex = 0;
        int bocciatiIndex = 0;

        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i].calcoloPromozione()) {
                listaPromossi[promossiIndex] = "Studente " + studenti[i].id;
                promossiIndex++;
            } else {
                listaBocciati[bocciatiIndex] = "Studente " + studenti[i].id;
                bocciatiIndex++;
            }
        }
        
        System.out.println("Studenti promossi:");
        for (int i = 0; i < listaPromossi.length; i++) {
            System.out.println(listaPromossi[i]);
        }

        System.out.println("Studenti bocciati:");
        for (int i = 0; i < listaBocciati.length; i++) {
            System.out.println(listaBocciati[i]);
        }

        System.out.println("Totali promossi: " + promossi + " su 20");
        
        double votoMassimoPromossi = -1.0; 
        int idMaxPromossi = -1;

        for (int i = 0; i < listaPromossi.length; i++) {
            int idStudente = Integer.parseInt(listaPromossi[i].substring(9)); 
            if (studenti[idStudente - 1].mediaVoti > votoMassimoPromossi) {
                votoMassimoPromossi = studenti[idStudente - 1].mediaVoti;
                idMaxPromossi = idStudente;
            }
        }

        double votoMinimoBocciati = 6.0; 
        int idMinBocciati = -1;

        for (int i = 0; i < listaBocciati.length; i++) {
            int idStudente = Integer.parseInt(listaBocciati[i].substring(9)); 
            if (studenti[idStudente - 1].mediaVoti < votoMinimoBocciati) {
                votoMinimoBocciati = studenti[idStudente - 1].mediaVoti;
                idMinBocciati = idStudente;
            }
        }

        System.out.println("Voto più alto tra i promossi: Studente " + idMaxPromossi);
        System.out.println("Voto più basso tra i bocciati: Studente " + idMinBocciati);
    }
}
