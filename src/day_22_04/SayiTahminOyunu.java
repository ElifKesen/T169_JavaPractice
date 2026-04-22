package day_22_04;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        /* BILGISAYAR 0-100 ARASINDA BIR SAYI TUTUP, KULLANICIDAN TAHMIN ISTER
     ve KULLANICI SAYIYI BULANA KADAR "DAHA KUCUK VEYA DAHA BUYUK SAYI SÖYLE" DIYE YOL GOSTERIR
     BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
     */

        System.out.println("0 ile 100 arasinda bir sayi tuttum, hadi hangi sayiyi tuttugumu tahmin edin! :)");
        Random random =new Random();
        int bilgisayarinSayisi= random.nextInt(101);

        Scanner scan= new Scanner(System.in);
        int kullanicininSayisi=0;

        int count=1;

        do {
            if (count==1){
                System.out.println(" Sayiyi tuttum, hadi baslayalim");
            } else if (bilgisayarinSayisi<kullanicininSayisi) {
                System.out.println("Daha kücük sayi tahmin etmelisiniz");
            }else {
                System.out.println("Daha büyük sayi tahmin etmelisiniz");
            }
           // kullanicininSayisi=scan.nextInt();

            while (true){
                System.out.println("Tahmininizi yazin");
                String input= scan.nextLine(); //Sayiyi String aliyoruz cünkü, kullanici harf girebilir,
                // hata vermemesi icin buna ihtiyac var
                try {
                    kullanicininSayisi=Integer.parseInt(input);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Sadece rakam girmelisiniz");
                }
            }

            if (bilgisayarinSayisi==kullanicininSayisi){
                System.out.println("Tebrikler!!!!  "+count+ " . tahminde bildiniz!!!");
            }else {
                System.out.println("Denemeye devam etmelisiniz");
            }
            count++;



        }while (kullanicininSayisi!=bilgisayarinSayisi);

    }
}
