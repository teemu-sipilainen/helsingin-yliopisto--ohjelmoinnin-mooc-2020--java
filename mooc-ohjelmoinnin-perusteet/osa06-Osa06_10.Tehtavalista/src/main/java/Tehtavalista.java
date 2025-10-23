/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 10 - Tehtavalista
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
 * Päivämäärä: 6.10.2025
 */

import java.util.ArrayList;

// Osa 1
public class Tehtavalista {
    private ArrayList<String> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
    
    public void tulosta() {
        for (int i = 0; i < this.tehtavat.size(); i++) {
            System.out.println(i+1 + ": " + this.tehtavat.get(i));
        }
    }
    
    public void poista(int numero) {
        this.tehtavat.remove(numero-1);
    }
    
}
