package com.personalmanagement.akademikkadro;

import com.personalmanagement.arac.*;

public class OgretimUyesi extends AkademikKadro{
    public OgretimUyesi(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari, arac);
    }

    @Override
    public double maas() {
        return asgari*2;
    }

    @Override
    public boolean maasKontrol() {
        return false;
    }

    @Override
    public boolean aracKontrol() {
        return arac instanceof Scoother;
    }

    public void printAracUyari(){
        if(aracKontrol()){
            System.out.println("Artık bisikleti arastirma görevlisine verebilirsin.");
        } else if(this.arac instanceof Bisiklet){
            System.out.println("Ogretim Uyesi "+isim +" "+soysisim+", scoother kullanmalısın.");
        } else if(this.arac instanceof Otomobil){
            System.out.println("Ogretim Uyesi "+isim +" "+soysisim+", Profesor olunca otomobil alabilirsin");
        } else if (this.arac instanceof Motorsiklet) {
            System.out.println("Ogretim Uyesi "+isim +" "+soysisim+", Docent olunca motorsiklet alabilirsin");
        }
    }

    @Override
    public String toString() {
        return "OgretimUyesini{" +
                "arac=" + arac +
                ", isim='" + isim + '\'' +
                ", soysisim='" + soysisim + '\'' +
                ", yas=" + yas +
                ", ehliyetVarMı=" + ehliyetVarMı +
                ", maas=" + maas() +
                '}';
    }
}
