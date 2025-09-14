/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 4 - Tehtävä 16 - Maksukortti
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
 * Päivämäärä: 12.9.2025
 */

public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        
        // Osa 6
        
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
    }
}
