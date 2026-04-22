package day_22_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SicaklikGirisi_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maxSicaklik = Double.MIN_VALUE;
        double minSicaklik = Double.MAX_VALUE;

        ArrayList<Double>gununSicaklikDegerleri=new ArrayList<>();


        System.out.println("Sicaklik degerlerini tek tek giriniz, veri girisini sonlandirmak icin e yaziniz");
        System.out.println("---------------");

        while (true) {
            System.out.println("Bir sicaklik degeri giriniz");
            String input = scan.nextLine();

            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi. Sistemden cikiliyor");
                break;
            } else if (input.matches("-?\\d+([.,]\\d+)?")) {
                double girilenSicaklik=Double.parseDouble(input.replace(",","."));
                gununSicaklikDegerleri.add(girilenSicaklik);

            }else {
                System.out.println("Gecersiz giris yaptiniz, lütfen sadece rakam ya da sonlandirmak icin e giriniz");
            }
        }

        if (!gununSicaklikDegerleri.isEmpty()){
            Collections.sort(gununSicaklikDegerleri);
            System.out.println("Günün en dusuk sicakligi: "+gununSicaklikDegerleri.get(0));
            System.out.println("Günün en yüksek sicaklik degeri: "+gununSicaklikDegerleri.get(gununSicaklikDegerleri.size()-1));
        }else {
            System.out.println("Liste bos");
        }

    }
}
