public class ortasina_liste_ekleme {
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

        // Ortaya eleman ekleme metodu
        public void ortayaEkle(int yeniVeri, int konum) {
            // Yeni bir düğüm oluştur
            Dugum yeniDugum = new Dugum(yeniVeri);

            // Konum 1 ise veya bağlı liste boşsa, başa ekleme yap
            if (konum <= 1 || bas == null) {
                yeniDugum.sonraki = bas;
                bas = yeniDugum;
                return;
            }

            // İstenen konuma ulaşana kadar liste üzerinde gez
            Dugum temp = bas;
            for (int i = 1; i < konum - 1 && temp.sonraki != null; i++) {
                temp = temp.sonraki;
            }

            // Yeni düğümü uygun konuma ekleyerek bağla
            yeniDugum.sonraki = temp.sonraki;
            temp.sonraki = yeniDugum;
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

            // Elemanları liste ortasına ekle
            bagliListe.ortayaEkle(20, 1);
            bagliListe.ortayaEkle(30, 2);
            bagliListe.ortayaEkle(40, 2);

            // Bağlı listeyi yazdır
            bagliListe.yazdir();
        }
    }

}
/*Bu örnekte, ortayaEkle metodunu kullanarak 20, 30 ve 40 değerlerini sırasıyla 1., 2. ve 2. konumlara ekledik. Şimdi bu işlemi adım adım açıklayalım:

20'yi 1. konuma ekleme:

ortayaEkle(20, 1) ifadesiyle yeni bir düğüm oluşturulur ve bu düğüm listenin başına eklenir.
30'u 2. konuma ekleme:

ortayaEkle(30, 2) ifadesiyle 2. konuma gitmek için liste üzerinde gezilir, ardından yeni düğüm uygun konuma eklenir.
40'ı 2. konuma ekleme:

ortayaEkle(40, 2) ifadesiyle yine 2. konuma gitmek için liste üzerinde gezilir, ardından yeni düğüm uygun konuma eklenir.
Sonuç olarak, bağlı listemiz şu şekilde olacaktır: 20 40 30

*/


