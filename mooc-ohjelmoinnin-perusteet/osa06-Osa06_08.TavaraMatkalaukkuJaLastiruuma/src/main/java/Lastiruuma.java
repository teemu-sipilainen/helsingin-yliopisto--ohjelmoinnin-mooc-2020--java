/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 8 - Tavara, Matkalaukku ja Lastiruuma
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
 * Päivämäärä: 5.10.2025
 */

import java.util.ArrayList;

// Osa 6
public class Lastiruuma {
    private int maksimipaino; // Osa 6
    private ArrayList<Matkalaukku> laukut; // Osa 6
    
    // Osa 6
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.laukut = new ArrayList<>();
    }
    
    // Osa 6
    public int yhteispaino() {
        int yhteispaino = 0;
        
        for (Matkalaukku laukku: this.laukut) {
            yhteispaino += laukku.yhteispaino();
        }
        
        return yhteispaino;
    }
    
    // Osa 6
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (this.yhteispaino() + laukku.yhteispaino() <= this.maksimipaino) {
            this.laukut.add(laukku);
        }
    }
    
    // Osa 6
    public String toString() {
        return this.laukut.size() + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }
    
    // Osa 7
    public void tulostaTavarat() {
        for (Matkalaukku laukku: this.laukut) {
            laukku.tulostaTavarat();
        }
    }
    
}
