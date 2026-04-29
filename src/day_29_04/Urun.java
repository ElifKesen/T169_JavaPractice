package day_29_04;

public class Urun {
     /*
* Kurabiye satis programi yaziniz.
   - Urun icin adi ve fiyat field lari olustur
   - Urun listesini olusturun. ürünün  kodu, adi ve fiyati görünmelidir.
   - Programda; listeleme, ürün secip sepete atma ve satin alma islemleri olsun
   - Müsteriye ürün kodunu ve satin almak istedigi kiloyu sorun.
   - Baska bir urun almak isteyip istemedigini sorun. Istemiyorsa toplam ödenecek miktari yazdirin,
        istiyorsa tekrar urun sectirin. Bu islemi alisverisi bitirmek isteyene kadar tekrarlatin.
   - Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekleyin.
   - Alisveris bitince toplam odemesi gereken tutari gosterin ve nakit girisini rakam olarak isteyin.
   - Ödeme sirasinda gerekiyorsa Para üstü verin
   - q ya basarak Programi sonlandirin
 */
    String urunAdi;
    Double urunFiyati;

    public Urun(String urunAdi, Double urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public Double getUrunFiyati() {
        return urunFiyati;
    }
}
