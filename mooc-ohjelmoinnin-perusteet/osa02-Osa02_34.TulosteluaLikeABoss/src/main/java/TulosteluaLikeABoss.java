/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 2 - Tehtävä 34 - Tulostelua Like A Boss
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
 * Päivämäärä: 29.8.2025
 */

public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for (int i = 0; i < maara; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        for (int i = 1; i <= koko; i++) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        
        for (int i = 1; i <= korkeus; i++) {
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(2 * i - 1);
        }
        
        for (int j = 1; j <= 2; j++) {
            tulostaTyhjaa(korkeus - 2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
