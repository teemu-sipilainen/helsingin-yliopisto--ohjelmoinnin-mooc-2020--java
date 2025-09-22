/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 7 - NullPointerException
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
 * Päivämäärä: 21.9.2025
 */

import java.util.ArrayList;

public class NullPointerExceptionOhjelma {

    public static void main(String[] args) {
        // Toteuta tai muokkaa ohjelmaa siten, että ohjelmassa tapahtuu 
        // NullPointerException -virhe

        ArrayList<String> lines = new ArrayList<>();
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add("up with his quantum theory while studying...");
        lines.add(null); // TS: Added this line to cause NullPointerException

        int indeksi = 0;
        while (indeksi < lines.size()) {
            System.out.println(lines.get(indeksi));
            indeksi++;
        }
        
        String s = lines.get(6); // TS: Added this line to cause NullPointerException
        System.out.println(s.toUpperCase()); // TS: Added this line to cause NullPointerException

    }
}
