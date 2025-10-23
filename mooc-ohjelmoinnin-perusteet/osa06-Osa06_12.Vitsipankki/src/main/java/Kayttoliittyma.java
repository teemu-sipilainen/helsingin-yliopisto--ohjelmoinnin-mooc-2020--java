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

import java.util.ArrayList;
import java.util.Scanner;

// Osa 2

public class Kayttoliittyma {
    
    private Vitsipankki vitsipankki;
    private Scanner lukija;
    
    public Kayttoliittyma(Vitsipankki vitsipankki, Scanner lukija) {
        this.vitsipankki = vitsipankki;
        this.lukija = lukija;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");

            String komento = lukija.nextLine();

            if (komento.equals("X")) {
                break;
            }

            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                this.vitsipankki.lisaaVitsi(vitsi);
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                System.out.println(this.vitsipankki.arvoVitsi());
            } else if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                this.vitsipankki.tulostaVitsit();
            }
        }
    }
}
