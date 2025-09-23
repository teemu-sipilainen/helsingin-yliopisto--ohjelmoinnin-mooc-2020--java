/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 6 - Kuormitettu laskuri
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
 * Päivämäärä: 18.9.2025
 */

public class Laskuri {
    private int luku;
    
    public Laskuri(int alkuarvo) {
        this.luku = alkuarvo;
    }
            
    public Laskuri() {
        this.luku = 0;
    }
    
    public int arvo() {
        return this.luku;
    }
    
    public void lisaa() {
        this.luku++;
    }
    
    public void vahenna() {
        this.luku--;
    }
    
    public void lisaa(int lisays) {
        if (lisays > 0) {
            this.luku += lisays;
        }
    }
    
    public void vahenna(int vahennys) {
        if (vahennys > 0) {
            this.luku -= vahennys;
        }
    }
}
