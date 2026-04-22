package day_22_04;

import java.util.Scanner;

public class SicaklikGirisi_01 {
    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // "e" girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //hem pozitif hem negatif sayilar olabileceginden Javanin bu fonksiyonunu kullandik
        double maxSicaklik=Double.MIN_VALUE;
        double minSicaklik=Double.MAX_VALUE;

        System.out.println("Sicaklik degerlerini tek tek giriniz, veri girisini sonlandirmak icin e yaziniz");

        while (true) {
            System.out.println("Bir sicaklik degeri giriniz");
            String input = scan.nextLine();
            input=input.replace(",","."); //virgülü noktaya cevirmek icin yazdik bu satiri.
            // Cünkü java virgülü asagida veri Double oldugunda okuyamaz

            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi. Sistemden cikiliyor");
                break;
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
