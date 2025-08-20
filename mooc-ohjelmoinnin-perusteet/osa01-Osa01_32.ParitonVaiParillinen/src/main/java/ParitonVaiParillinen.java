/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 32 - Pariton vai parillinen
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
 * Päivämäärä: 19.8.2025
 */

import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        // VIHJE:
        // parillisuuden voi selvittää helposti jakojäännösoperaattorilla %
        // kokeile mitä seuraavat komennot tulostavat
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // eli ottamalla luvusta kahden jakojäännöksen, selviää parillisuus!
        
        System.out.println("Anna luku:");
        int syotettyLuku = Integer.valueOf(lukija.nextLine());
        
        if (syotettyLuku % 2 == 0) {
            System.out.println("Luku " + syotettyLuku + " on parillinen.");
        } else {
            System.out.println("Luku " + syotettyLuku + " on pariton.");
        }
    }
}
