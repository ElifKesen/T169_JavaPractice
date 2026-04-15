package day_15_04;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasSon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int kullaniciPuani = 0;
        int bilgisayarPuani = 0;

        System.out.println("--- TAŞ KAĞIT MAKAS OYUNUNA HOŞGELDİNİZ ---");
        System.out.println("Kural: 5 puana ulaşan oyunu kazanır!");

        while (kullaniciPuani < 5 && bilgisayarPuani < 5) {
            int kullanicininSecimi = 0;

            while (true) {
                System.out.println("\nSeçiminizi yapın: [1: Taş] [2: Kağıt] [3: Makas]");
                String input = scan.nextLine(); // Harf girilirse çökmemesi için String aldık
                try {
                    kullanicininSecimi = Integer.parseInt(input);
                    if (kullanicininSecimi >= 1 && kullanicininSecimi <= 3) {
                        break;
                    } else {
                        System.out.println("HATA: Lütfen sadece 1, 2 veya 3 yazınız!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("HATA: Geçersiz karakter! Lütfen rakam giriniz.");
                }
            }

            int bilgisayarinSecimi = random.nextInt(3) + 1; // 1, 2 veya 3 üretir



            // OYUN
            if (kullanicininSecimi == bilgisayarinSecimi) {
                System.out.println("Berabere!");
            } // SİZ TAŞ SEÇERSENİZ
            else if (kullanicininSecimi == 1) {
                if (bilgisayarinSecimi == 3) {
                    System.out.println("Taş makası kırar! ===> User +1");
                    kullaniciPuani++;
                } else { // Bilgisayar Kağıt seçmiş demektir
                    System.out.println("Kağıt taşı sarar! ===> Computer +1 ");
                    bilgisayarPuani++;
                }
            }
            // SİZ KAĞIT SEÇERSENİZ
            else if (kullanicininSecimi == 2) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Kağıt taşı sarar! ===> User +1");
                    kullaniciPuani++;
                } else { // Bilgisayar Makas seçmiş demektir
                    System.out.println("Makas kağıdı keser! ===> Computer +1");
                    bilgisayarPuani++;
                }
            }
            // SİZ MAKAS SEÇERSENİZ
            else if (kullanicininSecimi == 3) {
                if (bilgisayarinSecimi == 2) {
                    System.out.println("Makas kağıdı keser! ===> User +1");
                    kullaniciPuani++;
                } else { // Bilgisayar Taş seçmiş demektir
                    System.out.println("Taş makası kırar! ===> Computer +1");
                    bilgisayarPuani++;
                }
            }

            System.out.println("SKOR -> Kullanici: " + kullaniciPuani + " | Bilgisayar: " + bilgisayarPuani);
        }


        // --- OYUN SONU ---
        System.out.println("\n==============================");
        if (kullaniciPuani == 5) {
            System.out.println("TEBRİKLER, OYUNUN GALİBİ SİZSİNİZ!");
        } else {
            System.out.println("ÜZGÜNÜM, BİLGİSAYAR KAZANDI :(");
        }
        System.out.println("==============================");
    }
}
