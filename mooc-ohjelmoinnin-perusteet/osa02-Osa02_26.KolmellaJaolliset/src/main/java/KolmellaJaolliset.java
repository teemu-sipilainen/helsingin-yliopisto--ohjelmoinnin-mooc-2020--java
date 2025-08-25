/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 26 - Kolmella jaolliset
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

public class KolmellaJaolliset {

    public static void main(String[] args) {
        // TS: Tätä ei tarvita tässä tehtävässä
        // Scanner lukija = new Scanner(System.in);
        
        kolmellaJaollisetValilta(3, 6);
        System.out.println();
        kolmellaJaollisetValilta(2, 10);
    }
    
    public static void kolmellaJaollisetValilta(int alku, int loppu) {
        for (int i = alku; i <= loppu; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
