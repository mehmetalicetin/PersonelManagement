package com.personalmanagement.factory.arac;

import com.personalmanagement.arac.Arac;
import com.personalmanagement.arac.Bisiklet;

import java.util.List;

public class BisikletFactory extends AracFactory{
    private static final BisikletFactory FACTORY = new BisikletFactory();

    private BisikletFactory(){}
    public static BisikletFactory of(){
        return FACTORY;
    }
    @Override
    public Arac createArac(String marka, String model, int tekerlek, int motorGucu) {
        return new Bisiklet(marka, model, tekerlek, motorGucu);
    }
}
