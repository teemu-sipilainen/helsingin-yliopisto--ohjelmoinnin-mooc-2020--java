/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 4 - Joukon tulostaminen
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
 * Päivämäärä: 3.10.2025
 */

public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä

        // Testit 1
        
        Joukko j1 = new Joukko("aakkoset");
        System.out.println(j1);

        System.out.println();

        j1.lisaa("a");
        System.out.println(j1);

        System.out.println();

        j1.lisaa("b");
        System.out.println(j1);

        System.out.println();

        j1.lisaa("c");
        System.out.println(j1);
        
        // Testit 2
        
        Joukko j2 = new Joukko("hahmot");
        System.out.println(j2);        
        
        System.out.println();
        
        j2.lisaa("magneto");
        System.out.println(j2);
        
        System.out.println();
        
        j2.lisaa("mystique");
        System.out.println(j2);
        
        System.out.println();
        
        j2.lisaa("phoenix");
        System.out.println(j2);

    }
}
