/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 11 - Lukujen lukumäärä ja summa
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

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukujenLkm = 0;
        int lukujenSumma = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            
            lukujenLkm = lukujenLkm + 1;
            lukujenSumma = lukujenSumma + luku;
        }
        
        System.out.println("Lukuja yhteensä " + lukujenLkm);
        System.out.println("Lukujen summa " + lukujenSumma);
    }
}
