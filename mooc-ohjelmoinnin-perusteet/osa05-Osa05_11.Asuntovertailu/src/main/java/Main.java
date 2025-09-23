/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 11 - Asuntovertailu
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

public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        Asunto eiraYksio = new Asunto(1, 16, 5500);
        Asunto kallioKaksio = new Asunto(2, 38, 4200);
        Asunto jakomakiKolmio = new Asunto(3, 78, 2500);
        
        // Osa 1
        System.out.println(eiraYksio.suurempi(kallioKaksio));       // false
        System.out.println(jakomakiKolmio.suurempi(kallioKaksio));  // true
        
        // Osa 2
        System.out.println(eiraYksio.hintaero(kallioKaksio));        // 71600
        System.out.println(jakomakiKolmio.hintaero(kallioKaksio));   // 35400
        
        // Osa 3
        System.out.println(eiraYksio.kalliimpi(kallioKaksio));       // false
        System.out.println(jakomakiKolmio.kalliimpi(kallioKaksio));  // true
  
    }
}
