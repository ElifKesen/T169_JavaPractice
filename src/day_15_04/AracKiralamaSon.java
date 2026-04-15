package day_15_04;

import java.util.Scanner;

public class AracKiralamaSon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("----T169 ARAC KIRALAMA HIZMETLERI----"+"\nHOSGELDINIZ");

        int yas=0;

        while (true) {
            System.out.println("Lütfen yasinizi giriniz");
            String input = scan.nextLine(); // Harf girse de hata vermesin diye bunu yazdik

            try {
                yas = Integer.parseInt(input);
                if (yas < 21) {
                    System.out.println("Üzgünüz, 21 yaş altı kiralama politikamız gereği işlem yapamazsınız.");
                } else if (yas > 100) {
                    System.out.println("Lütfen gecerli bir yas giriniz");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Yaşınızı sadece rakamla giriniz (Örn: 25)");
            }
        }
           //arac Secimi
        System.out.println("Hangi segment araç istersiniz? (Ekonomik - VIP - SUV)");
        System.out.println("1. Ekonomik (1000 TL)\n2. VIP (3000 TL)\n3. SUV (2000 TL)");

        System.out.println("Seciminizi yaziniz:");

        int gunlukUcret=0;

        String segment= scan.nextLine();

        if (segment.equalsIgnoreCase("Ekonomik")){
            gunlukUcret=1000;

        } else if (segment.equalsIgnoreCase("VIP")) {
            gunlukUcret=3000;

        } else if (segment.equalsIgnoreCase("SUV")) {
            gunlukUcret=2000;

        } else {
            System.out.println("Hatalı seçim! Standart paket (1500 TL) uygulandı.");
            segment = "Standart";
            gunlukUcret = 1500;
        }

            //gun belirleme
        int gun = 0;
        while (true) {
            System.out.print("Kaç gün kiralamak istersiniz? ");
            String input = scan.nextLine();

            try {
                gun = Integer.parseInt(input);
                if (gun <= 0) {
                    System.out.println("En az 1 gün girmelisiniz.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("HATA: Gün sayısını rakamla giriniz!");
            }
        }

        //Sigorta
        scan.nextLine();
        String sigorta="";
        while (true) {
            System.out.println("Tam kasko ister misiniz? (Evet / Hayır seklinde cevap veriniz): ");
            sigorta = scan.nextLine();

            if (sigorta.equalsIgnoreCase("Evet")) {
                gunlukUcret += 200;
                System.out.println("Kasko poliçenize eklendi.");
                break;

            } else if (sigorta.equalsIgnoreCase("Hayir")) {
                System.out.println("Sigorta olmadan devam ediliyor");
                break;

            } else {
                //e vaya h seklinde bir harf olarak girerse
                System.out.println("Lütfen sadece 'Evet' veya 'Hayır' yazınız." + sigorta + " gecerli cevap degildir");
            }
        }

            //sehir

            System.out.println("Aracı hangi şehirden teslim alacaksınız?");
            String sehir=scan.nextLine();

            System.out.println(sehir.toUpperCase()+"  dan araci teslim alabilirsiniz ");

            // sonuc
            int toplamTutar = gunlukUcret * gun;

            System.out.println("SAYIN MÜŞTERİMİZ, " + sehir.toUpperCase() + " şubemizden " +
                    segment.toUpperCase() + " aracınız " + gun +
                    " günlüğüne rezerve edilmiştir.");
            System.out.println("Toplam tutar: " + toplamTutar + " TL.");
            System.out.println("İyi yolculuklar!");

        }

    }

