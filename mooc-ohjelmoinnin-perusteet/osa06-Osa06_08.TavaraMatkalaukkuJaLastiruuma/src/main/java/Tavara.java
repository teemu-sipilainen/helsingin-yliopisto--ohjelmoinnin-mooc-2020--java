/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 8 - Tavara, Matkalaukku ja Lastiruuma
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
 * Päivämäärä: 5.10.2025
 */

// Osa 1
public class Tavara {
    
    private String nimi;
    private int paino;
    
    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getPaino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg)";
    }
    
}
