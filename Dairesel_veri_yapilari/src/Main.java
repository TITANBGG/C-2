public class Dairesel_veri_yapilari {
    Node bas;
    Dairesel_veri_yapilari() {
        bas = null;
    }

    public void ekle(Node eleman) {
        if (bas == null) {
            bas = eleman;
            bas.ileri = bas;

        } else {
            Node tmp = bas;
            while (tmp.ileri != bas) tmp = tmp.ileri;
            tmp.ileri = eleman;
            eleman.ileri = bas;
        }
    }
    public void sil(int veri) {
        if (bas == null) System.out.println("Liste boştur silme işlemi başarısız!");
        else {
            Node tmp = bas;
            if (tmp.sayi == veri) {
                Node son = bas;
                while (son.ileri != bas) son = son.ileri;
                son.ileri = bas.ileri;
                bas.ileri = null;
                bas = son.ileri;
            } else {
                while (tmp.ileri != bas) {
                    if (tmp.ileri.sayi == veri)
                        tmp.ileri = tmp.ileri.ileri;

                    tmp = tmp.ileri;
                }
            }
        }
    }

    public void listeyiYaz() {
        if (bas == null) System.out.println("Liste boştur!");
        else {
            int sayac = 0;
            System.out.print("[");
            Node temp = bas;
            while (temp.ileri != bas) {
                System.out.print(temp.sayi + ", ");
                temp = temp.ileri;
                sayac++;
            }
            System.out.print(temp.sayi + ", ");
            System.out.print("]");
        }
    }

    public static class Node {
        int sayi;
        Node ileri;

        Node(int sayi) {
            this.sayi = sayi;
            ileri = null;
        }
    }

    public static void main(String[] args) {
        DarieselListe liste = new DarieselListe();
        liste.ekle(new Node(1));
        liste.ekle(new Node(2));
        liste.ekle(new Node(3));
        liste.ekle(new Node(4));
        liste.ekle(new Node(5));

        liste.sil(3);
        liste.sil(1);
        liste.sil(5);

        liste.listeyiYaz();
}
}