/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 1 - Sekuntikello
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
 * Päivämäärä: 18.9.2025
 */

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        // Voit kokeilla ohjelmasi toimintaa täällä
        
        Sekuntikello sekuntikello = new Sekuntikello();

        while (true) {
            System.out.println(sekuntikello);
            sekuntikello.etene();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
