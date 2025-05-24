import java.util.*;
public class Arrays {
    /*public static void main(String [] args){
        //creating an array
        int arr[]=new int[50];
        int number[]={10,20,30};
        String fruits[]={"mango","apple","fig"};

        //to calculate length of the array
        System.out.println("length: "+ fruits.length);

        //Taking input in an array from user

        /*int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the marks for physics: ");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks for Chemistry: ");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks for Maths: ");
        marks[2]=sc.nextInt();
        
        System.out.println("Physic: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Math: "+marks[2]);

        //updation in an array
        marks[2]=100;
        System.out.println("Mraks after updation: "+marks[2]);

        //Array as a function argument
        public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
                
            }
            
        }
        
        public static void main(String [] args){
            int marks[]={90,80,70};
            update(marks);

            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);

            }
            System.out.println();

        }*/

        //linear search
        /*public static void main(String [] args){
            int marks[]={2,3,5,10,12,15,20};
            int key=10;

            for (int i=0;i<marks.length;i++){
                if(marks[i]==key){
                    System.out.println("Marks found at index: "+i);
                }

            }
        }

        public static int LinearSearch(int marks[], int key){

            for(int i=0;i<marks.length;i++){
                if(marks[i]==key){
                    return i;
                }
                
            }
            return -1;

        }
        public static void main(String [] args){
            int marks[]={2,3,6,10,12,15,20};
            int key=10;

           

            int index=LinearSearch(marks,10);
             if(index==-1){
                System.out.println("Not found ");

            }else{
                System.out.println("Found at index : "+index);
            }


        }
//largest in an array
        public static void main(String [] args){
            int arr[]={12,52,100,8,48,46};
            int largest=arr[0];
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                }
            }
            System.out.println(largest);

        }

        public static int Largest(int arr[],int largest){
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                } 

            }
            return largest;

        }
        public static void main(String [] args){
            int arr[]={10,38,9,100,37,37};
            int largest=arr[0];

            System.out.println(Largest(arr,largest));
        }*/


        //Reverse of an array

        /*public static void ReverseArray(int arr[]){
            int first=0, last=arr.length-1;

            while(first<last){
                int temp=arr[last];
                arr[last]=arr[first];
                arr[first]=temp;

                first++;
                last--;
            }
        }

        public static void main(String [] args){
            int arr[]={10,28,46,78,28};

            ReverseArray(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }

            System.out.println();
        }*/

        //print pairs in an array

        /*public static void PrintPairs(int numbers[]){

            for(int i=0;i<numbers.length;i++){
                int curr=numbers[i];
                for(int j=i+1;j<numbers.length;j++){
                    System.out.print("("+curr+","+numbers[j]+")");
                }
                System.out.println();
            }
        }


        public static void main(String [] args){
            int numbers[]={2,4,6,8,10};
            PrintPairs(numbers);

        }*/

        /*Subarrays */
        /*public static void subArrays(int numbers[]){
            int ts=0;

            //to calculate start
            for(int i=0;i<numbers.length;i++){
                int start=i;
                //to calculate end
                for(int j=i;j<numbers.length;j++){
                    int end=j;

                    //to print subarray
                    for(int k=start;k<=end;k++){
                        System.out.print(numbers[k]+" ");
                    }
                    ts++;
                    System.out.println();
                }
                System.out.println();

            }
            System.out.println("total no of sub arrays: "+ts);
            

        }


        public static void main(String []args){
            int numbers[]={2,4,6,8,10};
            subArrays(numbers);

        }*/

        /*MAx sum of sub array */
        /*public static void MaxSumSUbArray(int numbers[]){
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;

            //to calculate start
            for(int i=0;i<numbers.length;i++){
                int start=i;
                //to calculate end
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    currSum=0;

                    //to print subarray
                    for(int k=start;k<=end;k++){
                        currSum+=numbers[k];
                    }

                    System.out.println(currSum);
                    
                    if (maxSum<currSum){
                        maxSum=currSum;

                    }
                    
                }
                //System.out.println();

            }
            System.out.println("Max sum of Sub Array: "+maxSum);
            

        }


        public static void main(String []args){
            int numbers[]={2,4,6,8,10};
            MaxSumSUbArray(numbers);

        }*/

        //Max Sum Sub Array using prefix

        /*public static void SumSubArray(int numbers[]){
            int currSum=0;
            int maxSum=Integer.MAX_VALUE;
            int prefix[]=new int[numbers.length];

            prefix[0]=numbers[0];
            //calculate prefix array
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+numbers[i];
            }

            for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    currSum=start==0? prefix[end]: prefix[end]-prefix[start-1];
                    if (maxSum<currSum){
                        maxSum=currSum;

                    }

                }
                System.out.println();
                 
            }
            System.out.println("Max sum of Sub Array: "+maxSum);

        }

        public static void main(String [] args){
            int numbers[]={10,23,-2,34,-2};
            SumSubArray(numbers);

        }*/

        //buy sell stock price

        /*public static int BuySellStock(int prices[]){

            int buyPrice=Integer.MAX_VALUE;
            int maxProfit=0;

            for(int i=0;i<prices.length;i++){

                if(buyPrice<prices[i]){
                    int Profit=prices[i]-buyPrice;
                    maxProfit=Math.max(maxProfit,Profit);
                }else{
                    buyPrice=prices[i];
                }
                
            }
            return maxProfit;
        }

        public static void main(String [] args){
            int prices[]={1,2,4,5,7};
            System.out.println(BuySellStock(prices));
        }*/

        //return true if any no in array appears atleast 2 times
        /*public static boolean duplicateChecker(int number[]){

            for(int i=0;i<number.length-1;i++){
                for(int j=i+1;j<number.length;j++){
                    if(number[i]==number[j]){
                        return true;
                    }
                }
            }
            return false;

        }
        public static void main(String[] args){
            int number[]={10,12,10,10,12,30,45,45,70};
            System.out.println(duplicateChecker(number));

        }*/

        //obtain maximum profit from an array for prices
        public static int maxProfit(int prices[]){
            int buy=prices[0];
            int profit=0;
            for(int i=0;i<prices.length;i++){
                if(buy<prices[i]){
                    profit=Math.max(prices[i]-buy,profit);

                }else{
                    buy=prices[i];
                }
                
            }
            return profit;

        }
        public static void main(String [] args){
            int prices[]={7, 1, 5, 3, 6,  4};
            System.out.println(maxProfit(prices));
        }
    }

