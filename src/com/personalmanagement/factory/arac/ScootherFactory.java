package com.personalmanagement.factory.arac;

import com.personalmanagement.arac.Arac;
import com.personalmanagement.arac.Motorsiklet;
import com.personalmanagement.arac.Scoother;

import java.util.List;

public class ScootherFactory extends AracFactory{
    private static final ScootherFactory FACTORY = new ScootherFactory();

    private ScootherFactory(){}
    public static ScootherFactory of(){
        return FACTORY;
    }
    @Override
    public Arac createArac(String marka, String model, int tekerlek, int motorGucu) {
        return new Scoother(marka, model, tekerlek, motorGucu);
    }
}
