public class smallestString {

    public static String smallestStringofN(int N, int K){
        if (K < N) return ""; 
        char[] result=new char[N];

        for(int i=N-1;i>=0;i--){
            int value=Math.min(26,K-i);

            result[i]=(char)('a'+value-1);
            K-=value;
        }
        return new String(result);
    }

    public static void main(String [] args){
        int N=5, K=42;
        System.out.println(smallestStringofN(N, K));
    }
    
}
