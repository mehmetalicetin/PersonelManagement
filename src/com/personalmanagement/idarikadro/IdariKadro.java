package com.personalmanagement.idarikadro;

import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.arac.Arac;

public abstract class IdariKadro extends Calisan {
    protected Arac arac;

    public IdariKadro(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari);
        this.arac = arac;
    }

    public abstract double maas();

    public abstract boolean maasKontrol();

    public abstract boolean aracKontrol();

    @Override
    public boolean isAkademisyen(){
        return false;
    }
}
