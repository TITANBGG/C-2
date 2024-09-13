public class baglilisteyibasaekleme {
    class Dugum {
        int veri;
        Dugum sonraki;

        public Dugum(int veri) {
            this.veri = veri;
            this.sonraki = null;
        }
    }

    class BagliListe {
        Dugum bas;

        public BagliListe() {
            this.bas = null;
        }

        // Başa eleman ekleme metodu
        public void basaEkle(int yeniVeri) {
            // Yeni bir düğüm oluştur
            Dugum yeniDugum = new Dugum(yeniVeri);

            // Yeni düğümü mevcut listenin başına ekle
            yeniDugum.sonraki = bas;
            bas = yeniDugum;
        }

        // Bağlı listeyi yazdırma metodu
        public void yazdir() {
            Dugum temp = bas;
            while (temp != null) {
                System.out.print(temp.veri + " ");
                temp = temp.sonraki;
            }
            System.out.println();
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Bağlı liste oluştur
            BagliListe bagliListe = new BagliListe();

            // Elemanları listenin başına ekle
            bagliListe.basaEkle(30);
            bagliListe.basaEkle(20);
            bagliListe.basaEkle(10);

            // Bağlı listeyi yazdır
            bagliListe.yazdir();
        }
    }

}
