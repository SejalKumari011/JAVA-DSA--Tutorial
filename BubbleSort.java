public class BubbleSort {

    public static void bubbleSort(int numbers[]){
        for(int turn=0;turn<numbers.length-1;turn++){
            for(int j=0;j<numbers.length-turn;j++){
                //condition
                if(numbers[j]>numbers[j+1]){
                    //swapping
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String [] args){
        int numbers[]={5,4,3,1,2};
        bubbleSort(numbers);
        printArray(numbers);

       }
    
}
