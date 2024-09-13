public class Dugum {
    int veri;      // Sınıfın üye değişkeni (field)
    Dugum sonraki;  // Sınıfın üye değişkeni (field)

    // Kurucu metod (constructor)
    public Dugum(int veri) {
        // "this.veri" ifadesi, sınıfın üye değişkenine referans verir.
        // "veri" ifadesi, metot parametresindeki yerel değişkeni temsil eder.
        this.veri = veri;
        this.sonraki = null;
    }

    // Sona eleman ekleme metodu
    public void sonaEkle(int yeniVeri) {
        Dugum yeniDugum = new Dugum(yeniVeri);

        // Eğer bağlı liste boşsa, yeni düğümü baş olarak ayarla
        if (this.sonraki == null) {
            this.sonraki = yeniDugum;
        } else {
            // Bağlı listenin sonuna kadar git ve yeni düğümü ekleyerek bağla
            Dugum temp = this.sonraki;
            while (temp.sonraki != null) {
                temp = temp.sonraki;
            }
            temp.sonraki = yeniDugum;
        }

    }
}


