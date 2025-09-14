/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 30 - Vanhimman ikä
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
 * Päivämäärä: 8.9.2025
 */

import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int vanhimmanHenkilonIka = -1;
        
        while (true) {
            String henkilonTiedot = lukija.nextLine();
            
            if (henkilonTiedot.equals("")) {
                break;
            }
            
            String[] henkilonTiedotTaulukossa = henkilonTiedot.split(",");
            int henkilonIka = Integer.valueOf(henkilonTiedotTaulukossa[1]);
            
            if (henkilonIka > vanhimmanHenkilonIka) {
                vanhimmanHenkilonIka = henkilonIka;
            }
        }
        
        System.out.println("Vanhimman ikä: " + vanhimmanHenkilonIka);
    }
}
