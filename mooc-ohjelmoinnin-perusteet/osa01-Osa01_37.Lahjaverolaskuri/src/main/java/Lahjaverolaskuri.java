/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 37 - Lahjaverolaskuri
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
 * Päivämäärä: 20.8.2025
 */

import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Lahjan suuruus?");
        int syotettyLahjanSuuruus = Integer.valueOf(lukija.nextLine());
        
        if (syotettyLahjanSuuruus >= 1000000) {
            System.out.println("Vero: " + (142100 + 0.17 * (syotettyLahjanSuuruus - 1000000)));
        } else if (syotettyLahjanSuuruus >= 200000) {
            System.out.println("Vero: " + (22100 + 0.15 * (syotettyLahjanSuuruus - 200000)));
        } else if (syotettyLahjanSuuruus >= 55000) {
            System.out.println("Vero: " + (4700 + 0.12 * (syotettyLahjanSuuruus - 55000)));
        } else if (syotettyLahjanSuuruus >= 25000) {
            System.out.println("Vero: " + (1700 + 0.10 * (syotettyLahjanSuuruus - 25000)));
        } else if (syotettyLahjanSuuruus >= 5000) {
            System.out.println("Vero: " + (100 + 0.08 * (syotettyLahjanSuuruus - 5000)));
        } else {
            System.out.println("Ei veroa!");
        }
    }
}
