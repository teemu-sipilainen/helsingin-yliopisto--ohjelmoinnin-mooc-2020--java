/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 1 - Nestesäiliöt
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
 * Päivämäärä: 13.10.2025
 */

import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            
            System.out.println("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            } else {
                String[] osat = luettu.split(" ");
                String komento = osat[0];
                int maara = Integer.valueOf(osat[1]);
                
                if (maara < 0) {
                    continue;
                }
                
                if (komento.equals("lisaa")) {
                    if (ensimmainen + maara <= 100) {
                        ensimmainen += maara;
                    } else {
                        ensimmainen = 100;
                    }
                } else if (komento.equals("siirra")) {
                    if (ensimmainen - maara < 0) {
                        maara = ensimmainen;
                        ensimmainen = 0;
                    } else {
                        ensimmainen -= maara;
                    }
                    
                    if (toinen + maara > 100) {
                        toinen = 100;
                    } else {
                        toinen += maara;
                    }
                } else if (komento.equals("poista")) {
                    if (toinen - maara >= 0) {
                        toinen -= maara;
                    } else {
                        toinen = 0;
                    }
                }
            }
        }
    }

}
