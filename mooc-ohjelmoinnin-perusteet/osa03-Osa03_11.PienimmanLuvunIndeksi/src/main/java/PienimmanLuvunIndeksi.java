/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 11 - Pienimmän luvun indeksi
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
 * Päivämäärä: 3.9.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        ArrayList<Integer> lista = new ArrayList<>();        
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            
            if (luettu == 9999) {
                break;
            }
            
            lista.add(luettu);
        }
        
        int pieninLuku = lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            int luku = lista.get(i);
            if (luku < pieninLuku) {
                pieninLuku = luku;
            }
        }
        
        System.out.println("Pienin luku on " + pieninLuku);
        
        for (int j = 0; j < lista.size(); j++) {
            if (lista.get(j) == pieninLuku) {
                System.out.println("Pienin luku löytyy indeksistä " + j);
            }
        }        
    }
}
