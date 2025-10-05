/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 17 - Raha
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

public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    // Osa 1
    public Raha plus(Raha lisattava) {
        Raha uusiRaha = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusiRaha;
    }
    
    // Osa 2
    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa) {
            return true;
        }

        if (this.euroa == verrattava.euroa && this.senttia < verrattava.senttia) {
            return true;
        }
        
        return false;
    }
    
    // Osa 3
    public Raha miinus(Raha vahentaja) {
        int eurot = this.euroa;
        int sentit = this.senttia;
        
        if (sentit - vahentaja.senttia < 0) {
            eurot = eurot - 1;
            sentit = sentit + 100;
        }
        
        eurot = eurot - vahentaja.euroa;
        sentit = sentit - vahentaja.senttia;
        
        if (eurot < 0) {
            return new Raha(0, 0);
        }
        
        return new Raha(eurot, sentit);
    }
}
