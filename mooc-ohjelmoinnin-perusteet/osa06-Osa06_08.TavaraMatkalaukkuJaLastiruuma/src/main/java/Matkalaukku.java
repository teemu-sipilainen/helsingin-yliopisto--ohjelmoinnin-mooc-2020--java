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

// Osa 2
public class Matkalaukku {
    
    private ArrayList<Tavara> tavarat;
    private int maksimipaino;
    
    public Matkalaukku(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() <= this.maksimipaino) {
            this.tavarat.add(tavara);
        }
    }
    
    // Osa 4
    public int yhteispaino() {
        int yhteispaino = 0;
        
        for (Tavara tavara: this.tavarat) {
            yhteispaino += tavara.getPaino();
        }
        
        return yhteispaino;
    }
    
    // Osat 2 ja 3
    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        } else if (this.tavarat.size() == 1) {
            return this.tavarat.size() + " tavara (" + this.yhteispaino() + " kg)";
        }
        
        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
    
    // Osa 4
    public void tulostaTavarat() {
        for (Tavara tavara: this.tavarat) {
            System.out.println(tavara);
        }
    }
    
    // Osa 5
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
        
        Tavara raskainTavara = this.tavarat.get(0);
        
        for (Tavara tavara: this.tavarat) {
            if (tavara.getPaino() > raskainTavara.getPaino()) {
                raskainTavara = tavara;
            }
        }
        
        return raskainTavara;
    }
        
}
