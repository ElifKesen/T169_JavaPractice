package day_22_04;

import java.util.Scanner;

public class SicaklikGirisi_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double maxSicaklik=Double.MIN_VALUE;
        double minSicaklik=Double.MAX_VALUE;


        System.out.println("Sicaklik degerlerini tek tek giriniz, veri girisini sonlandirmak icin e yaziniz");
        System.out.println("---------------");

        while (true) {
            System.out.println("Bir sicaklik degeri giriniz");
            String input = scan.nextLine();

            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi. Sistemden cikiliyor");
                break;
            }else if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Gecersiz giris yaptiniz, lütfen sadece rakam ya da sonlandirmak icin e giriniz");
                continue;

            /*
                -    negatif degerdeki sayilar icin,
                ?    negatif de olabilir anlamindadir
                \\d   0-9 arasi rakamlar icin
                +    basamak kazandirmak icin
                \\.\\d+  ondalikli kisim icin
                ?  illaki ondalikli sayi olsun demiyorum, olabilir diyorum
                 */
            }

            double sicaklik=Double.parseDouble(input);
            if (sicaklik>maxSicaklik){
                maxSicaklik=sicaklik;
            }
            if (sicaklik<minSicaklik){
                minSicaklik=sicaklik;
            }
        }

        System.out.println("Günün en yüksek sicakligi: "+maxSicaklik);
        System.out.println("Günün en düsük sicakligi: "+minSicaklik);
    }
}
