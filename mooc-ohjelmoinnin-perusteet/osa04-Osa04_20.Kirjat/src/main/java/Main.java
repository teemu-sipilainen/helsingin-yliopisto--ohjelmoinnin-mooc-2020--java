/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 20 - Kirjat
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
 * Päivämäärä: 14.9.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.println("Sivuja:");
            int sivuja = Integer.valueOf(lukija.nextLine());
            
            System.out.println("Julkaisuvuosi:");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, sivuja, julkaisuvuosi));
        }
        
        System.out.println("Mitä tulostetaan?");
        String mitaTulostetaan = lukija.nextLine();
        
        if (mitaTulostetaan.equals("kaikki")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja);
            }
        } else if (mitaTulostetaan.equals("nimi")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja.getNimi());
            }
        }
    }
}
