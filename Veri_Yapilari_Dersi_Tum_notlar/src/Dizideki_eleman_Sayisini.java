public class Dizideki_eleman_Sayisini {

    public static int topla(int A[]){
        int topla=0; //1
        for(int i=0; i<N; i++){//N+1
            topla += A[i];//N
        }
        return topla;//1
    }
}
// 1+N+1+N+1= T(n)=2N+3 == fonksiyon;
// O(n)=N == O(N)