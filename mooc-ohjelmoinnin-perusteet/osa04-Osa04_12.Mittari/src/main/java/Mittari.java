/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 12 - Mittari
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

public class Mittari {
    private int mitta;
    
    public Mittari() {
        this.mitta = 0;
    }
    
    public void lisaa() {
        if (this.mitta < 5) {
            this.mitta++;
        }
    }
    
    public void vahenna() {
        if (this.mitta > 0) {
            this.mitta--;
        }
    }
    
    public int mitta() {
        return this.mitta;
    }
    
    public boolean taynna() {
        return this.mitta == 5;
    }    
}
