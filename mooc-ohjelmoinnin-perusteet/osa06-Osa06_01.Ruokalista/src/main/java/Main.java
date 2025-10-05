/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 1 - Ruokalista 
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
 * Päivämäärä: 30.9.2025
 */

public class Main {
    public static void main(String[] args) {
        
        // Tehtäväpohjassa ollut materiaali testausta varten
        
        System.out.println("----- Tehtäväpohjassa ollut materiaali testausta varten -----");
        
        Ruokalista exactum = new Ruokalista();
        
        // Kun olet luonut metodin lisaaAteria(String ateria), 
        // voit poistaa allaolevat kommentit
        
        exactum.lisaaAteria("Pariloitua lohta ja kuhaa, basilikalla maustettua valkoviinivoikastiketta.");
        exactum.lisaaAteria("Kesäinen vihersalaatti ja omena-hunajavinegretti.");
        exactum.lisaaAteria("Paahdettua karitsan seläkettä ja punaviinikastiketta.");
        
        // Kun olet luonut metodin tulostaAteriat(), 
        // voit poistaa allaolevan kommentin
        
        exactum.tulostaAteriat();
        
        // Kun olet luonut metodin tyhjennaRuokalista(), voit poistaa 
        // allaolevat kommentit
        exactum.tyhjennaRuokalista();
        exactum.tulostaAteriat();
        
        // Materiaalissa oleva koodi testausta varten
        
        System.out.println("----- Materiaalissa oleva koodi testausta varten -----");
        
        Ruokalista menu = new Ruokalista();
        menu.lisaaAteria("Tofuratatouille");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Lihapyörykät sinappikastikeella");

        menu.tulostaAteriat();
        menu.tyhjennaRuokalista();

        System.out.println();
        menu.lisaaAteria("Tomaatti-mozzarellasalaatti");
        menu.tulostaAteriat();
    }
}
