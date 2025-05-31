public class Recursion {


    //printing number in decreasing order
    /*public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }*/

    //printing numbers in increasing order
    /*public static void printInc(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);
    }*/

    //factorila of a number n

    /*public static int fact(int n){

        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }*/

    //sum of N natural numbers
    /*public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=sum(n-1);
        int sn=n+sum(n-1);
        return sn;

    }*/

    //fibonacci number
    /*public static int fibonacciNumber(int n){

        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fibonacciNumber(n-1);
        int fibnm2=fibonacciNumber(n-2);
        int fibN=fibonacciNumber(n-1)+fibonacciNumber(n-2);
        return fibN;  
    }*/

    //check if a array is sorted or not
    /*public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }*/

    //find first occurence of a number in an array
    /*public static int firstOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
     
        if(arr[i]==key){
            return i;
        }

        return firstOcc(arr,key,i+1);

    }*/
    //calculate last occurence of a number in an array
    /*public static int lastOcc(int arr[], int key, int i){
        if(arr[i]==0){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOcc(arr,key,i-1);
    }*/

    //print x^n
    public static int XpowerN(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1=XpowerN(x,n-1);
        // int xn=n*xnm1;
        // return xn;
        return x*XpowerN(x,n-1);

    }
    public static void main(String [] args){
   //int n=10;
   //int n=1;

   //printInc(n);
    //int n=5;
    //System.out.println(sum(n));
    //System.out.print(fact(n));
    //System.out.println(fibonacciNumber(n));

    //int arr[]={1,2,7,4,5,8,9,5};
    //System.out.println(isSorted(arr, 0));
    //System.out.println(firstOcc(arr,5,0));
    //System.out.println(lastOcc(arr,5,arr.length-1));
    System.out.println(XpowerN(10,2));
    } 
}
