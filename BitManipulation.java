public class BitManipulation {

    /*public static void BitWiseOperator(){
        //AND &
        System.out.println((5&6));
        //OR |
        System.out.println((5|6));
        //XOR ^
        System.out.println((5^6));
        //!s Complement (not) ~
        System.out.println((~5));
        //binary left shift <<
        System.out.println((5<<2));
        //binary right shift >>
        System.out.println((6>>1));
    }

    //check wheter a binary number is odd or even
    public static void evenOrOdd(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            //even
            System.out.print("Number is Even.");
        }else{
            System.out.println("ODD.");
        }
    }*/

    //get ith bit
    public static int GetBit(int n, int i){
        int bitMask=1;
        if((n&bitMask)==1){
            return 1;
        }else{
            return 0;
        }
    }
  //set ith bit
  public static  int SetBit(int n, int i){
    int bitMask=1<<i;
    return n|bitMask;
  }

  //clear ith bit
  public static int ClearBit(int n, int i){
    int bitMask=~(1<<i);
    return n&bitMask;
  }
public static void main(String [] args){
        //BitWiseOperator();
        //int n=100;
        //evenOrOdd(n);
        //System.out.println(GetBit(10,2));
        //System.out.println(SetBit(10,2));
        System.out.println(ClearBit(10,1));
    }   
}
