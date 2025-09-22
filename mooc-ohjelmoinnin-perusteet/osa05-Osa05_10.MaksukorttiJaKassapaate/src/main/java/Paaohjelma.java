/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 10 - Maksukortti ja Kassapääte
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
 * Päivämäärä: 22.9.2025
 */

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        
        // Osa 1
        
        System.out.println("----- Osa 1 -----");
        
        Maksukortti pekanKorttiOsa1 = new Maksukortti(10);

        System.out.println("rahaa " + pekanKorttiOsa1.saldo());
        boolean onnistuikoOsa1 = pekanKorttiOsa1.otaRahaa(8);
        System.out.println("onnistuiko otto: " + onnistuikoOsa1);
        System.out.println("rahaa " + pekanKorttiOsa1.saldo());

        onnistuikoOsa1 = pekanKorttiOsa1.otaRahaa(4);
        System.out.println("onnistuiko otto: " + onnistuikoOsa1);
        System.out.println("rahaa " + pekanKorttiOsa1.saldo());
        
        // Osa 2
        
        System.out.println("----- Osa 2 -----");
        
        Kassapaate unicafeExactumOsa2 = new Kassapaate();

        double vaihtorahaaOsa2 = unicafeExactumOsa2.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaaOsa2);

        vaihtorahaaOsa2 = unicafeExactumOsa2.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaaOsa2);

        vaihtorahaaOsa2 = unicafeExactumOsa2.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaaOsa2);

        System.out.println(unicafeExactumOsa2);
        
        // Osa 3
        
        System.out.println("----- Osa 3 -----");
        
        Kassapaate unicafeExactumOsa3 = new Kassapaate();

        double vaihtorahaaOsa3 = unicafeExactumOsa3.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaaOsa3);

        Maksukortti antinKorttiOsa3 = new Maksukortti(7);

        boolean onnistuikoOsa3 = unicafeExactumOsa3.syoMaukkaasti(antinKorttiOsa3);
        System.out.println("riittikö raha: " + onnistuikoOsa3);
        onnistuikoOsa3 = unicafeExactumOsa3.syoMaukkaasti(antinKorttiOsa3);
        System.out.println("riittikö raha: " + onnistuikoOsa3);
        onnistuikoOsa3 = unicafeExactumOsa3.syoEdullisesti(antinKorttiOsa3);
        System.out.println("riittikö raha: " + onnistuikoOsa3);

        System.out.println(unicafeExactumOsa3);
        
        // Osa 4
        
        System.out.println("----- Osa 4 -----");
        
        Kassapaate unicafeExactumOsa4 = new Kassapaate();
        System.out.println(unicafeExactumOsa4);

        Maksukortti antinKorttiOsa4 = new Maksukortti(2);

        System.out.println("kortilla rahaa " + antinKorttiOsa4.saldo() + " euroa");

        boolean onnistuikoOsa4 = unicafeExactumOsa4.syoMaukkaasti(antinKorttiOsa4);
        System.out.println("riittikö raha: " + onnistuikoOsa4);

        unicafeExactumOsa4.lataaRahaaKortille(antinKorttiOsa4, 100);

        onnistuikoOsa4 = unicafeExactumOsa4.syoMaukkaasti(antinKorttiOsa4);
        System.out.println("riittikö raha: " + onnistuikoOsa4);

        System.out.println("kortilla rahaa " + antinKorttiOsa4.saldo() + " euroa");

        System.out.println(unicafeExactumOsa4);
    }
}

