/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 5 - Monta konstruktoria
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
        // tee tänne testikoodia
        
        Esine mitta = new Esine("Mitta");
        Esine laasti = new Esine("Laasti", "remonttitavarat");
        Esine rengas = new Esine("Rengas", 5);

        System.out.println(mitta);
        System.out.println(laasti);
        System.out.println(rengas);
    }
}
