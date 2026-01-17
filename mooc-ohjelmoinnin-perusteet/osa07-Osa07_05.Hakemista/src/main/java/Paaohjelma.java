/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 5 - Hakemista
 * 
 * Huom: Tämä on vanhan (2020) kurssin tehtävä. 
 * Kurssia ei ole järjestetty vuoden 2020 jälkeen, 
 * joten sillä ei voi olla opiskelijana eikä siitä 
 * voi saada opintopisteitä tai suoritusmerkintää. 
 * Tehtävien tekemishetkellä materiaali ja tehtävät 
 * olivat edelleen avoimesti saatavilla verkossa:
 * https://ohjelmointi-20.mooc.fi/
 *
 * Tekijä: Teemu Sipiläinen
 * Päivämäärä: 24.10.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // Alla on ohjelma tehtävässä toteuttamiesi hakualgoritmien testaamiseen.
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        System.out.println("Kuinka monta kirjaa luodaan?");
        int kirjoja = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < kirjoja; i++) {
            kirjat.add(new Kirja(i, "nimi kirjalle " + i));
        }

        System.out.println("Millä tunnuksella haetaan kirjaa?");
        int haettava = Integer.valueOf(lukija.nextLine());

        System.out.println("");
        System.out.println("Haetaan peräkkäishaulla:");
        long alku = System.currentTimeMillis();
        int perakkaishakuId = perakkaishaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (perakkaishakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(perakkaishakuId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Haetaan binäärihaulla:");
        alku = System.currentTimeMillis();
        int binaarihakuId = perakkaishaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (binaarihakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(binaarihakuId));
        }

    }

    // Osa 1
    public static int perakkaishaku(ArrayList<Kirja> kirjat, int haettavaId) {
        if (kirjat.isEmpty()) {
            return -1;
        }
        
        for (int i = 0; i < kirjat.size(); i++) {
            if (kirjat.get(i).getId() == haettavaId) {
                return i;
            }
        }
        return -1;
    }

    // Osa 2
    public static int binaarihaku(ArrayList<Kirja> kirjat, long haettavaId) {
        if (kirjat.isEmpty()) {
            return -1;
        }

        int alku = 0;
        int loppu = kirjat.size() - 1;
        
        while (alku <= loppu) {
            int i = (alku + loppu) / 2;
            
            if (haettavaId < kirjat.get(i).getId()) {
                loppu = i - 1;
            } else if (kirjat.get(i).getId() < haettavaId) {
                alku = i + 1;    
            } else {
                return i;
            }
        }
        
        return -1;
    }
}

