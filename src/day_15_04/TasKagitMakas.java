package day_15_04;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int kullanici = 0;
        int bilgisayar = 0;

        int kullanicininSecimi = 0;
        int bilgisayarinSecimi = 0;

        do {
            System.out.println("Oyuna hazir misin" + "Secimini yap;\n\t Tas icin 1'e \n\t Kagit icin 2'ye \n\t Makas icin 3'e \n\t basiniz ");
            kullanicininSecimi = scan.nextInt();
            bilgisayarinSecimi = random.nextInt(3) + 1;

            if (kullanicininSecimi == 1 && bilgisayarinSecimi == 2) {
                System.out.println("Kagit tasi sarar ===> Computer +1 ");
                bilgisayar++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else if (kullanicininSecimi == 1 && bilgisayarinSecimi == 3) {
                System.out.println("Tas makasi kirar ===> User +1");
                kullanici++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else if (kullanicininSecimi == 2 && bilgisayarinSecimi == 1) {
                System.out.println("Kagit tasi sarar ===> User +1 ");
                kullanici++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else if (kullanicininSecimi == 2 && bilgisayarinSecimi == 3) {
                System.out.println("Makas kagidi keser ===> Computer +1 ");
                bilgisayar++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else if (kullanicininSecimi == 3 && bilgisayarinSecimi == 2) {
                System.out.println("Makas kagidi keser ===> User +1 ");
                kullanici++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else if (kullanicininSecimi == 3 && bilgisayarinSecimi == 1) {
                System.out.println("Tas makasi kirar ===> Computer +1 ");
                bilgisayar++;
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);
            } else {
                System.out.println("Berabere kaldiniz!!");
                System.out.println("User = " + kullanici + " | Computer = " + bilgisayar);

            }
        }
            while (kullanici != 5 && bilgisayar != 5) ;
            {
                if (kullanici > bilgisayar) {
                    System.out.println("Kullanici kazandi, tebrik ederiz!!!");
                } else {
                    System.out.println("Bilgisayar kazandi!!!!");
                }


            }




    }
}
