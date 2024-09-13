import java.util.Scanner;

public class bes_elemanli_cift_yonlu_diziyi_olustur {
    public static void main(String[] args){

        //cift bagli liste olustur.
        Bilgi ilk=new Bilgi();
        ilk.ad="Birinci";
        Bilgi ileri =new Bilgi();
        ilk.ileri=null;
        ilk.geri=null;
        for(int i=0; i<4;i++){
            ilk.ileri= new Bilgi();
            ilk.ileri.ileri=null;
            ilk.ileri.geri=ilk;
            ilk=ilk.ileri;

        }
        //ilk= ilk.yedek;
        //ilk.yedek=null;

    }
}
class Bilgi {
    String ad;
    Bilgi ileri;
    Bilgi geri;
    Bilgi yedek;
}