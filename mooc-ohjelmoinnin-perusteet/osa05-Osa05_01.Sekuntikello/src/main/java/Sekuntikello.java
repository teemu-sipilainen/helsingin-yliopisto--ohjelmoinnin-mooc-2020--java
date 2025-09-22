/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 1 - Sekuntikello
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

public class Sekuntikello {
    private Viisari sekunnit;
    private Viisari sadasosasekunnit;
    
    public Sekuntikello() {
        this.sekunnit = new Viisari(60);
        this.sadasosasekunnit = new Viisari(100);
    }
    
    public void etene() {
        this.sadasosasekunnit.etene();
        
        if (this.sadasosasekunnit.arvo() == 0) {
            this.sekunnit.etene();
        }
    }
    
    @Override
    public String toString() {
        return this.sekunnit + ":" + this.sadasosasekunnit;
    }
}
