/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 11 - Keskiarvot
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

public class Ohjelma {

    public static void main(String[] args) {
        
        // Osa 1
        
        System.out.println("----- Osa 1 -----");
        
        Arvosanarekisteri rekisteriOsa1 = new Arvosanarekisteri();
        rekisteriOsa1.lisaaArvosanaPisteidenPerusteella(93);
        rekisteriOsa1.lisaaArvosanaPisteidenPerusteella(91);
        rekisteriOsa1.lisaaArvosanaPisteidenPerusteella(92);
        rekisteriOsa1.lisaaArvosanaPisteidenPerusteella(88);

        System.out.println(rekisteriOsa1.arvosanojenKeskiarvo());

        // Osa 2
        
        System.out.println("----- Osa 2 -----");
        
        Arvosanarekisteri rekisteriOsa2 = new Arvosanarekisteri();
        rekisteriOsa2.lisaaArvosanaPisteidenPerusteella(93);
        rekisteriOsa2.lisaaArvosanaPisteidenPerusteella(91);
        rekisteriOsa2.lisaaArvosanaPisteidenPerusteella(92);

        System.out.println(rekisteriOsa2.koepisteidenKeskiarvo());

        // Osa 3
        
        System.out.println("----- Osa 3 -----");
        
        Scanner lukija = new Scanner(System.in);

        Arvosanarekisteri rekisteri = new Arvosanarekisteri();

        Kayttoliittyma kali = new Kayttoliittyma(rekisteri, lukija);
        kali.kaynnista();
    }
}
