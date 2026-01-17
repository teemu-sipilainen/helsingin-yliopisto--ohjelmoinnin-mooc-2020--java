/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 7 - Tehtävä 7 - Reseptihaku
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
 * Päivämäärä: 14.1.2026
 */

// import java.io.File; // TS: Ei tarvita?
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {
    private static ArrayList<Resepti> reseptit = new ArrayList<>();
    
    // Osa 1
    public static void lueReseptitTiedostosta(String tiedosto) {
        reseptit.clear(); // TS: Lisätty TMC-testien takia
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String nimi = tiedostonLukija.nextLine();
                int keittoAika = Integer.valueOf(tiedostonLukija.nextLine());
                ArrayList<String> rivit = new ArrayList<>();

                while (tiedostonLukija.hasNextLine()) {
                    String rivi = tiedostonLukija.nextLine();
                    
                    if (rivi.isEmpty()) {
                        break;
                    }
                    
                    rivit.add(rivi);
                }

                Resepti resepti = new Resepti(nimi, keittoAika, rivit);
                reseptit.add(resepti);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
    
    // Osa 1
    public static void listaaReseptit() {
        System.out.println("Reseptit:");
        for (Resepti resepti: reseptit) {
            System.out.println(resepti);
        }
    }
    
    // Osa 2
    public static void haeNimi(String nimi) {
        System.out.println("Reseptit:");
        for (Resepti resepti: reseptit) {
            if (resepti.getNimi().contains(nimi)) {
                System.out.println(resepti);
            }
        }
    }
    
    // Osa 3
    public static void haeKeittoAika(int keittoAika) {
        System.out.println("Reseptit:");
        for (Resepti resepti: reseptit) {
            if (resepti.getKeittoAika() <= keittoAika) {
                System.out.println(resepti);
            }
        }
    }
    
    // Osa 4
    public static void haeAine(String aine) {
        System.out.println("Reseptit:");
        for (Resepti resepti: reseptit) {
            ArrayList<String> raakaAineet = resepti.getRaakaAineet();
            for (String raakaAine: raakaAineet) {
                if (raakaAine.equals(aine)) {
                    System.out.println(resepti);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
        
        lueReseptitTiedostosta(tiedosto);
        
        System.out.println();
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        
        while (true) {
            System.out.println();
            System.out.println("Syötä komento:");
            
            String komento = lukija.nextLine();
            
            if (komento.equals("listaa")) {
                System.out.println();
                listaaReseptit();
            } else if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("hae nimi")) {
                System.out.println("Mitä haetaan:");
                String haettava = lukija.nextLine();
                System.out.println();
                haeNimi(haettava);
            } else if (komento.equals("hae keittoaika")) {
                System.out.println("Keittoaika korkeintaan:");
                int haettava = Integer.valueOf(lukija.nextLine());
                System.out.println("");
                haeKeittoAika(haettava);
            } else if (komento.equals("hae aine")) {
                System.out.println("Mitä raaka-ainetta haetaan:");
                String haettava = lukija.nextLine();
                System.out.println();
                haeAine(haettava);
            }
        }
    }

}
