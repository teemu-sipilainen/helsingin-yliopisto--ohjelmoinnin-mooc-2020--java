/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 18 - Kolmen luvun summa
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
 * Päivämäärä: 17.8.2025
 */

import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        System.out.println("Syötä ensimmäinen luku!");
        int syotettyEnsimmainenLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int syotettyToinenLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä kolmas luku!");
        int syotettyKolmasLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Lukujen summa on " +
            (syotettyEnsimmainenLuku + syotettyToinenLuku + syotettyKolmasLuku)
        );
    }
}
