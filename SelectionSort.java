public class SelectionSort {

    public static void selectionSort(int numbers[]){

        //to go to the whole length
        for(int i=0;i<numbers.length-1;i++){
            //to compare i with adjacent element
            int minPos=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minPos]>numbers[j]){
                    minPos=j;
                }
                //swap
                int temp=numbers[minPos];
                numbers[minPos]=numbers[i];
                numbers[i]=temp;
                
            }
        }

    }

    public static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }

    public static void main(String [] args){
        int numbers[]={5,4,1,3,2};
        selectionSort(numbers);
        printArray(numbers);

    }
    
}
