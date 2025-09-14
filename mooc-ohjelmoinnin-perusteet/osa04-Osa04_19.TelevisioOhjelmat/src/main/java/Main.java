/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 19 - Televisio-ohjelmat
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
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            }
                        
            System.out.println("Pituus:");
            int pituus = Integer.valueOf(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        
        System.out.println("Ohjelman maksimipituus?");
        int maksimiPituus = Integer.valueOf(lukija.nextLine());
        
        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= maksimiPituus) {
                System.out.println(ohjelma);
            }
        }
    }
}
