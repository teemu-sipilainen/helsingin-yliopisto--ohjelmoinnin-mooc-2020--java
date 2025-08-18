/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 27 - Wanha
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

public class Wanha {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        
        System.out.println("Anna vuosiluku:");
        int syotettyVuosiluku = Integer.valueOf(lukija.nextLine());
        
        if (syotettyVuosiluku < 2015) {
            System.out.println("Wanha!");
        }
    }
}
