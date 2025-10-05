/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 7 - Pituusjärjestys 
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
 * Päivämäärä: 3.10.2025
 */

import java.util.ArrayList;

public class Huone {
    private ArrayList<Henkilo> henkilot; // Osa 1
    
    // Osa 1
    public Huone() {
        this.henkilot = new ArrayList<>();
    }
    
    // Osa 1
    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }
    
    // Osa 1
    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }
    
    // Osa 1
    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }
    
    // Osa 2
    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        
        Henkilo lyhinHenkilo = this.henkilot.get(0);
        
        for (Henkilo henkilo: henkilot) {
            if (henkilo.getPituus() < lyhinHenkilo.getPituus()) {
                lyhinHenkilo = henkilo;
            }
        }
        
        return lyhinHenkilo;
    }
    
    // Osa 3
    public Henkilo ota() {       
        Henkilo lyhinHenkilo = this.lyhin();
        this.henkilot.remove(lyhinHenkilo);
        return lyhinHenkilo;
    }
    
}
