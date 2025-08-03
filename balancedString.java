public class balancedString {
    public static void main(String [] args){
        String s="LRRRRLLRLLRL";
        int balance=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                balance+=1;
            }else{
                balance-=1;
            }
        if(balance==0){
            count++;
        }
        }
        System.out.println(count);
    }
    
}
