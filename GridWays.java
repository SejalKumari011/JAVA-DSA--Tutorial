public class GridWays {


    public static int gridWays(int i, int j, int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;

        }

        //recursion
        //down
        int down= gridWays(i+1,j,n,m);
       int right= gridWays(i,j+1,n,m);
        return down+right;
    }
    public static void main(String[] args){
        int n=4,m=4;

      System.out.println(  gridWays(0,0,n,m));

    }
    
}
