/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 18 - Henkilotiedot
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

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Etunimi:");
            String etunimi = lukija.nextLine();
            
            if (etunimi.isEmpty()) {
                break;
            }

            System.out.println("Sukunimi:");
            String sukunimi = lukija.nextLine();
            
            System.out.println("Henkilötunnus:");
            String henkilötunnus = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, henkilötunnus));
        }
        
        for (Henkilotieto henkilotieto: henkilotiedot) {
            System.out.println(henkilotieto.getEtunimi() + " " + henkilotieto.getSukunimi());
        }
    }
}
