/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 12 - Kappale
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
 * Päivämäärä: 22.9.2025
 */

public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne

        Kappale jackSparrow = new Kappale("The Lonely Island", "Jack Sparrow", 196);
        Kappale toinenSparrow = new Kappale("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(toinenSparrow)) {
            System.out.println("Kappaleet olivat samat.");
        }

        if (jackSparrow.equals("Toinen olio")) {
            System.out.println("Nyt on jotain hassua.");
        }
    }
}
