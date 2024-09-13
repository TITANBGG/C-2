public class Dizi_Silme {
    public static int[] silme(int a[]){
        for (int i=0; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        return a;
    }
    public static void main(String[] args){
        int a[]={10,20,30,40,50};

        //Diziyi silme fonksiyonu ile güncelleme
        silme(a);

        for(int i=0; i<a.length;i++){
            System.out.println(a[i] +"");
        }
        System.out.println("Dizi");
    }
}
