/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 2 - Kirja
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

public class Kirja {
    private String kirjailija;
    private String nimi;
    private int sivuja;
    
    public Kirja(String kirjailija, String nimi, int sivuja) {
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.sivuja = sivuja;
    }
    
    public String getKirjailija() {
        return this.kirjailija;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivuja() {
        return this.sivuja;
    }
    
    @Override
    public String toString() {
        return this.kirjailija + ", " + this.nimi + ", " + this.sivuja + " sivua";
    }
}
