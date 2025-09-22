/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 9 - Kasvatuslaitos
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
 * Päivämäärä: 21.9.2025
 */

public class Kasvatuslaitos {
    private int punnitustenLukumaara; // Osa 1
    
    public Kasvatuslaitos() {
        this.punnitustenLukumaara = 0;
    }
    
    // Osa 1

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        // return -1;
        
        this.punnitustenLukumaara++; // Osa 3
        return henkilo.getPaino(); // Osa 1
    }
    
    // Osa 2
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    // Osa 3
    
    public int punnitukset() {
        return this.punnitustenLukumaara;
    }
}
