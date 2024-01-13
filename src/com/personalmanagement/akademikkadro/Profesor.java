package com.personalmanagement.akademikkadro;

import com.personalmanagement.arac.*;

public class Profesor extends AkademikKadro{
    public Profesor(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
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
        return arac instanceof Otomobil;
    }

    public void printAracUyari(){
        if(aracKontrol()){
            System.out.println("Artık motorsikleti docent'e  verebilirsin.");
        } else if(this.arac instanceof Bisiklet){
            System.out.println("Professor "+isim +" "+soysisim+", otomobil kullanmalısın.");
        } else if(this.arac instanceof Otomobil){
            System.out.println("Ogretim Uyesi "+isim +" "+soysisim+", otomobil kullanmalısın.");
        } else if (this.arac instanceof Motorsiklet) {
            System.out.println("Ogretim Uyesi "+isim +" "+soysisim+", otomobil kullanmalısın.");
        }
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "arac=" + arac +
                ", isim='" + isim + '\'' +
                ", soysisim='" + soysisim + '\'' +
                ", yas=" + yas +
                ", ehliyetVarMı=" + ehliyetVarMı +
                ", maas=" + maas() +
                '}';
    }
}
