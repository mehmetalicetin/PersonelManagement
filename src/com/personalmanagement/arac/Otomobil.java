package com.personalmanagement.arac;

import java.util.List;

public class Otomobil extends Arac{
    public Otomobil(String marka, String model, int tekerlekSayisi, int motorGucu) {
        super(marka, model, tekerlekSayisi, motorGucu);
        this.yakitTuru = List.of("Motorin","LPG","Benzin");
    }

    @Override
    public String yakitTuru() {
        return getRandomYakitTuru(3);
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", tekerlekSayisi=" + tekerlekSayisi +
                ", motorGucu=" + motorGucu +
                ", yakitTuru=" + yakitTuru() +
                '}';
    }
}
