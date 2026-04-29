package day_29_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {
    Map<Integer,Urun> urunler=new HashMap<>();
    Scanner scan=new Scanner(System.in);

    double tutar;

    ArrayList<String>sepet=new ArrayList<>();

    //ürünlerimizi tek bir yerde tanimliyoruz
    public void urunleriTanimlama(){
        Urun urun1=new Urun("PORTAKALLI KURABIYE",35.0);
        Urun urun2=new Urun("ELMALI KURABIYE",40.0);
        Urun urun3=new Urun("VANILYALI KURABIYE",20.0);
        Urun urun4=new Urun("UN KURABIYESI",30.0);
        Urun urun5=new Urun("CIKOLATALI KURABIYE",55.0);

        urunler.put(1001,urun1);
        urunler.put(1112,urun2);
        urunler.put(1003,urun3);
        urunler.put(1000,urun4);
        urunler.put(1016,urun5);
    }

    public void urunListeleme(){
        System.out.println("\n***********GÜNCEL ÜRÜN LISTESI*********");
        for (Integer herBirKod:urunler.keySet()){//herbir ürün kodu mapten bir kodlar seti olarak gelsin
            Urun urun=urunler.get(herBirKod);//o anki koda karsilik gelen urun objesini Mapten cekiyoruz

            System.out.println("KOD: "+herBirKod+
                    " | URUN: "+urun.getUrunAdi() +
                    " |FIYAT: "+urun.getUrunFiyati()+ "TL"
                    );
        }
        System.out.println("*******************************************\n");
    }

    public void alisveris(){

        try {
            System.out.println("ürün kodunu giriniz: ");
            int urunKodu=scan.nextInt();
            System.out.println("Almak istediginiz urun miktarini giriniz");
            double miktar=scan.nextDouble();
            tutar+=miktar*urunler.get(urunKodu).getUrunFiyati();

            System.out.println(urunKodu+" kodlu "+ urunler.get(urunKodu).getUrunAdi()+" ürününden "
                    + miktar+ " aliyorsunuz ");

            String sepeturunu= urunKodu+" kodlu "+
                    urunler.get(urunKodu).getUrunAdi()+ " urunu"+miktar+" kilogram sepette bekliyor";

            sepet.add(sepeturunu);
        }catch (NullPointerException e){
            System.out.println("Urun kodunu yanlis girdiniz");
            alisveris();
        }
    }

    public void sepetiGoster(){
        if (sepet.isEmpty()){
            System.out.println("Sepetiniz bos, henüz alisveris yapmadiniz");
        }else {
            System.out.println("**********Sepetinizdeki ürünler*****************");
            for (String sepeturunu:sepet){
                System.out.println("*"+sepeturunu);
            }
            System.out.println("Sepetnizdeki ürünlerin toplam tutari: "+tutar);
        }
    }

    void odeme() {
        System.out.println("ÖDENECEK TUTAR= " + tutar);
        double nakit = 0;
        do {
            System.out.print("NAKİT MİKTARI GİRİNİZ= ");
            nakit += scan.nextDouble();

            if (nakit < tutar) {
                System.out.println("GİRİLEN MİKTAR YETERSİZ\n" +
                        (tutar - nakit) + " TL DAHA ÖDEME YAPMALISINIZ....");
            }
        } while (nakit < tutar);

        double paraUstu = nakit - tutar;
        if (paraUstu > 0) {
            System.out.println("PARA ÜSTÜ= " + paraUstu + "\n" + " TESEKKÜR EDER, YİNE BEKLERİZ....");
            System.exit(0);
        } else {
            System.out.println("Afiyet olsun, YİNE BEKLERİZ....");
            System.exit(0);
        }
    }

}
