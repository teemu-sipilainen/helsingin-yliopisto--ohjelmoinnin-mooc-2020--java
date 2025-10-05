/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 3 - Viestipalvelu
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
        
        Viestipalvelu viestipalvelu = new Viestipalvelu();
        
        Viesti viesti1 = new Viesti(
            "Teemu", 
            "Testataan, onnistuuko alle 280 merkkiä pitkän viestin lisääminen."
        );
        
        Viesti viesti2 = new Viesti(
            "Teemu", 
            "Testataan, onnistuuko yli 280 merkkiä pitkän viestin lisääminen. "
            + "Lisäsin tähän lorem ipsumia, jotta viestin pituudeksi tulee "
            + "yli 280 merkkiä. Lorem ipsum lorem ipsum lorem ipsum lorem "
            + "ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem "
            + "ipsum lorem ipsum lorem ipsum lorem ipsum."
        );
        
        viestipalvelu.lisaa(viesti1);
        viestipalvelu.lisaa(viesti2);
        
        System.out.println(viestipalvelu.getViestit());
    }
}
