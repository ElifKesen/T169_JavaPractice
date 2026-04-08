package day_08_04;

import java.util.Scanner;

public class Cay_While {
    /*
    Kullaniciya
            * 1 = Gunde kac bardak cay ictigini,
            * 2 = Her bardak icin kac kup seker kullandigini sorup;
    kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
            * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
            (1 kup seker = 2.77 gr)
            */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsun?");

        while (!scan.hasNextDouble()) {//eger girilen deger sayi degilse
            System.out.println("Lütfen sadece sayisal deger giriniz");
            scan.next(); //yummy kod, bos kod (string degerden sonra int girmeden önce, stringin izini temizlemek icin bunu yaziyoruz
        }

        double bardak = scan.nextDouble();
        while (bardak <= 0) {
            System.out.println(" Yanlis veri girdiniz, pozitif deger girmelisiniz \n Gunde kac bardak cay iciyorsun?");
            while (!scan.hasNextDouble()) {
                System.out.println("Sayi girmen gerekiyor");
                scan.next();
            }
            bardak = scan.nextDouble();
        }

        System.out.println("Her bardak icin kac seker atiyorsun?");

        while (!scan.hasNextDouble()) {//eger girilen deger sayi degilse
            System.out.println("Lütfen sadece sayisal deger giriniz");
            scan.next();
        }

        double seker = scan.nextDouble();
        while (seker < 0) {
            System.out.println("Yanlis veri girdiniz, pozitif sayi olmali");
            while (!scan.hasNextDouble()) {
                System.out.println("Hatali giris yaptiniz, sayi girin lütfen!");
                scan.next();
            }
            seker = scan.nextDouble();
        }

        if (seker == 0) {
            System.out.println("Aferin böyle devam et :)");
        } else {
            double yillikSekerTuketimi = (bardak * seker * 2.77) * 365 / 1000;
            double kirkYillikSekerTuketimi = yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketimi: " + yillikSekerTuketimi);
            System.out.println("Kirk yillik seker tuketimi: " + kirkYillikSekerTuketimi);

        }
    }
}
