public class DivideConquer {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //merge sort
    /*public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //logic
        int mid=si+(ei-si)/2; // calculate mid
        mergeSort(arr, si, mid);//left part
        mergeSort(arr,mid+1,ei);
        merge(arr, si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];

        //left side iterator
        int i=si;
        //right side iterator
        int j=mid+1;
        //temp array iterator
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp array to original one
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }*/

    //quick sort
    /*public static void QuickSort(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }

        //logic
        int pidx= partition(arr, si, ei);
        QuickSort(arr, si, pidx-1);//left part of pivot
        QuickSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        //calculate pivot that is end index
        int pivot=arr[ei];
        //i iterator to make space for element
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //to put pivot on correct place
                 i++;
                //swap
                int temp=pivot;
                arr[ei]=arr[i]; //pivot==arr[i]
                arr[i]=temp;
                return i;
    }*/

    //search in rotated and sorted array
    public static int search(int arr[], int tar,int si, int ei){
        //base case

        if(si>ei){
            return -1;
        }

        //mid
        int mid=si+(ei-si)/2;

        //case found at mid
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);

        }else{
            return search(arr,tar,mid+1,ei);

        }
    } else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);

            }else{
                return search(arr,tar,si,mid-1);
            }

        }
    }

    public static void main(String[] args){
        //int arr[]={6,3,9,5,2,8};
        //mergeSort(arr, 0, arr.length-1);
        //QuickSort(arr, 0, arr.length-1);

        int arr[] = {4, 5, 6, 7, 0, 1, 2}; // Example of rotated sorted array
        int target = 0;

        int index = search(arr, target, 0, arr.length - 1);
        System.out.println("Target " + target + " found at index: " + index);

        printArr(arr);
    }
    
}

