public class Dizi_İSilme {
    public static int[] silme(int a[]){
        for (int i=0; i<a; i++){
            a[i]=a[i+1];
        }
        return a;
    }
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        silme(a);
    }
}
