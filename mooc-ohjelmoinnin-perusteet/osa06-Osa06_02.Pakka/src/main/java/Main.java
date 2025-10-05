/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 2 - Pakka 
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
 * Päivämäärä: 2.10.2025
 */

public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        
        // Osa 1
        
        Pakka p = new Pakka();
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        p.lisaa("Arvo");
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        
        // Osa 2a
        
        String otettu = p.ota();
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        System.out.println(otettu);
        
        // Osa 2b
        
        Pakka pOsa2b = new Pakka();
        pOsa2b.lisaa("1");
        pOsa2b.lisaa("2");
        pOsa2b.lisaa("3");
        pOsa2b.lisaa("4");
        pOsa2b.lisaa("5");

        while (!pOsa2b.onTyhja()) {
            System.out.println(pOsa2b.ota());
        }
    }
}
