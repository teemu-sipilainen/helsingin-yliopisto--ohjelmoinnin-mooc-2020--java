/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 2 - Pakka 
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
 * Päivämäärä: 2.10.2025
 */

import java.util.ArrayList;

public class Pakka {
    private ArrayList<String> pakka; // Osa 1
    
    // Osa 1
    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    // Osa 1
    public boolean onTyhja() {
        return this.pakka.size() == 0;
    }
    
    // Osa 1
    public void lisaa(String arvo) {
        this.pakka.add(arvo);
    }
    
    // Osa 1
    public ArrayList<String> arvot() {
        return this.pakka;
    }
    
    // Osa 2
    public String ota() {
        int viimeinenIndeksi = this.pakka.size() - 1;
        String viimeinenArvo = this.pakka.get(viimeinenIndeksi);
        this.pakka.remove(viimeinenIndeksi);
        return viimeinenArvo;
    }
}
