/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 3 - Viestipalvelu
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

public class Viestipalvelu {
    
    private ArrayList<Viesti> viestit;
    
    public Viestipalvelu() {
        this.viestit = new ArrayList<>();
    }
    
    public void lisaa(Viesti viesti) {
        if (viesti.getSisalto().length() <= 280) {
            this.viestit.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit() {
        return viestit;
    }
    
}
