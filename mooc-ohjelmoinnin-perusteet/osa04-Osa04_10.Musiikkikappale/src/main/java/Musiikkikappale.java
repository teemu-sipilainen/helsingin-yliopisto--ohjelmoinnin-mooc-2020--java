/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 10 - Musiikkikappale
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
 * Päivämäärä: 10.9.2025
 */

public class Musiikkikappale {
    private String nimi;
    private int pituus;
    
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {
        this.nimi = kappaleenNimi;
        this.pituus = kappaleenPituus;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public int pituus() {
        return this.pituus;
    }
}
