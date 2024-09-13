public class listenin_ortasina_eleman_ekleyen {
    /*listenin ortasına eleman ekleyeni yap ve anlat, tek tek anlat ki anayayım
ChatGPT
Bağlı listeye ortaya bir eleman eklemek için, önce yeni bir düğüm (node) oluşturmalısınız ve ardından bu düğümü uygun konuma eklemelisiniz. İşte bu işlemi gerçekleştiren bir örnek:
   */
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
/*Bu örnekte, ortayaEkle metodu kullanılarak yeni bir düğüm oluşturulur ve bu düğüm, belirtilen konuma (konum) eklenir. Eğer konum 1 veya liste boşsa, düğüm listenin başına eklenir. Aksi takdirde, listenin istenen konumuna kadar gidilir ve yeni düğüm uygun konuma eklenir.

 */