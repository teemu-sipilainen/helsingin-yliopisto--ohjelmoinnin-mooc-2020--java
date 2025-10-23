/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 4 - Valmiit järjestämisalgoritmit
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
 * Päivämäärä: 22.10.2025
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {
    
    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
    }
    
    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        Collections.sort(merkkijonot);
    }

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukkoInt = {3, 1, 5, 99, 3, 12};
        jarjesta(taulukkoInt);
        System.out.println(Arrays.toString(taulukkoInt));
        
        String[] taulukkoString = {"Mikko", "Anna", "Teemu", "Laura", "Pekka"};
        jarjesta(taulukkoString);
        System.out.println(Arrays.toString(taulukkoString));
        
        ArrayList<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(3);
        listaInteger.add(1);
        listaInteger.add(5);
        listaInteger.add(99);
        listaInteger.add(3);
        listaInteger.add(12);
        jarjestaLuvut(listaInteger);
        System.out.println(listaInteger);
        
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Mikko");
        listaString.add("Anna");
        listaString.add("Teemu");
        listaString.add("Laura");
        listaString.add("Pekka");
        jarjestaMerkkijonot(listaString);
        System.out.println(listaString);
    }

}
