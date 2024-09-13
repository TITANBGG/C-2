package cift_yonlubaliliste;
/*
class bag {
    String isim;
     int veri;
     bag ileri;
    bag geri;

public void bagli_liste(){
    bag ilk=new bag();
    ilk.ileri=null;
    ilk.geri=null;
    ilk.isim="Birinci";


    for(int i=1;i<10;i++){
        ilk.ileri=new bag();
       // ilk.ileri.isim=k.ileri Line();
        ilk.ileri.geri=null;
        ilk=ilk.ileri;
    }
    bir=bas; tmp=bas;
    while(tmp!=null){
        System.out.print(tmp.no+" ==>");
        tmp=tmp.next2;




        }



}
*/
    // 10 elemanlı tek tönlü çift bağlı liste oluşturma
    class eleman {
        int no;
        eleman next1, next2;
    }

    class Tekyonlu {
        public static void main(String[] args) {
            eleman bir=new eleman();
            eleman bas=bir;
            eleman tmp=bir;
            bir.next1=null;
            bir.next2=null;
            bir.no=1;
            for(int i=2; i<=10; i++) {
                bir.next1=new eleman();
                bir.next1.no=i;
                bir.next1.next1=null;
                bir.next1.next2=null;
                bir=bir.next1;
                tmp.next2=bir;
                tmp=bir;
            }
            bir=bas; tmp=bas;
            while(tmp!=null){
                System.out.print(tmp.no+" ==>");
                tmp=tmp.next2;
            }
        }
    }