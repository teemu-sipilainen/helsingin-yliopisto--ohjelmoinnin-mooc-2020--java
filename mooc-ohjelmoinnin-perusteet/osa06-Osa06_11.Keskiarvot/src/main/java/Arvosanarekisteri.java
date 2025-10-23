/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 11 - Keskiarvot
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

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> koepisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.koepisteet = new ArrayList<>(); // Osa 2
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.koepisteet.add(pisteet); // Osa 2
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    // Osa 1
    public double arvosanojenKeskiarvo() {
        
        if (this.arvosanat.isEmpty()) {
            return -1;
        }
        
        int summa = 0;
        
        for (int arvosana: this.arvosanat) {
            summa += arvosana;
        }
        
        return 1.0 * summa / this.arvosanat.size();
    }
    
    // Osa 2
    public double koepisteidenKeskiarvo() {
        if (this.koepisteet.isEmpty()) {
            return -1;
        }
        
        int summa = 0;
        
        for (int koepisteet: this.koepisteet) {
            summa += koepisteet;
        }
        
        return 1.0 * summa / this.koepisteet.size();
        
    }
    
}
