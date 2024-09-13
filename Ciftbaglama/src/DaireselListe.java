public class DaireselListe {
    Node bas;

    // Dairesel bağlı listeye eleman ekleme
    public void ekle(int veri) {
        Node yeniNode = new Node(veri);
        if (bas == null) {
            bas = yeniNode;
            yeniNode.ileri = bas; // Tek bir eleman olduğu için kendine bağla
        } else {
            yeniNode.ileri = bas.ileri;
            bas.ileri = yeniNode;
        }
    }

    // Dairesel bağlı listedeki en büyük sayıyı bulma
    public int enBuyukSayiBul() {
        if (bas == null) {
            return Integer.MIN_VALUE; // Liste boşsa en küçük değeri döndür
        }

        int enBuyuk = bas.veri;
        Node temp = bas.ileri;
        do {
            if (temp.veri > enBuyuk) {
                enBuyuk = temp.veri;
            }
            temp = temp.ileri;
        } while (temp != bas);

        return enBuyuk;
    }

    public static void main(String[] args) {
        DaireselListe liste = new DaireselListe();

        // Dairesel bağlı liste oluşturma
        int[] veriler = {5, 12, 8, 24, 7, 10, 15};
        for (int veri : veriler) {
            liste.ekle(veri);
        }

        // En büyük sayıyı bulma ve yazdırma
        int enBuyuk = liste.enBuyukSayiBul();
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}

class Node {
    int veri;
    Node ileri;

    public Node(int veri) {
        this.veri = veri;
    }
}
