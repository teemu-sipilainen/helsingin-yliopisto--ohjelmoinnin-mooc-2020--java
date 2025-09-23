/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 5 - Monta konstruktoria
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

public class Esine {

    private String nimi;
    private String sijainti;
    private int paino;

    public Esine(String nimi, String sijainti, int paino) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.paino = paino;
    }
    
    public Esine(String nimi) {
        this(nimi, "pientavarahylly", 1);
    }
    
    public Esine(String nimi, String sijainti) {
        this(nimi, sijainti, 1);
    }
    
    public Esine(String nimi, int paino) {
        this(nimi, "varasto", paino);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    public String getSijainti() {
        return sijainti;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg) löytyy sijainnista " + this.sijainti;
    }
}
