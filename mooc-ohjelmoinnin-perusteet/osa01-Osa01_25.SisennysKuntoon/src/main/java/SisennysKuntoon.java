/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 25 - Sisennys kuntoon
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

public class SisennysKuntoon {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku: ");
        int toinen = Integer.valueOf(lukija.nextLine());
        
        if (ensimmainen == toinen) {
            System.out.println("Samat!");
        } else if (ensimmainen > toinen) {
            System.out.println("Ensimmäinen oli suurempi kuin toinen!");
        } else {
            System.out.println("Toinen oli suurempi kuin ensimmäinen!");
        }
    }
}
