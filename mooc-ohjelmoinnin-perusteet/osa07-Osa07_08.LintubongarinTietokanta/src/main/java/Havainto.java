/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 8 - Lintubongarin tietokanta
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
 * Päivämäärä: 14.1.2026
 */

public class Havainto {
    private Lintu lintu;
    private int havaintojenLkm;
    
    public Havainto(Lintu lintu) {
        this.lintu = lintu;
        this.havaintojenLkm = 0;
    }
    
    @Override
    public String toString() {
        if (this.havaintojenLkm == 1) {
            return this.lintu + ": " + this.havaintojenLkm + " havainto";
        }
        return this.lintu + ": " + this.havaintojenLkm + " havaintoa";
    }
    
    public Lintu getLintu() {
        return this.lintu;
    }
    
    public void kasvataHavaintojenMaaraa() {
        this.havaintojenLkm++;
    }
}
