import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*
        byte abc = 123;



        System.out.println("BYTE DEGERİ = " + abc);


        short ShortDegeri = 12345;

        System.out.println("ShortDegeri = " + ShortDegeri);

        int intdegeri = 112233;

        System.out.println("İntDegeri = " + intdegeri);

        long longdegeri = 9999;

        System.out.println("Longdegeri = " + longdegeri);

        double sayi1 = 34.233;

        System.out.println("Sayi1 icin = " + sayi1);

        char karakter = 1223;
        char karakter2 = 'u';

        System.out.println(karakter2);
        boolean mantik = true ;
        boolean mantik2 = false;
        System.out.println(mantik2);
        System.out.println(mantik);
        */
       // char a = 'm';
        /*
        System.out.println(a);

        String str = "hello world ";
        System.out.println(str);
        String metin =
            */

        /*
        int a

        */
/*
        //NOT ORTALAMASİ YAPAN PROGRAM.
        int quiz, vize,ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Quiz Notunu Giriniz :  ");
        quiz = input.nextInt();
        System.out.println("vize notunu girin");
        vize = input.nextInt();
        System.out.println("ffinal sonutu giriniz.");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
            System.out.println("Ortalama = " + ortalama);

            String sonuc = (ortalama >= 50) ? "Geçtiniz" : "kaldınız";

            System.out.println(sonuc);
*/
          /*  double tutar, kdvfiyat,kdv;
            kdv = 0.18;

            Scanner input = new Scanner(System.in);
            System.out.println("Ürün Tutarını Girin : ");
            tutar = input.nextDouble();
            //tutar = kdvfiyat - tutar*0.18;
            //System.out.println("Ürün");
            kdvfiyat = tutar + (tutar * kdv);
            System.out.println("Ürünün Kdv dfiyatı : " + kdvfiyat);
*/
       /* double pi, r, dairealan, hacim, uzunluk, secim;
        pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi islemi yapmak istiyorsunuz. \n 1.) Alan \n 2.) Cevre \n 3.) Hacmi \n 4.) Hepsini yapsin");
        secim = input.nextDouble();
        System.out.println("Dairenin Yaricapini girin : ");
        r = input.nextDouble();
        dairealan = r*r*pi;
        hacim = 2*pi*r*r;
        uzunluk = 2*pi*r;
        if( secim ==1) {

            System.out.println("Dairenin Alani " + dairealan);


        }else if (secim ==2 ){
            System.out.println("Dairenin Cevresi " + uzunluk);

        } else if (secim == 3) {
            System.out.println("Dairenin Hacimi " + hacim);

        } else if (secim ==4 ) {

            System.out.println("Dairenin Alani " + dairealan);
            System.out.println("Dairenin Cevresi " + uzunluk);
            System.out.println("Dairenin Hacimi " + hacim);

        }
*/


         //k_adi,parola;
        //
        //String scan = new Scanner(System.in);
        /*Scanner scan = new Scanner(System.in);
        String Username,Sifre;
        System.out.println("Enter your Username ");
        Username = scan.nextLine();
        System.out.print("Enter your password");
        Sifre = scan.nextLine();

        if (Username.equals("1234")&& Sifre("12345"))
        {
            System.out.println("Login to the system successful ");


        }else{
            System.out.println("your Username or Password incorrect ");

        }
*/
        Scanner scan = new Scanner(System.in);
        String Username, password;
        System.out.println("Please Username enter");
        Username = scan.nextLine();
        System.out.println("Please Password enter");
        password = scan.nextLine();

        if (Username.equals("edward") && password.equals("1234")){

            System.out.println("Login successful ");


        }else{
            System.out.println("Username or Password is incorrect");
        }





    }
}