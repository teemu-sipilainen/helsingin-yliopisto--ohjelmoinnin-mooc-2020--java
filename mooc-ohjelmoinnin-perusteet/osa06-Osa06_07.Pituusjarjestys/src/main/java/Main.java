/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 7 - Pituusjärjestys 
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
 * Päivämäärä: 3.10.2025
 */

public class Main {

    public static void main(String[] args) {
        // Kokeile luokkaasi täällä
        
        // Osa 1
        
        System.out.println("----- Osa 1 -----");
        
        Huone huoneOsa1 = new Huone();
        System.out.println("Huone tyhjä? " + huoneOsa1.onTyhja());
        huoneOsa1.lisaa(new Henkilo("Lea", 183));
        huoneOsa1.lisaa(new Henkilo("Kenya", 182));
        huoneOsa1.lisaa(new Henkilo("Auli", 186));
        huoneOsa1.lisaa(new Henkilo("Nina", 172));
        huoneOsa1.lisaa(new Henkilo("Terhi", 185));
        System.out.println("Huone tyhjä? " + huoneOsa1.onTyhja());

        System.out.println("");
        for (Henkilo henkilo : huoneOsa1.getHenkilot()) {
            System.out.println(henkilo);
        }
        
        // Osa 2
        
        System.out.println("----- Osa 2 -----");
        
        Huone huoneOsa2 = new Huone();
        System.out.println("Lyhin: " + huoneOsa2.lyhin());
        System.out.println("Huone tyhjä? " + huoneOsa2.onTyhja());
        huoneOsa2.lisaa(new Henkilo("Lea", 183));
        huoneOsa2.lisaa(new Henkilo("Kenya", 182));
        huoneOsa2.lisaa(new Henkilo("Auli", 186));
        huoneOsa2.lisaa(new Henkilo("Nina", 172));
        huoneOsa2.lisaa(new Henkilo("Terhi", 185));
        System.out.println("Huone tyhjä? " + huoneOsa2.onTyhja());

        System.out.println("");
        for (Henkilo henkilo : huoneOsa2.getHenkilot()) {
            System.out.println(henkilo);
        }

        System.out.println();
        System.out.println("Lyhin: " + huoneOsa2.lyhin());
        System.out.println("");
        for (Henkilo henkilo : huoneOsa2.getHenkilot()) {
            System.out.println(henkilo);
        }
        
        // Osa 3a
        
        System.out.println("----- Osa 3a -----");
        
        Huone huoneOsa3a = new Huone();
        huoneOsa3a.lisaa(new Henkilo("Lea", 183));
        huoneOsa3a.lisaa(new Henkilo("Kenya", 182));
        huoneOsa3a.lisaa(new Henkilo("Auli", 186));
        huoneOsa3a.lisaa(new Henkilo("Nina", 172));
        huoneOsa3a.lisaa(new Henkilo("Terhi", 185));

        System.out.println("");
        for (Henkilo henkilo : huoneOsa3a.getHenkilot()) {
            System.out.println(henkilo);
        }

        System.out.println();
        System.out.println("Lyhin: " + huoneOsa3a.ota());
        System.out.println("");
        for (Henkilo henkilo : huoneOsa3a.getHenkilot()) {
            System.out.println(henkilo);
        }
        
        // Osa 3b
        
        System.out.println("----- Osa 3b -----");
        
        Huone huoneOsa3b = new Huone();
        huoneOsa3b.lisaa(new Henkilo("Lea", 183));
        huoneOsa3b.lisaa(new Henkilo("Kenya", 182));
        huoneOsa3b.lisaa(new Henkilo("Auli", 186));
        huoneOsa3b.lisaa(new Henkilo("Nina", 172));
        huoneOsa3b.lisaa(new Henkilo("Terhi", 185));

        while (!huoneOsa3b.onTyhja()) {
            System.out.println(huoneOsa3b.ota());
        }
        
    }
}
