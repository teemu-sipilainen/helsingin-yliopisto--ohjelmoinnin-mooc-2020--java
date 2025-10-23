/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 3 - Järjestäminen
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
 * Päivämäärä: 21.-22.10.2025
 */

import java.util.Arrays;

public class Paaohjelma {
    
    // Osa 1
    public static int pienin(int[] taulukko) {
        
        if (taulukko.length == 0) {
            return -1;
        }
        
        int pienin = taulukko[0];
        
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        
        return pienin;
    }
    
    // Osa 2
    public static int pienimmanIndeksi(int[] taulukko) {
        
        if (taulukko.length == 0) {
            return -1;
        }
        
        int pieninArvo = taulukko[0];
        int pieninIndeksi = 0;
        
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] < pieninArvo) {
                pieninArvo = taulukko[i];
                pieninIndeksi = i;
            }
        }
        
        return pieninIndeksi;
    }
    
    // Osa 3
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        // kirjoita koodia tähän
        
        if (taulukko.length == 0) {
            return -1;
        }
        
        int pieninArvo = taulukko[aloitusIndeksi];
        int pieninIndeksi = aloitusIndeksi;
        
        for (int i = aloitusIndeksi + 1; i < taulukko.length; i++) {
            if (taulukko[i] < pieninArvo) {
                pieninArvo = taulukko[i];
                pieninIndeksi = i;
            }
        }
        
        return pieninIndeksi;
    }
    
    // Osa 4
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        
        int apu;
        
        apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }
    
    // Osa 5
    public static void jarjesta(int[] taulukko) {
        System.out.println(Arrays.toString(taulukko));
        
        for (int i = 0; i < taulukko.length; i++) {
            int pienimmanIndeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, pienimmanIndeksi);
            System.out.println(Arrays.toString(taulukko));
        }
    }

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        
        // Tehtäväpohjassa valmiina olleen taulukon pienin luku
        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
        
        // Osa 1
        int[] luvutOsa1 = {6, 5, 8, 7, 11};
        System.out.println("Pienin: " + Paaohjelma.pienin(luvutOsa1));
        
        // Osa 2
        // indeksit:   0  1  2  3  4
        int[] luvutOsa2 = {6, 5, 8, 7, 11};
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(luvutOsa2));
        
        // Osa 3
        // indeksit:    0  1  2  3   4
        int[] luvutOsa3 = {-1, 6, 9, 8, 12};
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvutOsa3, 0));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvutOsa3, 1));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvutOsa3, 2));
        
        // Osa 4
        int[] luvutOsa4 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(luvutOsa4));

        Paaohjelma.vaihda(luvutOsa4, 1, 0);
        System.out.println(Arrays.toString(luvutOsa4));

        Paaohjelma.vaihda(luvutOsa4, 0, 3);
        System.out.println(Arrays.toString(luvutOsa4));
        
        // Osa 5
        int[] luvutOsa5 = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvutOsa5);
    }

}
