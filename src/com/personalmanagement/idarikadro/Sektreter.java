package com.personalmanagement.idarikadro;

import com.personalmanagement.arac.Arac;

public class Sektreter extends IdariKadro{
    public Sektreter(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari, Arac arac) {
        super(isim, soysisim, yas, ehliyetVarMı, asgari, arac);
    }

    @Override
    public double maas() {
        return 0;
    }

    @Override
    public boolean maasKontrol() {
        return false;
    }

    @Override
    public boolean aracKontrol() {
        return false;
    }
}
