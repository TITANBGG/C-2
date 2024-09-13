import java.util.Scanner;

 public class ogrenci {
    // 10 kişilik öğrenci grubnu bağlı liste oluşturacağız.

    String ad,soyad,no;
    //int veri;
    ogrenci next;


    ogrenci yedek;
    ogrenci.bir= new ogrenci();

    yedek bir;
    bir.next=null;
    for(int i=0;i<9;i++){
        bir.next=new ogrenci();
        bir.next.next=null;
        bir=bir.next;}
    bir = yedek;


}

