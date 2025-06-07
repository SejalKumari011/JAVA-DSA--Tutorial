public class backTracking {

    /*public static void changeArr(int arr[],int i,int val){

        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recusrion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;   

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/

    //find subset out of a string

    /*public static void subSet(String str, String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //choice yes
        subSet(str,ans+str.charAt(i),i+1);

        //choice no
        subSet(str,ans,i+1);
    }*/

    //calculate permutation

    public static void calcPerm(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //remove current element 
            String Newstr=str.substring(0,i)+str.substring(i+1);
            calcPerm(Newstr, ans+curr);

        }
    }

    public static void main(String[] args){
        //int arr[]=new int[5];
        //changeArr(arr,0,1);
        //printArr(arr);
        //String str="abc";
        //subSet(str,"",0);
        String str="abc";
        calcPerm(str,"");

    }
    
}
