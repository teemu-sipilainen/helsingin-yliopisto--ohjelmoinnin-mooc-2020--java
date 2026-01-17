/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 6 - Arvosanatilastot
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
 * Päivämäärä: 24.10.2025 & 29.10.2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {
    
    // Osa 1
    public static double keskiarvo(ArrayList<Integer> yhteispisteet) {
        int yhteispisteidenSumma = 0;
        
        for (int yhteispiste: yhteispisteet) {
            yhteispisteidenSumma += yhteispiste;
        }
        
        return 1.0 * yhteispisteidenSumma / yhteispisteet.size();
    }
    
    // Osa 2
    public static String hyvaksyttyjenKeskiarvo(ArrayList<Integer> yhteispisteet) {
        int hyvaksyttyjenYhteispisteidenSumma = 0;
        int hyvaksyttyjenYhteispisteidenLukumaara = 0;
        
        for (int yhteispiste: yhteispisteet) {
            if (yhteispiste >= 50) {
                hyvaksyttyjenYhteispisteidenSumma += yhteispiste;
                hyvaksyttyjenYhteispisteidenLukumaara++;
            }
        }
        
        if (hyvaksyttyjenYhteispisteidenLukumaara == 0) {
            return "-";
        }
        
        return "" + 1.0 * hyvaksyttyjenYhteispisteidenSumma / hyvaksyttyjenYhteispisteidenLukumaara;
    }
    
    // Osa 3
    public static double hyvaksymisprosentti(ArrayList<Integer> yhteispisteet) {
        int hyvaksyttyjenYhteispisteidenLukumaara = 0;
        
        for (int yhteispiste: yhteispisteet) {
            if (yhteispiste >= 50) {
                hyvaksyttyjenYhteispisteidenLukumaara++;
            }
        }
        
        return 100.0 * hyvaksyttyjenYhteispisteidenLukumaara / yhteispisteet.size();
    }
    
    // Osa 4
    public static void tulostaArvosanajakauma(ArrayList<Integer> yhteispisteet) {
        int[] arvosanat = {0, 0, 0, 0, 0, 0};
        
        for (int yhteispiste: yhteispisteet) {
            if (yhteispiste < 50) {
                arvosanat[0]++;
            } else if (yhteispiste < 60) {
                arvosanat[1]++;
            } else if (yhteispiste < 70) {
                arvosanat[2]++;
            } else if (yhteispiste < 80) {
                arvosanat[3]++;
            } else if (yhteispiste < 90) {
                arvosanat[4]++;
            } else {
                arvosanat[5]++;
            }
        }
        
        for (int i = arvosanat.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < arvosanat[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        
        ArrayList<Integer> yhteispisteet = new ArrayList<>();
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == -1) {
                break;
            } else if (luku < 0 || 100 < luku) {
                continue;
            } else {
                yhteispisteet.add(luku);
            }
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): " + keskiarvo(yhteispisteet)); // Osa 1
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + hyvaksyttyjenKeskiarvo(yhteispisteet)); // Osa 2
        System.out.println("Hyväksymisprosentti: " + hyvaksymisprosentti(yhteispisteet)); // Osa 3
        System.out.println("Arvosanajakauma:"); // Osa 4
        tulostaArvosanajakauma(yhteispisteet); // Osa 4
    }
}
