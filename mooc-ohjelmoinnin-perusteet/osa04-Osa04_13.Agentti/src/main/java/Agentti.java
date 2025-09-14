/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 13 - Agentti
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

public class Agentti {

    private String etunimi;
    private String sukunimi;
    
    public Agentti(String etunimiAlussa, String sukunimiAlussa) {
        this.etunimi = etunimiAlussa;
        this.sukunimi = sukunimiAlussa;
    }
    
    
    // TS: Poistettu tulosta-metodi käytöstä tehtävänannon mukaisesti    
    /*
    public void tulosta() {
        System.out.println("My name is " + this.sukunimi + ", " + this.etunimi + " " + this.sukunimi);
    }
    */
    
    public String toString() {
        return "My name is " + this.sukunimi + ", " + this.etunimi + " " + this.sukunimi;
    }
    
}
