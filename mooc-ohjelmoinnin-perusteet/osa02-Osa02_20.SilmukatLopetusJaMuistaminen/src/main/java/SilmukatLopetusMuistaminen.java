/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 20 - Silmukat, lopetus ja muistaminen
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
 * Päivämäärä: 24.8.2025
 */

import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int lukuja = 0;
        int parillisiaLukuja = 0;
        int parittomiaLukuja = 0;
        
        System.out.println("Syötä luvut:");
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == -1) {
                break;
            }
            
            if (luku % 2 == 0) {
                parillisiaLukuja++;
            } else {
                parittomiaLukuja++;
            }
            
            summa += luku;
            lukuja++;
        }
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + (1.0 * summa/lukuja));
        System.out.println("Parillisia: " + parillisiaLukuja);
        System.out.println("Parittomia: " + parittomiaLukuja);
    }
}
