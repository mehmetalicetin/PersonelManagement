package com.personalmanagement.factory.arac;

import com.personalmanagement.arac.Arac;

import java.util.List;

public abstract class AracFactory {
    public abstract Arac createArac(String marka, String model, int tekerlek, int motorGucu);
}
