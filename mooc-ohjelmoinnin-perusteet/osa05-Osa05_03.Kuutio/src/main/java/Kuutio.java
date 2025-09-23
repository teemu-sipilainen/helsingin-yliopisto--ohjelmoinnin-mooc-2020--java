/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 3 - Kuutio
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

public class Kuutio {
    private int sarmanPituus;
    
    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
    }
    
    public int tilavuus() {
        return this.sarmanPituus * this.sarmanPituus * this.sarmanPituus;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " 
                + this.sarmanPituus 
                + ", tilavuus on " 
                + tilavuus();
    }    
}
