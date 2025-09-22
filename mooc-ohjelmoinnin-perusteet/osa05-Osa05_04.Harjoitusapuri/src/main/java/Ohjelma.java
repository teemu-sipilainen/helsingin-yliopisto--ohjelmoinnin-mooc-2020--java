/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 4 - Harjoitusapuri
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
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla
        // Harjoitusapuri-luokkaasi

        Harjoitusapuri apuri = new Harjoitusapuri(30, 60);

        double prosenttiosuus = 0.5;

        while (prosenttiosuus < 1.0) {
            double tavoite = apuri.tavoitesyke(prosenttiosuus);
            System.out.println("Tavoite " + (prosenttiosuus * 100) + "% maksimista: " + tavoite);
            prosenttiosuus += 0.1;
        }

    }
}
