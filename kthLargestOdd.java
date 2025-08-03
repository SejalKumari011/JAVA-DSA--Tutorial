public class kthLargestOdd{

    public static int kThLargest(int L, int R, int K){
        int first=(L%2==0)? L+1 :L;
        int last=(R%2==0)? R-1 :R;

        if(first>last) return 0;

        int count= (last-first)/2+1;

        if(K>count) return 0;

        return last-(K-1)*2;

    }
    public static void main(String [] args){
        int L=-1;
        int R=3;
        int K=1;

        System.out.println(kThLargest(L, R, K));

    }
}