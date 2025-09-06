/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 19 - Etsityn alkion indeksi
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
 * Päivämäärä: 6.9.2025
 */

import java.util.Scanner;

public class EtsitynAlkionIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[10];
        taulukko[0] = 6;
        taulukko[1] = 2;
        taulukko[2] = 8;
        taulukko[3] = 1;
        taulukko[4] = 3;
        taulukko[5] = 0;
        taulukko[6] = 9;
        taulukko[7] = 7;

        // System.out.print("Mitä etsitään? ");
        // TS 6.9.2025: Lisäsin rivinvaihdon tulostukseen, koska muuten 
        // "Mitä etsitään?" ei tulostunut ennen etsittävän luvun syöttämistä.
        System.out.println("Mitä etsitään? ");
        int etsittava = Integer.valueOf(lukija.nextLine());

        // Toteuta etsimistoiminnallisuus tänne
        
        boolean loytyi = false;
        
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == etsittava) {
                System.out.println("Luku " + etsittava + " löytyy indeksistä " + i + ".");
                loytyi = true;
            }
        }
        
        if (!loytyi) {
            System.out.println("Lukua " + etsittava + " ei löydy.");
        }
    }

}
