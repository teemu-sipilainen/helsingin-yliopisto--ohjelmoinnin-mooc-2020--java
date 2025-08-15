/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 15 - Muuttujien lukeminen yhdessä
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
 * Päivämäärä: 15.8.2025
 */

import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        System.out.println("Syötä merkkijono!");
        String syotettyMerkkijono = lukija.nextLine();
        
        System.out.println("Syötä kokonaisluku!");
        int syotettyKokonaisluku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä liukuluku!");
        double syotettyLiukuluku = Double.valueOf(lukija.nextLine());
        
        System.out.println("Syötä totuusarvo!");
        boolean syotettyTotuusarvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + syotettyMerkkijono);
        System.out.println("Syötit kokonaisluvun " + syotettyKokonaisluku);
        System.out.println("Syötit liukuluvun " + syotettyLiukuluku);
        System.out.println("Syötit totuusarvon " + syotettyTotuusarvo);
    }
}
