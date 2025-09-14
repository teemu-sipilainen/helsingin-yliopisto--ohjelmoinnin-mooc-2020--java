/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 14 - Kertoja
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
 * Päivämäärä: 11.9.2025
 */

public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla luokkasi toimintaa.
        // esimerkiksi: 

        // Tehtäväpohjan koodi Kertoja-luokan testausta varten
        Kertoja kolmellaKertoja1 = new Kertoja(3);
        System.out.println(kolmellaKertoja1.kerro(5));
        
        // Tehtävämateriaalin koodi Kertoja-luokan testausta varten
        Kertoja kolmellaKertoja2 = new Kertoja(3);

        System.out.println("kolmellaKertoja.kerro(2): " + kolmellaKertoja2.kerro(2));

        Kertoja neljallaKertoja = new Kertoja(4);

        System.out.println("neljallaKertoja.kerro(2): " + neljallaKertoja.kerro(2));
        System.out.println("kolmellaKertoja.kerro(1): " + kolmellaKertoja2.kerro(1));
        System.out.println("neljallaKertoja.kerro(1): " + neljallaKertoja.kerro(1));
    }
}
