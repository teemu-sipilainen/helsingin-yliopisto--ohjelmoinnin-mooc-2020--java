/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 13 - Tehtävät
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
 * Päivämäärä: 12.10.2025
 */

import java.util.ArrayList;

public class Tehtavienhallinta {
    
    private ArrayList<Tehtava> tehtavat;
    
    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        ArrayList<String> palautettavat = new ArrayList<>();
        
        for (Tehtava tehtava: tehtavat) {
            palautettavat.add(tehtava.getNimi());
        }
        
        return palautettavat;
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }
    
    public void merkkaaTehdyksi(String tehdyksiMerkattavaTehtava) {
        for (Tehtava tehtava: tehtavat) {
            if (tehtava.getNimi().equals(tehdyksiMerkattavaTehtava)) {
                tehtava.setTehty(true);
            }
        }
    }
    
    public boolean onTehty(String tarkistettavaTehtava) {
        for (Tehtava tehtava: tehtavat) {
            if (tehtava.getNimi().equals(tarkistettavaTehtava)) {
                return tehtava.onTehty();
            }
        }
        
        return false;
    }
    
    public void poista(String poistettavaTehtava) {
        for (int i = 0; i < this.tehtavat.size(); i++) {
            if (this.tehtavat.get(i).getNimi().equals(poistettavaTehtava)) {
                this.tehtavat.remove(i); // Taulukon seuraava indeksi siirtyy nykyiseen indeksiin...
                i--; // ... Sen vuoksi siirrytään takaisin edelliseen indeksiin
            }
        }
    }

}
