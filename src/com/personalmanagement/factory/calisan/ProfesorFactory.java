package com.personalmanagement.factory.calisan;

import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.akademikkadro.Profesor;
import com.personalmanagement.arac.Arac;

public class ProfesorFactory extends AkademikKadroFactory{
    private static final ProfesorFactory FACTORY = new ProfesorFactory();

    private ProfesorFactory(){}

    public static ProfesorFactory of(){
        return FACTORY;
    }
    @Override
    public Calisan createCalisan(String isim, String soyisim, int yas, boolean ehliyet, double asgari, Arac arac) {
        return new Profesor(isim, soyisim, yas, ehliyet, asgari, arac);
    }
}
