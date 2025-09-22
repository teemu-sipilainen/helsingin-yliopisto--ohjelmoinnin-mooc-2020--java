/**
 * Ohjelmoinnin MOOC 2020 - Ohjelmoinnin perusteet
 * 
 * Osa 5 - Tehtävä 10 - Maksukortti ja Kassapääte
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

public class Kassapaate {
    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        
        this.rahaa = 1000; // Osa 2
    }

    // Osa 2
    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        
        double edullisenLounaanHinta = 2.50;
        
        if (maksu >= edullisenLounaanHinta) {
            this.edulliset++;
            this.rahaa += edullisenLounaanHinta;
            return maksu - edullisenLounaanHinta;
        }
        
        return maksu;
    }

    // Osa 2
    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        
        double maukkaanLounaanHinta = 4.30;
        
        if (maksu >= maukkaanLounaanHinta) {
            this.maukkaat++;
            this.rahaa += maukkaanLounaanHinta;
            return maksu - maukkaanLounaanHinta;
        }
        
        return maksu;
    }
    
    // Osa 3
    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        
        double edullisenLounaanHinta = 2.50;
        
        if (edullisenLounaanHinta <= kortti.saldo()) {
            this.edulliset++;
            kortti.otaRahaa(edullisenLounaanHinta);
            return true;
        }
        
        return false;
    }

    // Osa 3
    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        
        double maukkaanLounaanHinta = 4.30;
        
        if (maukkaanLounaanHinta <= kortti.saldo()) {
            this.maukkaat ++;
            kortti.otaRahaa(maukkaanLounaanHinta);
            return true;
        }
        
        return false;
    }
    
    // Osa 4
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa <= 0) {
            return;
        }
        
        this.rahaa += summa;
        kortti.lataaRahaa(summa);
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
