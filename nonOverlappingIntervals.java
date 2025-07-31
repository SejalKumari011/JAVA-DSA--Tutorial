import java.util.Arrays;
public class nonOverlappingIntervals {

    public static int nonOverlapping(int intervals[][]){
        if(intervals.length==0) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count=1;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            count++;
            end=intervals[i][1];
        }
        return intervals.length-count;
    }

    public static void main(String [] args){
        int intervals[][]={
            {1,2},
            {2,3},
            {3,4},
            {1,3}
        };
        System.out.println(nonOverlapping(intervals));
    }
  
}
