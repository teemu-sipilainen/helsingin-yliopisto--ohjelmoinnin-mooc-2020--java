/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 28 - Mittaukset tiedostosta
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
 * Päivämäärä: 15.9.2025
 */

import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        
        System.out.println("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            int sallittujenLukujenLukumaara = 0;
            while (tiedostonLukija.hasNextLine()) {
                int luku = Integer.valueOf(tiedostonLukija.nextLine());
                if (alaraja <= luku && luku <= ylaraja) {
                    sallittujenLukujenLukumaara++;
                }
            }
            
            System.out.println("Lukuja: " + sallittujenLukujenLukumaara);
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
    
}
