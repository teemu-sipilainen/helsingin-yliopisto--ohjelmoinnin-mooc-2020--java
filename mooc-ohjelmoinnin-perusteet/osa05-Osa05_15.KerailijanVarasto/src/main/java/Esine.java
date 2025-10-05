/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 15 - Keräilijän varasto
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
 * Päivämäärä: 26.9.2025
 */

public class Esine {
    private String tunnus;
    private String nimi;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    @Override
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Esine)) {
            return false;
        }
        
        Esine verrattavaEsine = (Esine) verrattava;
        
        if (this.tunnus.equals(verrattavaEsine.tunnus)) {
            return true;
        }
        
        return false;
    }
}
