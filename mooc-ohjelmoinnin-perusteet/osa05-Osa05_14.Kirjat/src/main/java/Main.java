/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 14 - Kirjat
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
 * Päivämäärä: 23.9.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();

        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            System.out.println("Syötä kirjan julkaisuvuosi.");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, julkaisuvuosi);
            
            if (kirjat.contains(kirja)) {
                System.out.println("Kirja on jo listalla. Ei lisätä samaa kirjaa uudestaan.");
                continue;
            }
            kirjat.add(kirja);
        }
        
        // Huom! Älä muuta tätä tulostusta!
        System.out.println("Kiitos! Kirjoja lisätty: " + kirjat.size());
    }
}
