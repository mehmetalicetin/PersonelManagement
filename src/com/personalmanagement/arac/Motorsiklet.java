package com.personalmanagement.arac;

import com.personalmanagement.akademikkadro.AkademikKadro;
import com.personalmanagement.akademikkadro.Docent;

import java.util.List;
import java.util.Random;

public class Motorsiklet extends Arac{
    public Motorsiklet(String marka, String model, int tekerlekSayisi, int motorGucu) {
        super(marka, model, tekerlekSayisi, motorGucu);
        this.yakitTuru = List.of("Elektrik","Benzin");
    }

    @Override
    public String yakitTuru() {
        return getRandomYakitTuru(2);
    }

    @Override
    public String toString() {
        return "Motorsiklet{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", tekerlekSayisi=" + tekerlekSayisi +
                ", motorGucu=" + motorGucu +
                ", yakitTuru=" + yakitTuru() +
                '}';
    }
}
