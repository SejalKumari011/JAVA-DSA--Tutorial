public class KadanesAlgorithm {

    public static void kadane(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<numbers.length;i++){
            currSum+=numbers[i];
            maxSum=Math.max(maxSum, currSum);
            if(currSum<0){
                currSum=0;

            }
            
        }
        System.out.println("Maximum sum: "+maxSum);
    }

    public static void main(String [] args){
        int numbers[]={-2,-3,-4,-1,-2,1,5,3};
        kadane(numbers);
        
    }
    
}
