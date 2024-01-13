package com.personalmanagement.akademikkadro;

public abstract class Calisan {
    protected String isim;
    protected String soysisim;
    protected int yas;
    protected boolean ehliyetVarMı;

    protected double asgari;

    public Calisan(String isim, String soysisim, int yas, boolean ehliyetVarMı, double asgari) {
        this.isim = isim;
        this.soysisim = soysisim;
        this.yas = yas;
        this.ehliyetVarMı = ehliyetVarMı;
        this.asgari = asgari;
    }

    public abstract boolean isAkademisyen();

    public abstract double maas();

}
