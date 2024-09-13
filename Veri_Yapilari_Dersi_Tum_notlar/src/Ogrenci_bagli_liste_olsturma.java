public class Ogrenci_bagli_liste_olsturma {
    //10 ogrencinin oldugu bir bagli liste olusturma..
    String ad, soyad,no;
    int veri;
    Ogrenci_bagli_liste_olsturma next;

    Ogrenci_bagli_liste_olsturma yedek;
    Ogrenci_bagli_liste_olsturma bir = new Ogrenci_bagli_liste_olsturma();
    yedek bir;
    bir.next=null;
    for(int i=1;i<9;i++){
        bir.next = new Ogrenci_bagli_liste_olsturma();
        bir.next.next=null;
        bir=bir.next;

        }
    bir=yedek;
        }