import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner k = new Scanner(System.in);

        // Çift bağlı liste oluştur
        Sinif ilk = new Sinif();
        ilk.ad = "Birinci";

        for (int i = 1; i < 10; i++) {
            ilk.ileri1 = new Sinif();
            ilk.ileri1.ad = k.nextLine();
            ilk.ileri1.ileri2 = ilk;
            ilk = ilk.ileri1;
        }

        // Liste üzerinde dolaşma ve yazdırma
        Sinif temp = ilk;
        while (temp != null) {
            System.out.println(temp.ad);
            temp = temp.ileri2;
        }
    }
}

class Sinif {
    String ad;
    Sinif ileri1;
    Sinif ileri2;
}
