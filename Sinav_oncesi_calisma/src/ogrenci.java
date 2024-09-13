package veriyapilari;
 class ogrenci {
    String ad;
     String soyad;
    char cinsiyet;
    int yas;}
    public ogrenci(String ad,soyad, char cinsiyet,int yas){
     this.ad=ad;
     this.soyad=soyad;
     this.cinsiyet=cinsiyet;
     this.yas=yas;
    }
    public class veriyapilari{
     public static void main(String[] args){
         ogrenci o=new ogrenci("Ali","Nebi",'E',22);
         System.out.println(o.ad+""o.soyad+""+o.cinsiyet''+o.yas);

     }
    }