/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 8 - Lintubongarin tietokanta
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
 * Päivämäärä: 14.1.2026
 */

public class Lintu {
    private String nimi;
    private String latinankielinenNimi;
    
    public Lintu(String nimi, String latinankielinenNimi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.latinankielinenNimi + ")";
    }
    
    public String getNimi() {
        return this.nimi;
    }
}
