public class Sona_liste_ekleme {
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

        // Sona eleman ekleme metodu
        public void sonaEkle(int yeniVeri) {
            Dugum yeniDugum = new Dugum(yeniVeri);

            // Eğer liste boşsa, yeni düğümü baş olarak ayarla
            if (this.bas == null) {
                this.bas = yeniDugum;
            } else {
                // Bağlı listenin sonuna kadar git ve yeni düğümü ekleyerek bağla
                Dugum temp = this.bas;
                while (temp.sonraki != null) {
                    temp = temp.sonraki;
                }
                temp.sonraki = yeniDugum;
            }
        }

        // Bağlı listeyi yazdırma metodu
        public void yazdir() {
            Dugum temp = this.bas;
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

            // Elemanları bağlı listeye ekle
            bagliListe.sonaEkle(10);
            bagliListe.sonaEkle(20);
            bagliListe.sonaEkle(30);

            // Bağlı listeyi yazdır
            bagliListe.yazdir();
        }
    }

}
