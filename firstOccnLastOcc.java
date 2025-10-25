public class firstOccnLastOcc {

    public static int[] searchRange(int arr[], int target){
        int n=arr.length;
        int first=-1;
        int last=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                first=i;
                break;
            }
        }
        if(first==-1){
            return new int[]{-1,-1};
        }

        //last occurence
        for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                last=i;
                break;
            }
        }
        return new int[] {first, last};

    }
    public static void main(String [] args){
        int arr[]={5,7,7,7,8,8,10};
        int target=7;
        int result[]=searchRange(arr,target);
        
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    
}
