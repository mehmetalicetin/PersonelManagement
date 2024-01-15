package com.personalmanagement.factory.arac;

import com.personalmanagement.arac.Arac;
import com.personalmanagement.arac.Bisiklet;
import com.personalmanagement.arac.Motorsiklet;

import java.util.List;

public class MotorsikletFactory extends AracFactory{
    private static final MotorsikletFactory FACTORY = new MotorsikletFactory();

    private MotorsikletFactory(){}
    public static MotorsikletFactory of(){
        return FACTORY;
    }
    @Override
    public Arac createArac(String marka, String model, int tekerlek, int motorGucu) {
        return new Motorsiklet(marka, model, tekerlek, motorGucu);
    }
}
