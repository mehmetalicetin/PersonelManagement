package com.personalmanagement.factory.arac;

import com.personalmanagement.arac.Arac;
import com.personalmanagement.arac.Motorsiklet;
import com.personalmanagement.arac.Otomobil;

import java.util.List;

public class OtomobilFactory extends AracFactory{
    private static final OtomobilFactory FACTORY = new OtomobilFactory();

    private OtomobilFactory(){}
    public static OtomobilFactory of(){
        return FACTORY;
    }
    @Override
    public Arac createArac(String marka, String model, int tekerlek, int motorGucu) {
        return new Otomobil(marka, model, tekerlek, motorGucu);
    }
}
