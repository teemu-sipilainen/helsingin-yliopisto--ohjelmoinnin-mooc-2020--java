/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 5 - Jatketaanko
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
 * Päivämäärä: 21.8.2025
 */

import java.util.Scanner;

public class Jatketaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                
        while (true) {
            System.out.println("Jatketaanko?");
            String jatketaan = lukija.nextLine();
            
            if (jatketaan.equals("ei")) {
                break;
            }
        }
    }
}
