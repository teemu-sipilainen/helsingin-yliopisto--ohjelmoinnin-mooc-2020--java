/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 15 - Lukutilasto
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
 * Päivämäärä: 11.9.2025
 */

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        
        // Osa 1
        /*
        Lukutilasto tilasto = new Lukutilasto();
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(5);
        tilasto.lisaaLuku(1);
        tilasto.lisaaLuku(2);
        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        */
        
        // Osa 2
        
        /*
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
        */
        
        // Osa 3 & 4
        
        System.out.println("Anna lukuja:");
        
        Lukutilasto lukutilastoOsa3 = new Lukutilasto();
        Lukutilasto lukutilastoOsa4Parilliset = new Lukutilasto();
        Lukutilasto lukutilastoOsa4Parittomat = new Lukutilasto();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == -1) {
                break;
            } else if (luku % 2 == 0) {
                lukutilastoOsa4Parilliset.lisaaLuku(luku);
            } else {
                lukutilastoOsa4Parittomat.lisaaLuku(luku);
            }
            
            lukutilastoOsa3.lisaaLuku(luku);
        }
        
        System.out.println("Summa: " + lukutilastoOsa3.summa());
        System.out.println("Parillisten summa: " + lukutilastoOsa4Parilliset.summa());
        System.out.println("Parittomien summa: " + lukutilastoOsa4Parittomat.summa());
    }
}
