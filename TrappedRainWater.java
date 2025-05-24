public class TrappedRainWater {

    public static int TrappedWater(int height[]){
        int n=height.length;

        //left max boundry array 
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);

        }
        //loop
        int trapWater=0;
        for(int i=0;i<n;i++){
            //water level --> min(left max, right max)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water--> water level-height
            trapWater+=waterLevel-height[i];
        }
        return trapWater;  
    }

    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappedWater(height));

    }
    
}
