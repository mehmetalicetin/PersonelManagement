import com.personalmanagement.akademikkadro.*;
import com.personalmanagement.arac.*;

import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        final int ASGARI = 15;

        Arac bisiklet = new Bisiklet("Socci", "AR10", 2, 0);
        Arac scoother = new Scoother("Honda", "PCX", 2, 150);
        Arac motorsiklet = new Motorsiklet("Yamaha", "R25", 2, 250);
        Arac otomobil = new Otomobil("Toyota", "Carolla", 4, 900);

        List<Arac> araclar = List.of(bisiklet, scoother, motorsiklet, otomobil);

        System.out.println("----------------Calisanlar----------------------");
        Calisan arastirmaGorevlisi = getArastirmaGorevlisi(ASGARI, araclar);
        Calisan ogretimUyesi = getOgretimUyesi(arastirmaGorevlisi, araclar);
        Calisan docent = getDocent(ogretimUyesi, araclar);
        Calisan prof = getProf(docent, araclar);
        Calisan prof2 = getProf2(docent, araclar);

        List<Calisan> calisanlar = List.of(arastirmaGorevlisi, ogretimUyesi, docent, prof, prof2);

        showCalisanlar(calisanlar);
        showAraclar(araclar);


    }

    private static void showCalisanlar(List<Calisan> calisanlar) {
        System.out.println("-----------------Tum Calisanlar Goster------------------");
        for (Calisan calisan : calisanlar)
            System.out.println(calisan);
    }

    private static void checkAkademisyen(Calisan calisan) {
        if (calisan.isAkademisyen()) {
            System.out.println("Calisan bir akademisyendir.");
        }
    }

    private static Calisan getProf(Calisan calisan, List<Arac> araclar) {
        Calisan prof = new Profesor("Zeynep", "Durak", 58, true, calisan.maas(), getRandomArac(araclar));
        checkAkademisyen(prof);
        return prof;
    }

    private static Calisan getProf2(Calisan calisan, List<Arac> araclar) {
        Calisan prof = new Profesor("Hülya", "Cengiz", 51, false, calisan.maas(), getRandomArac(araclar));
        checkAkademisyen(prof);
        return prof;
    }

    private static Calisan getDocent(Calisan calisan, List<Arac> araclar) {
        Calisan docent = new Docent("Elif", "Yaman", 48, false, calisan.maas(), getRandomArac(araclar));
        checkAkademisyen(docent);
        return docent;
    }

    private static Calisan getOgretimUyesi(Calisan calisan, List<Arac> araclar) {
        Calisan ogretimUyesi = new OgretimUyesi("Mehmet", "Er", 38, false, calisan.maas(), getRandomArac(araclar));
        checkAkademisyen(ogretimUyesi);
        return ogretimUyesi;
    }

    private static Calisan getArastirmaGorevlisi(int ASGARI, List<Arac> araclar) {
        Calisan arastirmaGorevlisi = new ArastirmaGorevlisi("Ali", "Can", 28, true, ASGARI, getRandomArac(araclar));
        checkAkademisyen(arastirmaGorevlisi);
        return arastirmaGorevlisi;
    }

    private static void showAraclar(List<Arac> araclar) {
        System.out.println("-----------------Tum Araclar Goster------------------");
        for (Arac arac : araclar)
            System.out.println(arac);
    }

    private static Arac getRandomArac(List<Arac> araclar) {
        Random r = new Random();
        int i = r.nextInt(araclar.size());
        return araclar.get(i);
    }
}