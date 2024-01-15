package com.personalmanagement.factory.calisan;

import com.personalmanagement.akademikkadro.ArastirmaGorevlisi;
import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.arac.Arac;

public class ArastirmaGorevlisiFactory extends AkademikKadroFactory{
    private static final ArastirmaGorevlisiFactory FACTORY = new ArastirmaGorevlisiFactory();

    private ArastirmaGorevlisiFactory(){}

    public static ArastirmaGorevlisiFactory of(){
        return FACTORY;
    }
    @Override
    public Calisan createCalisan(String isim, String soyisim, int yas, boolean ehliyet, double asgari, Arac arac) {
        return new ArastirmaGorevlisi(isim, soyisim, yas, ehliyet, asgari, arac);
    }
}
