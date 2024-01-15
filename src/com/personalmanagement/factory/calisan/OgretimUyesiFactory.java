package com.personalmanagement.factory.calisan;

import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.akademikkadro.OgretimUyesi;
import com.personalmanagement.arac.Arac;

public class OgretimUyesiFactory extends AkademikKadroFactory{
    private static final OgretimUyesiFactory FACTORY = new OgretimUyesiFactory();

    private OgretimUyesiFactory(){}

    public static OgretimUyesiFactory of(){
        return FACTORY;
    }
    @Override
    public Calisan createCalisan(String isim, String soyisim, int yas, boolean ehliyet, double asgari, Arac arac) {
        return new OgretimUyesi(isim, soyisim, yas, ehliyet, asgari, arac);
    }
}
