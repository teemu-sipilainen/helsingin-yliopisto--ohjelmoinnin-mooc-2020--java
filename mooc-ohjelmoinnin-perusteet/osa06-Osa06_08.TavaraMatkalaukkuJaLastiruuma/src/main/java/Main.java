/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 6 - Tehtävä 8 - Tavara, Matkalaukku ja Lastiruuma
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
 * Päivämäärä: 5.10.2025
 */

public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        
        // Osa 1
        
        System.out.println("----- Osa 1 -----");
        
        Tavara kirjaOsa1 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa1 = new Tavara("Nokia 3210", 1);

        System.out.println("Kirjan nimi: " + kirjaOsa1.getNimi());
        System.out.println("Kirjan paino: " + kirjaOsa1.getPaino());

        System.out.println("Kirja: " + kirjaOsa1);
        System.out.println("Puhelin: " + puhelinOsa1);
        
        // Osat 2 ja 3
        
        System.out.println("----- Osat 2 ja 3 -----");
        
        Tavara kirjaOsa2 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa2 = new Tavara("Nokia 3210", 1);
        Tavara tiiliskiviOsa2 = new Tavara("tiiliskivi", 4);

        Matkalaukku matkalaukkuOsa2 = new Matkalaukku(5);
        System.out.println(matkalaukkuOsa2);

        matkalaukkuOsa2.lisaaTavara(kirjaOsa2);
        System.out.println(matkalaukkuOsa2);

        matkalaukkuOsa2.lisaaTavara(puhelinOsa2);
        System.out.println(matkalaukkuOsa2);

        matkalaukkuOsa2.lisaaTavara(tiiliskiviOsa2);
        System.out.println(matkalaukkuOsa2);
        
        // Osa 4
        
        System.out.println("----- Osa 4 -----");
        
        Tavara kirjaOsa4 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa4 = new Tavara("Nokia 3210", 1);
        Tavara tiiliskiviOsa4 = new Tavara("tiiliskivi", 4);

        Matkalaukku matkalaukkuOsa4 = new Matkalaukku(10);
        matkalaukkuOsa4.lisaaTavara(kirjaOsa4);
        matkalaukkuOsa4.lisaaTavara(puhelinOsa4);
        matkalaukkuOsa4.lisaaTavara(tiiliskiviOsa4);

        System.out.println("Matkalaukussa on seuraavat tavarat:");
        matkalaukkuOsa4.tulostaTavarat();
        System.out.println("Yhteispaino: " + matkalaukkuOsa4.yhteispaino() + " kg");
        
        // Osa 5
        
        System.out.println("----- Osa 5 -----");
        
        Tavara kirjaOsa5 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa5 = new Tavara("Nokia 3210", 1);
        Tavara tiiliskiviOsa5 = new Tavara("Tiiliskivi", 4);

        Matkalaukku matkalaukkuOsa5 = new Matkalaukku(10);
        matkalaukkuOsa5.lisaaTavara(kirjaOsa5);
        matkalaukkuOsa5.lisaaTavara(puhelinOsa5);
        matkalaukkuOsa5.lisaaTavara(tiiliskiviOsa5);

        Tavara raskainOsa5 = matkalaukkuOsa5.raskainTavara();
        System.out.println("Raskain tavara: " + raskainOsa5);
        
        // Osa 6
        
        System.out.println("----- Osa 6 -----");
        
        Tavara kirjaOsa6 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa6 = new Tavara("Nokia 3210", 1);
        Tavara tiiliskiviOsa6 = new Tavara("tiiliskivi", 4);

        Matkalaukku adanLaukkuOsa6 = new Matkalaukku(10);
        adanLaukkuOsa6.lisaaTavara(kirjaOsa6);
        adanLaukkuOsa6.lisaaTavara(puhelinOsa6);

        Matkalaukku pekanLaukkuOsa6 = new Matkalaukku(10);
        pekanLaukkuOsa6.lisaaTavara(tiiliskiviOsa6);

        Lastiruuma lastiruumaOsa6 = new Lastiruuma(1000);
        lastiruumaOsa6.lisaaMatkalaukku(adanLaukkuOsa6);
        lastiruumaOsa6.lisaaMatkalaukku(pekanLaukkuOsa6);

        System.out.println(lastiruumaOsa6);
        
        // Osa 7
        
        System.out.println("----- Osa 7 -----");
        
        Tavara kirjaOsa7 = new Tavara("Aapiskukko", 2);
        Tavara puhelinOsa7 = new Tavara("Nokia 3210", 1);
        Tavara tiiliskiviOsa7 = new Tavara("tiiliskivi", 4);

        Matkalaukku adanLaukkuOsa7 = new Matkalaukku(10);
        adanLaukkuOsa7.lisaaTavara(kirjaOsa7);
        adanLaukkuOsa7.lisaaTavara(puhelinOsa7);

        Matkalaukku pekanLaukkuOsa7 = new Matkalaukku(10);
        pekanLaukkuOsa7.lisaaTavara(tiiliskiviOsa7);

        Lastiruuma lastiruumaOsa7 = new Lastiruuma(1000);
        lastiruumaOsa7.lisaaMatkalaukku(adanLaukkuOsa7);
        lastiruumaOsa7.lisaaMatkalaukku(pekanLaukkuOsa7);

        System.out.println("Ruuman matkalaukuissa on seuraavat tavarat:");
        lastiruumaOsa7.tulostaTavarat();
        
    }

}
