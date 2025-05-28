
import java.util.*;
public class Matrix {

    /*public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element found.");
                    return true;
                }

            }
        }
        
        System.out.println("Element not found");
        return false;
    }

    public static void main(String [] args){
        int arr[][]=new int[3][3];
        int n=3;
        int m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        search(arr,5);
    }*/

    //Diagonal sum

    /*public static int DiagonalSum(int arr[][]){
        //for primary diagonal sum
        //logic --> i==j(row==col)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }else if(i+j==(arr.length-1)){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }*/

    //optimized sol

    /*public static int DiagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //primary diagonal
            sum+=arr[i][i];

            //secondary diagonal
            //following condition mean will be excuted when i will not be equals to j
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String [] args){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.print(DiagonalSum(arr));

    }*/

    //search in sorted matrix

    public static void SortedMatrix(int arr[][], int key){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==key){
                    System.out.print("Element found at index: "+i+","+j);
                }
            }
        }
        
    }
    public static void main(String [] args){
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        SortedMatrix(arr,35);

    }
    
}
