public class Recursion2 {

    //tiling problem
    /*public static int tiling(int n){ //2*n==floor size
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice 
        int fnm1=tiling(n-1);

        //horizonatl tiling
        int fnm2=tiling(n-2);
        
        //total ways to tile the floor
        int totWays=fnm1+fnm2;
        return totWays;
    }*/

    //remove duplicates froma string
   /*public static void RemoveDuplicate(String str,int idx,StringBuilder newStr, boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(str);
            return;
        }
        //logic
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            RemoveDuplicate(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
        }

    }*/
    //pairing friends
    /*public static int PairingFriends(int n){

        if(n==1 || n==2){
            return n;
        }

        //logic
        //single
        int fnm1=PairingFriends(n-1);

        //pair
        int fmn2=PairingFriends(n-2);
        int pairWays=(n-1)*fmn2;

        //Total ways
        int totWays=fnm1+pairWays;

        return totWays;
    }*/

    //Alternative way
    /*public static int FriendsPairing(int n){
        //base
        if(n==1 || n==2){
            return n;
        }

        return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);

    }*/

    //print indices of a given no occured in an array
    /*public static void ArrayIndices(int arr[],int i, int key){

        //base

        if(i==arr.length){
            return;
        }

        //logic

        if(arr[i]==key){
            System.out.println(i+" ");
        }
        ArrayIndices(arr, i+1, key);
    }*/

    //Tower of Hanoi

    public static void TowerOfHanoi(int n, String src, String helper, String dest){

        //base
        if(n==1){
            System.out.println("Transfered disk "+n+" from "+src+" to "+dest);
            return;

        }

        //put (n-1) disk to helper tower using destination as helper
        TowerOfHanoi(n-1,src,dest,helper);
        System.out.println(" Transfered disk "+ n+" from "+ src+" to "+ dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        //int n=10;
        //System.out.println(tiling(n));
        //String str="appnnaCollege";
        //RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        //int n=3;
        //PairingFriends(n);
        //FriendsPairing(n);
        //int key=5;
        //int arr[]={2,5,6,5,5,2,4,5};
        //ArrayIndices(arr, 0, key);
        int n=2;
        TowerOfHanoi(n, "S", "H", "D");

    }
    
}
