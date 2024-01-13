package com.personalmanagement.akademikkadro;

import com.personalmanagement.arac.*;

public class ArastirmaGorevlisi extends AkademikKadro{
    public ArastirmaGorevlisi(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari, arac);
    }

    @Override
    public double maas() {
        return asgari*1.5;
    }

    @Override
    public boolean maasKontrol() {
        return false;
    }

    @Override
    public boolean aracKontrol() {
        return arac instanceof Bisiklet;
    }

    public void printAracUyari(){
        if(aracKontrol()){
        }
        else if(this.arac instanceof Otomobil){
            System.out.println("Arastirma Gorevlisi "+isim +" "+soysisim+", Profesor olunca otomobil alabilirsin");
        } else if (this.arac instanceof Scoother) {
            System.out.println("Arastirma Gorevlisi "+isim +" "+soysisim+", Ogretim uyesi olunca scoother alabilirsin");
        } else if (this.arac instanceof Motorsiklet) {
            System.out.println("Arastirma Gorevlisi "+isim +" "+soysisim+", Docent olunca motorsiklet alabilirsin");
        }
    }

    @Override
    public String toString() {
        return "ArastirmaGorevlisi{" +
                "arac=" + arac +
                ", isim='" + isim + '\'' +
                ", soysisim='" + soysisim + '\'' +
                ", yas=" + yas +
                ", ehliyetVarMı=" + ehliyetVarMı +
                ", maas=" + maas() +
                '}';
    }
}
