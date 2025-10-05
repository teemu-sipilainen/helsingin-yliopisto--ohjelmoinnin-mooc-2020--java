/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 1 - Ruokalista 
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
 * Päivämäärä: 30.9.2025
 */

import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    
    
    // Osa 1
    public void lisaaAteria(String ateria) {
        if (!(this.ateriat.contains(ateria))) {
            this.ateriat.add(ateria);
        }
    }
    
    // Osa 2
    public void tulostaAteriat() {
        for (String ateria : ateriat) {
            System.out.println(ateria);
        }
    }
    
    // Osa 3
    public void tyhjennaRuokalista() {
        this.ateriat.clear();
    }
}
