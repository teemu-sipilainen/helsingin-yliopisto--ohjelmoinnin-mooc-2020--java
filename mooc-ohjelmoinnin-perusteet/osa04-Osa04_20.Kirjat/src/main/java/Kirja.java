/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 20 - Kirjat
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
 * Päivämäärä: 14.9.2025
 */

public class Kirja {
    private String nimi;
    private int sivuja;
    private int julkaisuvuosi;
    
    public Kirja(String nimi, int sivuja, int julkaisuvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivuja() {
        return this.sivuja;
    }
    
    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }
    
    @Override
    public String toString() {
        return this.getNimi() + ", " + this.getSivuja() + " sivua, " + this.getJulkaisuvuosi();
    }
}
