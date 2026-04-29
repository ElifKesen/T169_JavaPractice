package day_22_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ödev1 {
    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // 100 girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicaklikDegerleri=new ArrayList<>();
        int sonlandirmaSayisi=100;

        System.out.println("Sicaklik degerlerini tek tek giriniz, veri girisini sonlandirmak icin 100 yaziniz");
        System.out.println("---------------");

        while (true) {
            System.out.println("Bir sicaklik degeri giriniz");
            String input = scan.nextLine();

            if (input.matches("-?\\d+([.,]\\d+)?")) {
                double girilenSicaklik=Double.parseDouble(input.replace(",","."));

                if (girilenSicaklik==sonlandirmaSayisi){
                    System.out.println("Veri girisi sonlandiriliyor");
                    break;
                }
                gununSicaklikDegerleri.add(girilenSicaklik);
            }else {
                System.out.println("Gecersiz giris yaptiniz, lütfen sadece rakam ya da sonlandirmak icin 100 giriniz");
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
