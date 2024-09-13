public class CiftYonluBagliListe {
    Eleman2 bas, son;

    public CiftYonluBagliListe() {
        bas = null;
        son = null;
    }

    void basaEkle(Eleman2 yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            bas.geri = yeni;
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void sonaEkle(Eleman2 yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            yeni.geri = son;
            son = yeni;
        }
    }

    void yazdir() {
        Eleman2 tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.icerik + " ");
            tmp = tmp.ileri;
        }
    }
}

class Eleman2 {
    Eleman2 ileri, geri;
    int icerik;

    Eleman2(int icerik) {
        this.icerik = icerik;
    }
}
