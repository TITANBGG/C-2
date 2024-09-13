public class Arama {
    public static int Arama(int a[],int N, int Sayi){
        int i=0;
        while (i<N){
            if(a[i]==Sayi)
                break;
                i++;
            }
        if(i<N){
            return i;
        }
        else{return-1;}
    }
}
