/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 7 - Reseptihaku
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

public class Resepti {
    private String nimi;
    private int keittoAika; // minuutteina
    private ArrayList<String> raakaAineet = new ArrayList<>();
    
    // Osa 1
    public Resepti(String nimi, int keittoAika, ArrayList<String> raakaAineet) {
        this.nimi = nimi;
        this.keittoAika = keittoAika;
        this.raakaAineet = raakaAineet;
    }
    
    // Osa 1
    @Override
    public String toString() {
        return this.nimi + ", keittoaika: " + this.keittoAika;
    }
    
    // Osa 2
    public String getNimi() {
        return this.nimi;
    }
    
    // Osa 3
    public int getKeittoAika() {
        return this.keittoAika;
    }
    
    // Osa 4
    public ArrayList<String> getRaakaAineet() {
        // return this.raakaAineet; // TS: Palauttaa viittauksen alkuperäiseen listaan
        return new ArrayList<>(this.raakaAineet); // TS: Palauttaa kopion listasta
    }
}
