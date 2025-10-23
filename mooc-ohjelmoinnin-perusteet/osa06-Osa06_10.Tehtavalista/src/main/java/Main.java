/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 10 - Tehtavalista
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
 * Päivämäärä: 6.10.2025
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
        
        // Osa 1, esimerkki 1
        
        System.out.println("----- Osa 1, esimerkki 1 -----");
        
        Tehtavalista listaOsa1Esim1 = new Tehtavalista();
        listaOsa1Esim1.lisaa("lue kurssimateriaalia");
        listaOsa1Esim1.lisaa("katso uusin fool us");
        listaOsa1Esim1.lisaa("ota rennosti");

        listaOsa1Esim1.tulosta();
        listaOsa1Esim1.poista(2);

        System.out.println();
        listaOsa1Esim1.tulosta();
        
        // Osa 1, esimerkki 2
        
        System.out.println("----- Osa 1, esimerkki 2 -----");
        
        Tehtavalista listaOsa1Esim2 = new Tehtavalista();
        listaOsa1Esim2.lisaa("lue kurssimateriaalia");
        listaOsa1Esim2.lisaa("katso uusin fool us");
        listaOsa1Esim2.lisaa("ota rennosti");
        listaOsa1Esim2.tulosta();
        listaOsa1Esim2.poista(2);
        listaOsa1Esim2.tulosta();
        listaOsa1Esim2.lisaa("osta rusinoita");
        listaOsa1Esim2.tulosta();
        listaOsa1Esim2.poista(1);
        listaOsa1Esim2.poista(1);
        listaOsa1Esim2.tulosta();
        
        // Osa 2
        
        System.out.println("----- Osa 2 -----");

        Tehtavalista lista = new Tehtavalista();
        Scanner lukija = new Scanner(System.in);

        Kayttoliittyma liittyma = new Kayttoliittyma(lista, lukija);
        liittyma.kaynnista();
    }
}
