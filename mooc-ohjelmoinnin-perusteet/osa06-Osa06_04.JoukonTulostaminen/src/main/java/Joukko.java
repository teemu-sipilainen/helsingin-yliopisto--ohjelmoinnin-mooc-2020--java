/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 4 - Joukon tulostaminen
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
 * Päivämäärä: 3.10.2025
 */

import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    @Override
    public String toString() {
        int alkioidenLukumaara = this.alkiot.size();
        
        if (alkioidenLukumaara == 0) {
            return "Joukko " + this.nimi + " on tyhjä.";
        }
        
        String alkiotTekstina = "";
        
        for (String alkio: alkiot) {
            alkiotTekstina = alkiotTekstina + "\n" + alkio;
        }
        
        String monikko = "";
        
        if (alkioidenLukumaara > 1) {
            monikko = "ta";
        }
        
        return 
            "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkio"
            + monikko + ":" + alkiotTekstina;
    }
    
}
