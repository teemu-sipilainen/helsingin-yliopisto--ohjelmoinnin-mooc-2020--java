/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 18 - Rajatun lukusarjan summa
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
 * Päivämäärä: 24.8.2025
 */

import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen:");
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Viimeinen:");
        int viimeinen = Integer.valueOf(lukija.nextLine());
        
        int i = ensimmainen;
        int summa = 0;
        
        while (i <= viimeinen) {
            summa += i;
            i++;
        }
        
        System.out.println("Summa on " + summa);
    }
}
