package com.personalmanagement.arac;

import java.util.List;

public class Bisiklet extends Arac{
    public Bisiklet(String marka, String model, int tekerlekSayisi, int motorGucu) {
        super(marka, model, tekerlekSayisi, motorGucu);
        this.yakitTuru = List.of();
    }

    @Override
    public String yakitTuru() {
        return "";
    }

    @Override
    public String toString() {
        return "Bisiklet{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", tekerlekSayisi=" + tekerlekSayisi +
                ", motorGucu=" + motorGucu +
                ", yakitTuru=" + yakitTuru() +
                '}';
    }
}
