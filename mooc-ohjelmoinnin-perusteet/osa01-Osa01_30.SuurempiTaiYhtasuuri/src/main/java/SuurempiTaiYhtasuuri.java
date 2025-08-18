/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 30 - Suurempi tai yhtäsuuri
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
 * Päivämäärä: 18.8.2025
 */

import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku:");
        int syotettyEnsimmainenLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int syotettyToinenLuku = Integer.valueOf(lukija.nextLine());
        
        if (syotettyEnsimmainenLuku > syotettyToinenLuku) {
            System.out.println("Suurempi luku: " + syotettyEnsimmainenLuku);
        } else if (syotettyEnsimmainenLuku == syotettyToinenLuku) {
            System.out.println("Luvut ovat yhtä suuret!");
        } else {
            System.out.println("Suurempi luku: " + syotettyToinenLuku);
        }
    }
}
