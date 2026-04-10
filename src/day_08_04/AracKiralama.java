package day_08_04;

public class AracKiralama {
    /*
    Bir araç kiralama ofisinde çalışıyorsunuz. Müşterinin seçimine göre toplam maliyeti ve kiralama uygunluğunu hesaplayan bir program yazacaksınız.

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
}
