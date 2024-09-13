import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //str.length() : Girilen karakterin sayısını döndürür
        //str.concat(str2) : String birleştirme
        //str indexOf('k') karakterin konumunu verir
        //str.charAt(S) : indexOf metotuna benzer şekilde bu sefer de konumu verilen karakteri okur
        // str.compareTo("kodlama"): büyük küçük harf duyarlı biçimde karşılaştırır.
        // str.compareToIgnoreCase("KODlama") : büyük küçük harfe duyarlı olmadan karşılaştırır.
        // str.contains("kod") : girilen değer string içinde geçiyor mu diye kontrol eder.
        //str.endsWith("a") :  belirtilen karakter(ler) ile bitiyorsa true değerini girin döndürür
        //str.replace("kodlama" , "vakti") : string değiştirme için kullanılır
        //str.tolowerCase(), str.toUpperCase();

       // char[] str = {'k','o','l','a','m','a'};
        //String metin = new String(str);
        //System.out.println(metin);

        String metin = "CODDİNG WİTH ";
        String metin2 = "ANER";
        System.out.println(metin.length() + metin2.length());
        System.out.println(metin + metin2);
        System.out.println(metin.concat(metin2));
        System.out.println(metin.indexOf('A'));
        System.out.println(metin.charAt(10));
        System.out.println(metin.endsWith("MA"));
        System.out.println(metin.replace("With" , "ANER"));
        System.out.println(metin.toLowerCase());







    }
}