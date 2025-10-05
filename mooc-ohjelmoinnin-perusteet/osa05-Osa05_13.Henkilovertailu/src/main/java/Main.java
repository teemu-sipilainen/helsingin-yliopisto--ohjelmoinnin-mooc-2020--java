/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 13 - Henkilövertailu
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
 * Päivämäärä: 23.9.2025
 */

public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        
        Paivays pvm = new Paivays(24, 3, 2017);
        Paivays pvm2 = new Paivays(23, 7, 2017);

        Henkilo leevi = new Henkilo("Leevi", pvm, 62, 9);
        Henkilo lilja = new Henkilo("Lilja", pvm2, 65, 8);

        if (leevi.equals(lilja)) {
            System.out.println("Meniköhän nyt ihan oikein?");
        }

        Henkilo leeviEriPainolla = new Henkilo("Leevi", pvm, 62, 10);

        if (leevi.equals(leeviEriPainolla)) {
            System.out.println("Meniköhän nyt ihan oikein?");
        }

    }
}
