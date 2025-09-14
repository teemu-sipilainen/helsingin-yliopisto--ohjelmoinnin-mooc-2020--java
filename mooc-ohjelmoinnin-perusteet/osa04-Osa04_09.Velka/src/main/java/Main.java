/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 9 - Velka
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
 * Päivämäärä: 10.9.2025
 */

public class Main {

    public static void main(String[] args) {
        // Kokeile täällä tehtävässä luomasi Velka-luokan toimintaa

        Velka asuntolaina = new Velka(120000.0, 1.01);
        asuntolaina.tulostaSaldo();

        asuntolaina.odotaVuosi();
        asuntolaina.tulostaSaldo();

        int vuosia = 0;

        while (vuosia < 20) {
            asuntolaina.odotaVuosi();
            vuosia++;
        }

        asuntolaina.tulostaSaldo();
    }
}
