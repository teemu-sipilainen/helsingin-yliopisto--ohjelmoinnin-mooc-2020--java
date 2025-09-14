/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 15 - Lukutilasto
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
 * Päivämäärä: 11.9.2025
 */

public class Lukutilasto {
    private int lukujenMaara; // Osa 1
    private int summa; // Osa 2
    
    // Osa 1
        
    public Lukutilasto() {
        this.lukujenMaara = 0; // Osa 1
        this.summa = 0; // Osa 2
    }
    
    public void lisaaLuku(int luku) {
        this.lukujenMaara++; // Osa 1
        this.summa += luku; // Osa 2
    }
    
    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    // Osa 2
    
    public int summa() {
        return this.summa;
    }
    
    public double keskiarvo() {
        if (this.lukujenMaara == 0) {
            System.out.println(
                "Lukujen määrä on " + haeLukujenMaara() +
                ", joten keskiarvoa ei voida laskea."
            );
            return 0.0;
        }
        return 1.0 * this.summa / this.lukujenMaara;
    }
}
