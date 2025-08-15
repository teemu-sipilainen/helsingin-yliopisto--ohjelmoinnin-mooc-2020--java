/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 11 - Muuttuvat muuttujat
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

public class MuuttuvatMuuttujat {

    public static void main(String[] args) {
        // MUUTA NÄITÄ:

        int kanojenLkm = 9000;
        double pekoninPaino = 0.1;
        String traktori = "Zetor";

        // ÄLÄ MUUTA NÄITÄ:
        System.out.println("Kanoja:");
        System.out.println(kanojenLkm);
        System.out.println("Pekonia (kg):");
        System.out.println(pekoninPaino);
        System.out.println("Traktori:");
        System.out.println(traktori);
        System.out.println("");
        System.out.println("Tässä vielä tiivistelmä:");
        System.out.println(kanojenLkm);
        System.out.println(pekoninPaino);
        System.out.println(traktori);
    }
}
