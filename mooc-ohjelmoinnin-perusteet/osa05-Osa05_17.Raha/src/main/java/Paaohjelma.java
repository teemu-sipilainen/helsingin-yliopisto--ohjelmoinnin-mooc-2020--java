/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 17 - Raha
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
 * Päivämäärä: 29.9.2025
 */

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        
        // Osa 1
        
        Raha aOsa1 = new Raha(10,0);
        Raha bOsa1 = new Raha(5,0);

        Raha cOsa1 = aOsa1.plus(bOsa1);

        System.out.println(aOsa1);  // 10.00e
        System.out.println(bOsa1);  // 5.00e
        System.out.println(cOsa1);  // 15.00e

        aOsa1 = aOsa1.plus(cOsa1);          // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "a:n langan päähän"
        //       vanha a:n langan päässä ollut 10 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(aOsa1);  // 25.00e
        System.out.println(bOsa1);  // 5.00e
        System.out.println(cOsa1);  // 15.00e
        
        // Osa 2
        
        Raha aOsa2 = new Raha(10, 0);
        Raha bOsa2 = new Raha(3, 0);
        Raha cOsa2 = new Raha(5, 0);

        System.out.println(aOsa2.vahemman(bOsa2));  // false
        System.out.println(bOsa2.vahemman(cOsa2));  // true
        
        // Osa 3
        
        Raha aOsa3 = new Raha(10, 0);
        Raha bOsa3 = new Raha(3, 50);

        Raha cOsa3 = aOsa3.miinus(bOsa3);

        System.out.println(aOsa3);  // 10.00e
        System.out.println(bOsa3);  // 3.50e
        System.out.println(cOsa3);  // 6.50e

        cOsa3 = cOsa3.miinus(aOsa3);        // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "c:n langan päähän"
        //       vanha c:n langan päässä ollut 6.5 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(aOsa3);  // 10.00e
        System.out.println(bOsa3);  // 3.50e
        System.out.println(cOsa3);  // 0.00e
    }
}
