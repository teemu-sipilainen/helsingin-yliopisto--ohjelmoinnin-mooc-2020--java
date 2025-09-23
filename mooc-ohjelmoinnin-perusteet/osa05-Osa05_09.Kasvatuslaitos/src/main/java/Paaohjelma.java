/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 9 - Kasvatuslaitos
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
 * Päivämäärä: 21.9.2025
 */

public class Paaohjelma {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia 
        
        // Osa 1
        
        Kasvatuslaitos haaganNeuvola = new Kasvatuslaitos();

        Henkilo eero = new Henkilo("Eero", 1, 110, 7);
        Henkilo pekka = new Henkilo("Pekka", 33, 176, 85);

        System.out.println(eero.getNimi() + " paino: " + haaganNeuvola.punnitse(eero) + " kiloa");
        System.out.println(pekka.getNimi() + " paino: " + haaganNeuvola.punnitse(pekka) + " kiloa");

        // Osa 2
        
        haaganNeuvola.syota(eero);
        haaganNeuvola.syota(eero);
        haaganNeuvola.syota(eero);

        System.out.println("");

        System.out.println(eero.getNimi() + " paino: " + haaganNeuvola.punnitse(eero) + " kiloa");
        System.out.println(pekka.getNimi() + " paino: " + haaganNeuvola.punnitse(pekka) + " kiloa");
        
        // Osa 3
        
        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset());

        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(pekka);

        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset());

        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);

        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset());
    }
}
