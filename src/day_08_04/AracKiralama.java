package day_08_04;

import java.util.Scanner;

public class AracKiralama {
    /*
    Bir araç kiralama ofisinde çalışıyorsunuz. Müşterinin seçimine göre toplam maliyeti ve kiralama
    uygunluğunu hesaplayan bir program yazacaksınız.

1. Araç Seçimi (String Karşılaştırma)
Sistem şu soruyu sorsun: "Hangi segment araç istersiniz? (Ekonomik - VIP - SUV)"

String segment oluşturun. (Büyük/küçük harf duyarlılığını metodla çözün).

1. Koşul Bölümü:

Eğer Ekonomik ise: "Günlük bedel 1000 TL."
Eğer VIP ise: "Günlük bedel 3000 TL."
Eğer SUV ise: "Günlük bedel 2000 TL."
Yanlış giriş: "Hatalı seçim! Standart paket (1500 TL) tanımlandı."

2. Sürücü Yaşı ve Gün Sayısı (Sayısal Girişler)
Sistem şu soruyu sorsun: "Sürücü yaşını giriniz:"
int yas değişkeni oluşturun.

Sistem şu soruyu sorsun: "Kaç gün kiralamak istersiniz?"
int gun değişkeni oluşturun.

2. Koşul Bölümü:

Eğer yas 21'den küçükse: "Üzgünüz, yaş sınırından dolayı kiralama yapamazsınız."
(Burada sistemi sonlandırabilir veya uyarı verebilirsiniz).
Değilse: "[gun] gün için rezervasyon oluşturuluyor."

KRİTİK NOT: Bu iki sayısal girişten sonra bir String sorusu geleceği için araya dummy sc.nextLine();
koymanız şart, yoksa sistem sigorta sorusunu atlar!

3. Ek Sigorta (Boolean Mantığı)
Sistem şu soruyu sorsun: "Tam kasko ister misiniz? (Evet / Hayır):"

String sigorta oluşturun.

3. Koşul Bölümü:

Cevap Evet ise: "Günlük 200 TL sigorta bedeli eklendi."
Cevap Hayır ise: "Sigortasız devam ediliyor, kaza durumunda sorumluluk size aittir."

4. Teslim Alınacak Şehir (String Manipülasyonu)
Sistem şu soruyu sorsun: "Aracı hangi şehirden teslim alacaksınız?"

String sehir oluşturun.

4. Koşul Bölümü:

Kullanıcı ne girerse girsin, şehri tamamen büyük harflerle ("[SEHIR] Ofisimizden teslim alabilirsiniz.")
 şeklinde yazdırın.

5. Özet ve Fatura (Sonuç)
Konsola profesyonel bir fatura dökümü yapın:

Örnek Çıktı: * "SAYIN MÜŞTERİMİZ, [sehir.toUpperCase()] şubemizden [segment] aracınız [gun] günlüğüne
rezerve edilmiştir. Toplam tutar: ... TL. İyi yolculuklar!"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. ARAÇ SEGMENT SEÇİMİ
        System.out.println("Hangi segment araç istersiniz? (Ekonomik - VIP - SUV)");

        String segment = sc.nextLine();
        int toplamGunlukFiyat = 0;

        if (segment.equalsIgnoreCase("Ekonomik")) {
            toplamGunlukFiyat = 1000;
        } else if (segment.equalsIgnoreCase("VIP")) {
            toplamGunlukFiyat = 3000;
        } else if (segment.equalsIgnoreCase("SUV")) {
            toplamGunlukFiyat = 2000;
        } else {
            System.out.println("Hatalı seçim! Standart paket (1500 TL) uygulandı.");
            segment = "Standart";
            toplamGunlukFiyat = 1500;
        }

        // 2. YAŞ GİRİŞİ
        int yas = 0;
        while (true) {
            System.out.print("Lütfen sürücü yaşını giriniz: ");
            String input = sc.nextLine(); // Harf girse de hata vermesin diye bunu yazdik

            try {
                yas = Integer.parseInt(input); // Metni sayıya çeviriyoruz
                if (yas < 18 || yas > 100) {
                    System.out.println("Geçersiz yaş! (18-100 arası giriniz)");
                } else if (yas < 21) {
                    System.out.println("Üzgünüz, yaş sınırından dolayı kiralama yapamazsınız.");
                    return; // Programı kapat
                } else {
                    break; // Yaş geçerliyse döngüden çık
                }
            } catch (NumberFormatException e) {
                System.out.println("HATA: Lütfen sadece rakam kullanınız! (Örn: 25)");
            }
        }

        // 3. GÜN SAYISI GİRİŞİ
        int gun = 0;
        while (true) {
            System.out.print("Kaç gün kiralamak istersiniz? ");
            String input = sc.nextLine();

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

        // 4. SİGORTA SEÇİMİ
        System.out.println("Tam kasko ister misiniz? (Evet / Hayır)");
        String sigorta = sc.nextLine();

        if (sigorta.equalsIgnoreCase("Evet")) {
            toplamGunlukFiyat += 200;
            System.out.println("Sigorta eklendi.");
        }

        // 5. ŞEHİR SEÇİMİ
        System.out.print("Teslim alacağınız şehir: ");
        String sehir = sc.nextLine();

        // 6. FİNAL HESAPLAMA
        int toplamTutar = toplamGunlukFiyat * gun;

        System.out.println("SAYIN MÜŞTERİMİZ, " + sehir.toUpperCase() + " şubemizden " +
                segment.toUpperCase() + " aracınız " + gun +
                " günlüğüne rezerve edilmiştir.");
        System.out.println("Toplam tutar: " + toplamTutar + " TL.");
        System.out.println("İyi yolculuklar!");
    }

}
