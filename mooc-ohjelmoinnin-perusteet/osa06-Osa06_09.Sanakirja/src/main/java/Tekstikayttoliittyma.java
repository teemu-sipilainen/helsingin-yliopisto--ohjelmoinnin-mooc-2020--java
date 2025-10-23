/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 9 - Sanakirja
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
 * Päivämäärä: 5.10.2025
 */

import java.util.Scanner;

// Osa 1
public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = this.lukija.nextLine();

            if (komento.equals("lopeta")) { // Osa 1
                break;
            } else if (komento.equals("lisaa")) { // Osa 2
                System.out.println("Sana:");
                String sana = this.lukija.nextLine();
                System.out.println("Käännös:");
                String kaannos = this.lukija.nextLine();
                sanakirja.lisaa(sana, kaannos);
            } else if (komento.equals("hae")) {
                System.out.println("Haettava:");
                String haettava = this.lukija.nextLine();
                String kaannos = this.sanakirja.kaanna(haettava);
                if (kaannos == null) { // Osa 4
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else { // Osa 3
                    System.out.println("Käännös: " + kaannos);
                }
            } else {
                System.out.println("Tuntematon komento");
            }
        }
        
        System.out.println("Hei hei!");
    }
    
}
