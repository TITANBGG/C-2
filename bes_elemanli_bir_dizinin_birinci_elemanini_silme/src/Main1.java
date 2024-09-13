public class Main1 {
    public static void main(String[] args) {
        Dugum basDugum = new Dugum(10);
/* bağlı listede var olan elemanlar varsa eğer yeni liste vs. oluşturmaya gerke yok varsa eğer bunu direkt sonaEkle metotunu kullanıp yapabiliriz
bundan dolayı bu daha kolay ama genel olarak test etemk için bir önceki metot daha işe yarardır.
  */      // Bağlı listeye elemanlar ekleyelim
        basDugum.sonaEkle(20);
        basDugum.sonaEkle(30);
        basDugum.sonaEkle(40);
        basDugum.sonaEkle(50);
        basDugum.sonaEkle(60);
        basDugum.sonaEkle(70);
        basDugum.sonaEkle(80);
        basDugum.sonaEkle(90);
        basDugum.sonaEkle(100);
        basDugum.sonaEkle(110);
        basDugum.sonaEkle(120);
        basDugum.sonaEkle(130);
        basDugum.sonaEkle(130);
        basDugum.sonaEkle(140);
        basDugum.sonaEkle(150);
        basDugum.sonaEkle(160);
        basDugum.sonaEkle(170);

        // Bağlı listeyi yazdıralım
        Dugum temp = basDugum;
        while (temp != null) {
            System.out.print(temp.veri + " ");
            temp = temp.sonraki;
        }
        // Çıktı: 10 20 30
    }
}