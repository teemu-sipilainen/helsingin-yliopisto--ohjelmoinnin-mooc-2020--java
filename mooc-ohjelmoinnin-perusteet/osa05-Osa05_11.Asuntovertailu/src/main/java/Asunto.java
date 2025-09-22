/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 11 - Asuntovertailu
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
 * Päivämäärä: 22.9.2025
 */

public class Asunto {
    
    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public int getNelioita() {
        return nelioita;
    }

    public int getNeliohinta() {
        return neliohinta;
    }
    
    public int getHinta() {
        return this.nelioita * this.neliohinta;
    }
    
    // Osa 1
    public boolean suurempi(Asunto verrattava) {
        return this.nelioita > verrattava.getNelioita();
    }
    
    // Osa 2
    public int hintaero(Asunto verrattava) {
        return Math.abs(this.getHinta() - verrattava.getHinta());
    }
    
    // Osa 3
    public boolean kalliimpi(Asunto verrattava) {
        return this.getHinta() > verrattava.getHinta();
    }
    
}
