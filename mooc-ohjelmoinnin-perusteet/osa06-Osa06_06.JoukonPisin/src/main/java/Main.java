/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 6 - Joukon pisin
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
        Joukko j = new Joukko("hahmot");
        System.out.println("Pisin: " + j.pisin());
        
        j.lisaa("magneto");
        j.lisaa("mystique");
        j.lisaa("phoenix");
        
        System.out.println("Pisin: " + j.pisin());
        
    }
}
