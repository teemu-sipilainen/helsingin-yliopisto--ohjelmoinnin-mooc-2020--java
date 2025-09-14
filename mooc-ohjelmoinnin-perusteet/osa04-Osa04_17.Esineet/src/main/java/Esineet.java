/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 17 - Esineet
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
 * Päivämäärä: 12.9.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nimi:");
            String esineenNimi = lukija.nextLine();
            
            if (esineenNimi.isEmpty()) {
                break;
            }
            
            esineet.add(new Esine(esineenNimi));
        }
        
        for (Esine esine: esineet) {
            System.out.println(esine);
        }
    }
}
