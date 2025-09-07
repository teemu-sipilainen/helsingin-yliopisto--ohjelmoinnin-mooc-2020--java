/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 25 - Käyttäjätunnukset
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
 * Päivämäärä: 7.9.2025
 */

import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus:");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana:");
        String salasana = lukija.nextLine();
        
        boolean kayttajaOnAleksi = tunnus.equals("aleksi") && salasana.equals("tappara");
        boolean kayttajaOnElina = tunnus.equals("elina") && salasana.equals("kissa");
        
        if (kayttajaOnAleksi || kayttajaOnElina) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
