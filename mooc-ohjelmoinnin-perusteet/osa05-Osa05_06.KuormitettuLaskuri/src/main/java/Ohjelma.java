/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 6 - Kuormitettu laskuri
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
 * Päivämäärä: 18.9.2025
 */

public class Ohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        System.out.println("----- Laskuri 1 -----");
        
        Laskuri laskuri1 = new Laskuri();
        System.out.println(laskuri1.arvo());
        
        laskuri1.vahenna();
        System.out.println(laskuri1.arvo());
        
        laskuri1.vahenna(-5);
        System.out.println(laskuri1.arvo());
        
        laskuri1.vahenna(5);
        System.out.println(laskuri1.arvo());
        
        laskuri1.lisaa();
        System.out.println(laskuri1.arvo());
        
        laskuri1.lisaa(-5);
        System.out.println(laskuri1.arvo());
        
        laskuri1.lisaa(5);
        System.out.println(laskuri1.arvo());
        
        System.out.println("----- Laskuri 2 -----");
        
        Laskuri laskuri2 = new Laskuri(10);
        System.out.println(laskuri2.arvo());
        
        laskuri2.vahenna();
        System.out.println(laskuri2.arvo());
        
        laskuri2.vahenna(-5);
        System.out.println(laskuri2.arvo());
        
        laskuri2.vahenna(5);
        System.out.println(laskuri2.arvo());
        
        laskuri2.lisaa();
        System.out.println(laskuri2.arvo());
        
        laskuri2.lisaa(-5);
        System.out.println(laskuri2.arvo());
        
        laskuri2.lisaa(5);
        System.out.println(laskuri2.arvo());
        
    }
}
