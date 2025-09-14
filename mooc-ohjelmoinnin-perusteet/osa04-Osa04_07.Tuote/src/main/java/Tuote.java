/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 7 - Tuote
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
 * Päivämäärä: 8.9.2025
 */

public class Tuote {
    private double hinta;
    private int lukumaara;
    private String nimi;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
        this.nimi = nimiAlussa;        
    }
    
    public void tulostaTuote() {
        System.out.println(
            this.nimi + ", hinta " 
            + this.hinta + ", " 
            + this.lukumaara + " kpl");
    }
}
