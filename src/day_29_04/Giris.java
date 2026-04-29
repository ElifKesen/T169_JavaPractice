package day_29_04;

import java.util.Scanner;

public class Giris extends Islemler{

    void menu() {
        Scanner scan = new Scanner(System.in);
        urunleriTanimlama(); //program baslarken urunleri bir kez yüklüyoruz

        System.out.println("*********** T169 Kurabiye Dünyasina hosgeldiniz!!!!***********");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.println("\n-----------ISLEMLER------------");
            System.out.println("Yapmak istediginiz islemin numarasini yaziniz\n");
            System.out.println("1-Urun Listeleme,\n2-Alisveris\n3-Sepete Git\n4-Odeme\nProgramdan cikmak icin q giriniz");
            System.out.println("Seciminiz: ");

            try {

            String input = scan.nextLine();//q kabul edebilmek icin inputu String aldik
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Sistemden cikiliyor");
                System.exit(0);
            } else {
                int secim = Integer.parseInt(input);

                switch (secim) {
                    case 1://urunlisteleme
                        urunListeleme();
                        break;//bu islem biter ve switch ten cikar, while in basina gider
                    case 2://alisveris
                        alisveris();
                        break;
                    case 3://sepet
                        sepetiGoster();
                        break;
                    case 4://odeme
                        odeme();
                        break;
                    default:
                        System.out.println("hatali giris yaptiniz, sadece 1-4 arasi rakam girmelisiniz");
                        break;
                }
            }

            }catch (NumberFormatException e){
                System.out.println("GECERSIZ GIRIS YAPTINIZ! Lütfen sadece bir rakam veya q giriniz");
            }

        }
    }

}
