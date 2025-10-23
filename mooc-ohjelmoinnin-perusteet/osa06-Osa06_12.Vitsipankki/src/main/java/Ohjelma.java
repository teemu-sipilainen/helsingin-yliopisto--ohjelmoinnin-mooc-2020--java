/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 12 - Vitsipankki
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
 * Päivämäärä: 6.10.2025
 */

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        
        // Osa 1
        
        System.out.println("----- Osa 1 -----");

        Vitsipankki pankkiOsa1 = new Vitsipankki();
        pankkiOsa1.lisaaVitsi("Mikä on punaista ja tuoksuu siniselle maalille? - Punainen maali.");
        pankkiOsa1.lisaaVitsi("Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.");

        System.out.println("Arvotaan vitsejä:");
        for (int i = 0; i < 5; i++) {
            System.out.println(pankkiOsa1.arvoVitsi());
        }

        System.out.println("");
        System.out.println("Tulostetaan vitsit:");
        pankkiOsa1.tulostaVitsit();
        
        // Osa 2
        
        System.out.println("----- Osa 2 -----");
        
        Vitsipankki pankkiOsa2 = new Vitsipankki();
        Scanner lukijaOsa2 = new Scanner(System.in);

        Kayttoliittyma liittymaOsa2 = new Kayttoliittyma(pankkiOsa2, lukijaOsa2);
        liittymaOsa2.kaynnista();

    }
}
