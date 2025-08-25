/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 24 - Parametrista yhteen
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
 * Päivämäärä: 25.8.2025
 */

// TS: Tätä ei tarvita tässä tehtävässä
// import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        // TS: Tätä ei tarvita tässä tehtävässä
        // Scanner lukija = new Scanner(System.in);
        
        tulostaLuvustaYhteen(5);
        System.out.println();
        tulostaLuvustaYhteen(2);
    }
    
    public static void tulostaLuvustaYhteen(int luku) {
        for (int i = luku; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
