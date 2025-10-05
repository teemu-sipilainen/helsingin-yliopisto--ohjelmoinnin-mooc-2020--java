/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 5 - Lahjapakkaamo
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

// Osa 2
public class Pakkaus {
    private ArrayList<Lahja> lahjat;
    
    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        
        for (Lahja lahja: lahjat) {
            yhteispaino += lahja.getPaino();
        }
        
        return yhteispaino;
    }
    
}
