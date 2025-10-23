/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 10 - Tehtavalista
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
 * Päivämäärä: 6.10.2025
 */

import java.util.Scanner;

public class Kayttoliittyma {
    
    private Tehtavalista tehtavalista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String tehtava = lukija.nextLine();
                this.tehtavalista.lisaa(tehtava);
            } else if (komento.equals("listaa")) {
                this.tehtavalista.tulosta();
            } else if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int numero = Integer.valueOf(lukija.nextLine());
                this.tehtavalista.poista(numero);
            }
        }
    }
    
}
