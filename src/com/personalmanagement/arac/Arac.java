package com.personalmanagement.arac;

import java.util.List;
import java.util.Random;

public abstract class Arac {
    protected String marka;
    protected String model;
    protected int tekerlekSayisi;
    protected int motorGucu;
    protected List<String> yakitTuru;

    public Arac(String marka, String model, int tekerlekSayisi, int motorGucu) {
        this.marka = marka;
        this.model = model;
        this.tekerlekSayisi = tekerlekSayisi;
        this.motorGucu = motorGucu;
    }

    public abstract String yakitTuru();


    protected String getRandomYakitTuru(int count) {
        Random r = new Random();
        int i = r.nextInt(count);
        return this.yakitTuru.get(i);
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", tekerlekSayisi=" + tekerlekSayisi +
                ", motorGucu=" + motorGucu +
                ", yakitTuru=" + yakitTuru() +
                '}';
    }
}
