/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 2 - Nestesäiliöt olioilla
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
 * Päivämäärä: 20.10.2025
 */

import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);
            
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
                    ensimmainen.lisaa(maara);
                } else if (komento.equals("siirra")) {
                    if (ensimmainen.sisalto() - maara < 0) {
                        maara = ensimmainen.sisalto();
                        ensimmainen.poista(maara);
                    } else {
                        ensimmainen.poista(maara);
                    }
                    
                    toinen.lisaa(maara);
                } else if (komento.equals("poista")) {
                    toinen.poista(maara);
                }
            }

        }
    }

}
