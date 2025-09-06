/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 17 - Poista viimeinen
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
 * Päivämäärä: 6.9.2025
 */

import java.util.ArrayList;

public class PoistaViimeinen {
    
    public static void poistaViimeinen(ArrayList<String> mjonot) {
        
        int mjonojenLukumaara = mjonot.size();
        
        if (mjonojenLukumaara == 0) {
            return;
        }
        
        mjonot.remove(mjonojenLukumaara - 1);
    }

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");

        System.out.println(merkkijonot);

        poistaViimeinen(merkkijonot);
        poistaViimeinen(merkkijonot);

        System.out.println(merkkijonot);
    }

}

