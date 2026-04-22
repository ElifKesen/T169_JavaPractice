package day_22_04;

import java.util.Scanner;

public class SicaklikGirisi_03 {
    public static void main(String[] args) {
        //Bu class i acma sebebimiz: eger kullanici ondalikli sayilarda
        // nokta degil de virgül kullanirsa, ona uygun bir kod blogu yazmak.
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
            }else if (!input.matches("-?\\d+([.,]\\d+)?")) {
                // -?\d+(\\.\\d+)?    bu regex virgüllü sayilara uygun degil.
                // Hem virgül hem nokta kullanilsin istedik, o yüzden regex i degistirdik
                // Ama böyle formatta yazmak tek basina yeterli gelmez,
                // asagida 43. satirda double olarak cevirdigimiz input icin replace yapmaliyiz.
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

            double sicaklik=Double.parseDouble(input.replace(",","."));
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
