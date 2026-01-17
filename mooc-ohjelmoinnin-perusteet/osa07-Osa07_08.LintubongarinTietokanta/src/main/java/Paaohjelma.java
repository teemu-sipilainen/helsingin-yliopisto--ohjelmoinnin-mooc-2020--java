/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 8 - Lintubongarin tietokanta
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
 * Päivämäärä: 14.1.2026
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {
    private static ArrayList<Havainto> havainnot = new ArrayList<>();
    
    public static void lisaa(String nimi, String latinankielinenNimi) {
        Lintu lintu = new Lintu(nimi, latinankielinenNimi);
        Havainto havainto = new Havainto(lintu);
        havainnot.add(havainto);
    }
    
    public static void havainto(String nimi) {
        for (Havainto havainto: havainnot) {
            if (havainto.getLintu().getNimi().equals(nimi)) {
                havainto.kasvataHavaintojenMaaraa();
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }
    
    public static void nayta(String nimi) {
        for (Havainto havainto: havainnot) {
            if (havainto.getLintu().getNimi().equals(nimi)) {
                System.out.println(havainto);
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        
        havainnot.clear(); // TS: Lisätty TMC-testien takia
        
        while (true) {
            System.out.println("?");
            String komento = lukija.nextLine();
            
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi:");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi:");
                String latinankielinenNimi = lukija.nextLine();
                lisaa(nimi, latinankielinenNimi);
            } else if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu:");
                String nimi = lukija.nextLine();
                havainto(nimi);
            } else if (komento.equals("Tilasto")) {
                for (Havainto havainto: havainnot) {
                    System.out.println(havainto);
                }
            } else if (komento.equals("Nayta")) {
                System.out.println("Mikä?");
                String nimi = lukija.nextLine();
                nayta(nimi);
            } else if (komento.equals("Lopeta")) {
                break;
            }
        }

    }

}
