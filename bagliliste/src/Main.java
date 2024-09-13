package Baglilisteler;
class dugum{
        int icerik;
        dugum ileri;
        public dugum(int icerik){
        this.icerik=icerik;
        ileri=null;
        } }
public class Main {
    public static void main(String[] args) {
        dugum d1=new dugum(5);
        dugum d2=new dugum(6);
        dugum d3=new dugum(7);
        dugum d4=new dugum(8);
        dugum d5=new dugum(9);
        d1.ileri=d2;
        d2.ileri=d3;
        d3.ileri=d4;
        d4.ileri=d5;
        dugum tmp=d1;
            while(tmp!=null){
                System.out.println(tmp.icerik);
                tmp=tmp.ileri;}
    }}