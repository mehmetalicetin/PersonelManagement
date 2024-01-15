package com.personalmanagement.factory.calisan;

import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.akademikkadro.Docent;
import com.personalmanagement.arac.Arac;

public class DocentFactory extends AkademikKadroFactory{
    private static final DocentFactory FACTORY = new DocentFactory();

    private DocentFactory(){}

    public static DocentFactory of(){
        return FACTORY;
    }
    @Override
    public Calisan createCalisan(String isim, String soyisim, int yas, boolean ehliyet, double asgari, Arac arac) {
        return new Docent(isim, soyisim, yas, ehliyet, asgari, arac);
    }
}
