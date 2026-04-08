package day_08_04;

import java.util.Scanner;

public class Cay {
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsun?");
        double bardak= scan.nextDouble();

        System.out.println("Her bardak icin kac seker atiyorsun?");
        double seker= scan.nextDouble();

        if (seker==0){
            System.out.println("Aferin, boyle devam et :)");
        }
        if (seker>0){
            double yillikSekerTuketimi=(bardak*seker*2.77)*365/1000;
            double kirkYillikSekerTuketimi=yillikSekerTuketimi*40;

            System.out.println("Yillik seker tuketimi: "+yillikSekerTuketimi);
            System.out.println("Kirk yillik seker tuketimi: "+kirkYillikSekerTuketimi);

        }
//  bu cözüm sekli negatif sayisal deger ve sayi disi veriler icin gerekli uyariyi
//  yapmadigindan kullanimi uygun olmaz, yeni bir cözüm sekli gerekiyor.
    }
}
