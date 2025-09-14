/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 12 - Mittari
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
 * Päivämäärä: 11.9.2025
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit tehdä kokeiluja
        
        Mittari m = new Mittari();

        while(!m.taynna()) {
            System.out.println("Ei täynnä! Mitta: " + m.mitta());
            m.lisaa();
        }

        System.out.println("Täynnä! Mitta: " + m.mitta());
        m.vahenna();
        System.out.println("Ei täynnä! Mitta: " + m.mitta());
    }
}
