/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 3 - Tehtävä 32 - Henkilötietojen tarkastelu
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

import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String pisinHenkilonNimi = "";
        int henkiloidenSyntymavuodetYhteensa = 0;
        int henkiloidenLukumaara = 0;
        
        while (true) {
            String henkilonTiedot = lukija.nextLine();
            
            if (henkilonTiedot.equals("")) {
                break;
            }
            
            String[] henkilonTiedotTaulukossa = henkilonTiedot.split(",");
            String henkilonNimi = henkilonTiedotTaulukossa[0];
            
            if (henkilonNimi.length() > pisinHenkilonNimi.length()) {
                pisinHenkilonNimi = henkilonNimi;
            }
            
            henkiloidenSyntymavuodetYhteensa += 
                Integer.valueOf(henkilonTiedotTaulukossa[1]);
            henkiloidenLukumaara++;
        }
        
        System.out.println("Pisin nimi: " + pisinHenkilonNimi);
        System.out.println("Syntymävuosien keskiarvo: " 
            + (1.0 * henkiloidenSyntymavuodetYhteensa / henkiloidenLukumaara));
    }
}
