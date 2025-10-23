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

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
        
        Scanner lukija = new Scanner(System.in);
        Sanakirja kirja = new Sanakirja();

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, kirja);
        kayttoliittyma.kaynnista();
        System.out.println(kirja.kaanna("hauki")); // tulostaa merkkijonon "pike"
    }
}
