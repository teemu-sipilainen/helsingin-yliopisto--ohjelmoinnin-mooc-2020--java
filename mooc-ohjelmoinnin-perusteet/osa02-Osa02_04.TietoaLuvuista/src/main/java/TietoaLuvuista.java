/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 4 - Tietoa luvuista
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
 * Päivämäärä: 20.8.2025
 */

import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensimmainenLuku = Integer.valueOf(lukija.nextLine());
        int toinenLuku = Integer.valueOf(lukija.nextLine());
        
        if (ensimmainenLuku > toinenLuku) {
            System.out.println("Luku " + ensimmainenLuku + 
                " on suurempi kuin luku " + toinenLuku + ".");
        } else if (ensimmainenLuku < toinenLuku) {
            System.out.println("Luku " + ensimmainenLuku + 
                " on pienempi kuin luku " + toinenLuku + ".");
        } else {
            System.out.println("Luku " + ensimmainenLuku + 
                " on yhtä suuri kuin luku " + toinenLuku + ".");
        }
    }
}
