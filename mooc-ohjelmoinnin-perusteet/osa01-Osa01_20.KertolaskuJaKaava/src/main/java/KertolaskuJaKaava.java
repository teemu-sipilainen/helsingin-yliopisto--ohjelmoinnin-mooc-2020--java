/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 20 - Kertolasku ja kaava
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

public class KertolaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        System.out.println("Syötä ensimmäinen luku!");
        int syotettyEnsimmainenLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int syotettyToinenLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println(syotettyEnsimmainenLuku + " * " + syotettyToinenLuku + 
            " = " + (syotettyEnsimmainenLuku * syotettyToinenLuku)
        );
    }
}
