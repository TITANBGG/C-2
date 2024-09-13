public class DaireselBagliListe {
    Node bas;

    // Dairesel bağlı listeye eleman ekleme
    public void ekle(int veri) {
        Node yeniNode = new Node(veri);

        if (bas == null) {
            bas = yeniNode;
            bas.ileri = bas; // Tek bir eleman olduğu için kendine bağla
        } else {
            Node temp = bas;
            while (temp.ileri != bas) {
                temp = temp.ileri;
            }
            temp.ileri = yeniNode;
            yeniNode.ileri = bas; // Yeni elemanı başa bağla
        }
    }

    // Dairesel bağlı listeye eleman ekleme (başa)
    public void basaEkle(int veri) {
        Node yeniNode = new Node(veri);

        if (bas == null) {
            bas = yeniNode;
            bas.ileri = bas; // Tek bir eleman olduğu için kendine bağla
        } else {
            Node temp = bas;
            while (temp.ileri != bas) {
                temp = temp.ileri;
            }
            temp.ileri = yeniNode;
            yeniNode.ileri = bas; // Yeni elemanı başa bağla
            bas = yeniNode; // Yeni elemanı baş olarak ayarla
        }
    }

    // Dairesel bağlı listeyi yazdırma
    public void yazdir() {
        if (bas == null) {
            System.out.println("Liste boş.");
            return;
        }

        Node temp = bas;
        do {
            System.out.print(temp.veri + " ");
            temp = temp.ileri;
        } while (temp != bas);
    }

    public static void main(String[] args) {
        DaireselBagliListe liste = new DaireselBagliListe();

        // 1'den 10'a kadar olan tam sayıları içeren dairesel bağlı liste oluşturma
        for (int i = 1; i <= 10; i++) {
            liste.ekle(i); // Sona eleman eklemek için
        }

        // Başa eleman eklemek için
        liste.basaEkle(0);

        // Listeyi yazdırma
        liste.yazdir();
    }
}

class Node3 {
    int veri;
    Node3 ileri;

    public Node3(int veri) {
        this.veri = veri;
    }
}




//  fghfgyhfghr6t6ttttyuuuy45645tedtdg