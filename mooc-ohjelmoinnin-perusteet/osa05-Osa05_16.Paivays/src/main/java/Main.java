/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 16 - Päiväys
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

public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        
        Paivays pvm = new Paivays(13, 2, 2015);
        System.out.println("Tarkistellun viikon perjantai on " + pvm);

        Paivays uusiPvm = pvm.paivienPaasta(7);
        int vk = 1;
        while (vk <= 7) {
            System.out.println("Perjantai " + vk + " viikon kuluttua on " + uusiPvm);
            uusiPvm = uusiPvm.paivienPaasta(7);

            vk = vk + 1;
        }


        System.out.println("Päivämäärä 790:n päivän päästä tarkistellusta perjantaista on ... kokeile itse!");
        System.out.println("Kokeile " + pvm.paivienPaasta(790));
    }
}
