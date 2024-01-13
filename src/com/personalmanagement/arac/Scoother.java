package com.personalmanagement.arac;

import java.util.List;

public class Scoother extends Arac{
    public Scoother(String marka, String model, int tekerlekSayisi, int motorGucu) {
        super(marka, model, tekerlekSayisi, motorGucu);
        this.yakitTuru = List.of("Elektrik");
    }

    @Override
    public String yakitTuru() {
        return getRandomYakitTuru(1);
    }

    @Override
    public String toString() {
        return "Scoother{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", tekerlekSayisi=" + tekerlekSayisi +
                ", motorGucu=" + motorGucu +
                ", yakitTuru=" + yakitTuru() +
                '}';
    }
}
