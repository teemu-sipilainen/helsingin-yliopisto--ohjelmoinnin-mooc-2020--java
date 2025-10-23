/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 2 - Nestesäiliöt olioilla
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
 * Päivämäärä: 20.10.2025
 */

public class Sailio {
    
    private int maara;
    
    public Sailio() {
        this.maara = 0;
    }
    
    public int sisalto() {
        return this.maara;
    }
    
    public void lisaa(int maara) {
        if (maara <= 0) {
            return;
        }
        
        if (this.maara + maara <= 100) {
            this.maara += maara;
        } else {
            this.maara = 100;
        }
    }
    
    public void poista(int maara) {
        if (maara <= 0) {
            return;
        }
        
        if (this.maara - maara >= 0) {
            this.maara -= maara;
        } else {
            this.maara = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.maara + "/100";
    }
    
}
