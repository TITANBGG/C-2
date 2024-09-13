public class dizi_olusturma {
    class Dugum {
        int veri;      // Sınıfın üye değişkeni (field)
        Dugum sonraki;  // Sınıfın üye değişkeni (field)

        // Kurucu metod (constructor)
        public Dugum(int veri) {
            // "this.veri" ifadesi, sınıfın üye değişkenine referans verir.
            // "veri" ifadesi, metot parametresindeki yerel değişkeni temsil eder.
            this.veri = veri;
            this.sonraki = null;
        }

}}