/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 16 - Maksukortti
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
 * Päivämäärä: 12.9.2025
 */

public class Maksukortti {
    private double saldo; // Osa 1
    
    // Osa 1
    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän
        
        this.saldo = alkusaldo;
    }

    // Osa 1
    @Override
    public String toString() {
        // kirjoita koodia tähän
        
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    // Osa 2
    public void syoEdullisesti() {
        // kirjoita koodia tähän
        
        // Osa 3
        if (this.saldo - 2.60 >= 0) {
            // Osa 2
            this.saldo -= 2.60;
        }
    }

    // Osa 2
    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        
        // Osa 3
        if (this.saldo - 4.60 >= 0) {
            // Osa 2
            this.saldo -= 4.60;
        }
    }
    
    // Osa 4 & 5
    public void lataaRahaa(double rahamaara) {
        // kirjoita koodia tähän
        
        // Osa 5
        if (rahamaara < 0) {
            return;
        }
        
        // Osa 4
        if (this.saldo + rahamaara <= 150) {
            this.saldo += rahamaara;        
        } else {
            this.saldo = 150;
        }
    }
}
