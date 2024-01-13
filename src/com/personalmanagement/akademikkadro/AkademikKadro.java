package com.personalmanagement.akademikkadro;

import com.personalmanagement.arac.Arac;

public abstract class AkademikKadro extends Calisan{
    protected Arac arac;

    public AkademikKadro(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari);
        this.arac = arac;
        printAracUyari();
    }

    public abstract boolean maasKontrol();

    public abstract boolean aracKontrol();

    public abstract void printAracUyari();

    @Override
    public boolean isAkademisyen(){
        return true;
    }

    @Override
    public String toString() {
        return "AkademikKadro{" +
                "arac=" + arac +
                ", isim='" + isim + '\'' +
                ", soysisim='" + soysisim + '\'' +
                ", yas=" + yas +
                ", ehliyetVarMı=" + ehliyetVarMı +
                ", maas=" + maas() +
                '}';
    }
}
