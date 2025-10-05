/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 16 - Päiväys
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
 * Päivämäärä: 29.9.2025
 */

public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    // Osa 1
    public void etene() {
        if (this.paiva < 30) {
            this.paiva++;
        } else {
            this.paiva = 1;
            if (this.kuukausi < 12) {
                this.kuukausi++;
            } else {
                this.kuukausi = 1;
                this.vuosi++;
            }
        }
    }
    
    // Osa 2
    public void etene(int montakoPaivaa) {
        for (int i = 0; i < montakoPaivaa; i++) {
            this.etene();
        }
    }
    
    // Osa 3
    public Paivays paivienPaasta(int paivia) {
        Paivays uusiPaivays = new Paivays(this.paiva, this.kuukausi, this.vuosi);
        uusiPaivays.etene(paivia);
        return uusiPaivays;
    }

}
