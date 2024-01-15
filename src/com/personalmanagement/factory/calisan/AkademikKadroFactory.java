package com.personalmanagement.factory.calisan;

import com.personalmanagement.akademikkadro.Calisan;
import com.personalmanagement.arac.Arac;

public abstract class AkademikKadroFactory {
    public abstract Calisan createCalisan(String isim, String soyisim, int yas, boolean ehliyet, double asgari, Arac arac);
}
