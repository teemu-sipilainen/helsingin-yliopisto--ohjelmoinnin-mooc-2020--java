/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 12 - Vitsipankki
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
import java.util.Random;

// Osa 1
public class Vitsipankki {
    private ArrayList<String> vitsit;
    
    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        this.vitsit.add(vitsi);
    }
    
    public String arvoVitsi() {
        if (this.vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        }
        
        Random arpa = new Random();
        int indeksi = arpa.nextInt(vitsit.size());
        return vitsit.get(indeksi);
    }
    
    public void tulostaVitsit() {
        if (this.vitsit.isEmpty()) {
            System.out.println("Vitsit vähissä.");
        } else {        
            for (String vitsi: this.vitsit) {
                System.out.println(vitsi);
            }
        }
    }
    

}
