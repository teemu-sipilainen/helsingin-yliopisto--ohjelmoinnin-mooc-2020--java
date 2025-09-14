/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 11 - Elokuva
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
 * Päivämäärä: 10.9.2025
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla
        // Elokuva-luokkaasi. Kokeile esim:

        Elokuva chipmunks = new Elokuva("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä ikäinen olet?");
        int ika = Integer.valueOf(lukija.nextLine());

        System.out.println();
        if (ika >= chipmunks.ikaraja()) {
            System.out.println("Saat katsoa elokuvan " + chipmunks.nimi());
        } else {
            System.out.println("Et saa katsoa elokuvaa " + chipmunks.nimi());
        }
    }
}
