package com.personalmanagement.akademikkadro;

import com.personalmanagement.arac.*;

public class Docent extends AkademikKadro{
    public Docent(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari, arac);
    }

    @Override
    public double maas() {
        return asgari*3;
    }

    @Override
    public boolean maasKontrol() {
        return false;
    }

    @Override
    public boolean aracKontrol() {
        return arac instanceof Motorsiklet;
    }

    public void printAracUyari(){
        if(aracKontrol()){
            System.out.println("Artık scoother ogretim uyesine  verebilirsin.");
        }
        else if(this.arac instanceof Otomobil){
            System.out.println("Docent "+isim +" "+soysisim+", Profesor olunca otomobil alabilirsin");
        } else if (this.arac instanceof Scoother) {
            System.out.println("Docent "+isim +" "+soysisim+", motorsiklet kullanmalısın");
        } else if (this.arac instanceof Motorsiklet) {
            System.out.println("Arastirma Gorevlisi "+isim +" "+soysisim+", motorsiklet kullanmalısın");
        }
    }

    @Override
    public String toString() {
        return "Docent{" +
                "arac=" + arac +
                ", isim='" + isim + '\'' +
                ", soysisim='" + soysisim + '\'' +
                ", yas=" + yas +
                ", ehliyetVarMı=" + ehliyetVarMı +
                ", maas=" + maas() +
                '}';
    }
}
