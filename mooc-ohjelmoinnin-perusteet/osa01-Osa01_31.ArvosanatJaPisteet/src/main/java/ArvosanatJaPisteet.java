/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 1 - Tehtävä 31 - Arvosanat ja pisteet
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
 * Päivämäärä: 19.8.2025
 */

import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100}:");
        int syotetytPisteet = Integer.valueOf(lukija.nextLine());
        
        if (syotetytPisteet > 100) {
            System.out.println("Arvosana: uskomatonta!");
        } else if (syotetytPisteet >= 90) {
            System.out.println("Arvosana: 5");
        } else if (syotetytPisteet >= 80) {
            System.out.println("Arvosana: 4");
        } else if (syotetytPisteet >= 70) {
            System.out.println("Arvosana: 3");
        } else if (syotetytPisteet >= 60) {
            System.out.println("Arvosana: 2");
        } else if (syotetytPisteet >= 50) {
            System.out.println("Arvosana: 1");
        } else if (syotetytPisteet >= 0) {
            System.out.println("Arvosana: hylätty");
        } else {
            System.out.println("Arvosana: mahdotonta!");
        }
    }
}
