public class pattern {
    public static void main(String [] args){
        /*Sample pattern
         * *****
         * *****
         * *****
         * *****
         
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
        
        }
        System.out.println();
    }*/

    /*
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     * 
     
    int n=4;
    int m=5;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==1 || j==1 || i==n || j==m){
                System.out.print('*');
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }*/

    /* *
     * **
     * ***
     * ****
     
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }*/
    /*
     * ****
     * ***
     * **
     * *
     
    int n=4;
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }*/

    /*   *
     *  **
     * ***
     *****
     
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(' ');

        }
        for(int j=1;j<=i;j++){
            System.out.print('*');
        }
        System.out.println();
    }
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    int n=5;
    int number=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number+=1;
        }
        System.out.println();
    }*
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
            
        }
        System.out.println();
    }*/

    /*
     * ****
     * ****
     * ****
     * ****
     
    
        
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
