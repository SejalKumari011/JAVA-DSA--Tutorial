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
    public static void RemoveDuplicate(String str,int idx,StringBuilder newStr, boolean map[]){
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

    }
    public static void main(String[] args){
        //int n=10;
        //System.out.println(tiling(n));
        String str="appnnaCollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
