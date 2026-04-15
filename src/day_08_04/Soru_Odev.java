package day_08_04;

import java.util.Scanner;

public class Soru_Odev {
    /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */

    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    // adinin ilk harfi buyuk digerleri kucuk,
    // soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Iki kelime seklinde Isim ve Soyisim giriniz:");
        String isimsoyisim = scan.nextLine().trim();

       //Array ile cözüm
      String[] kelimeler=isimsoyisim.split(" ");
       for (String k:kelimeler){
           System.out.println(k);}



        //Substring ile yapalim, ilk bosluga kadar al
        String isim = isimsoyisim.substring(0, 1).toUpperCase() +
                isimsoyisim.substring(1, isimsoyisim.indexOf(" ")).toLowerCase(); //bosluk soyadin önunde kaldi
        String soyisim = isimsoyisim.substring(isimsoyisim.indexOf(" ") + 1).toUpperCase(); //bosluk olmasin, +1 den baslattik

        String sy= isimsoyisim.substring(isimsoyisim.indexOf(" ") + 1,isimsoyisim.indexOf(" ")+2 ).toUpperCase()+
                isimsoyisim.substring(isimsoyisim.indexOf(" ")+2).toLowerCase() ;

       // String soyisim1= isimsoyisim.substring(isimsoyisim.indexOf(" ")); oldugu gibi
      //  System.out.println(isim);
       // System.out.println(soyisim);
       System.out.println("Isim: " + isim + "\nSoyisim: " + soyisim +"\nSY: "+ sy); //tek satirda aldik

        //Substring metodu üzerinde islem yapilan stringin
        // bir parcasini bize geri döndürür. iki farkli olanak sunar.
        //1- Tek int parametre ister ve belirtilen indexten Stringin sonuna kadar size geri döndürür
        //2- iki tane int parametre ister, ilk int parametre baslangic indexini isaret eder,
        //ve o indexi de dahil ederek verilen ikinci indexe kadar olan Stringi döndürür,
        //ikinci indexteki karakter dahil degildir.








    }
}
