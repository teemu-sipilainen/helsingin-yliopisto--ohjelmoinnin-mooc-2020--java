/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 8 - Tuote
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
 * Päivämäärä: 8.9.2025
 */

public class Paaohjelma {

    public static void main(String[] args) {
        
        // Tehtäväpohjan oletuslaskuri
        
        System.out.println("--- Tehtäväpohjan oletuslaskuri ---");
        
        VahenevaLaskuri tehtavapohjanOletuslaskuri = new VahenevaLaskuri(10);

        tehtavapohjanOletuslaskuri.tulostaArvo();
        tehtavapohjanOletuslaskuri.vahene();
        tehtavapohjanOletuslaskuri.vahene();
        
        // Osa 1
        
        System.out.println("--- Osa 1 ---");
        
        VahenevaLaskuri laskuriOsa1 = new VahenevaLaskuri(10);

        laskuriOsa1.tulostaArvo();

        laskuriOsa1.vahene();
        laskuriOsa1.tulostaArvo();

        laskuriOsa1.vahene();
        laskuriOsa1.tulostaArvo();
        
        // Osa 2
        
        System.out.println("--- Osa 2 ---");
        
        VahenevaLaskuri laskuriOsa2 = new VahenevaLaskuri(2);

        laskuriOsa2.tulostaArvo();

        laskuriOsa2.vahene();
        laskuriOsa2.tulostaArvo();

        laskuriOsa2.vahene();
        laskuriOsa2.tulostaArvo();

        laskuriOsa2.vahene();
        laskuriOsa2.tulostaArvo();
        
        // Osa 3
        
        System.out.println("--- Osa 3 ---");
        
        VahenevaLaskuri laskuriOsa3 = new VahenevaLaskuri(100);

        laskuriOsa3.tulostaArvo();

        laskuriOsa3.nollaa();
        laskuriOsa3.tulostaArvo();

        laskuriOsa3.vahene();
        laskuriOsa3.tulostaArvo();
    }
}
