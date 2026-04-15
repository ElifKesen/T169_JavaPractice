package day_15_04;

import java.util.Scanner;

public class Kelime_IsimAyirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Iki kelime seklinde Isim ve Soyisim giriniz:");
            String isimsoyisim = scan.nextLine().trim();

            if (isimsoyisim.contains(" ")){
                String isim = isimsoyisim.substring(0, 1).toUpperCase() +
                        isimsoyisim.substring(1, isimsoyisim.indexOf(" ")).toLowerCase(); //bosluk soyadin önunde kaldi
                String soyisim = isimsoyisim.substring(isimsoyisim.indexOf(" ") + 1).toUpperCase();
                System.out.println("Isim: " + isim + "\nSoyisim: " + soyisim );
                break;
            }else {
                //tek kelime olarak girilmisse burasi calisacak
                System.out.println("isim soyisim arasinda bosluk olmalidir. Lütfen ayri ayri yaziniz");
            }


        }
    }

}
