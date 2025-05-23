import javax.annotation.processing.SupportedOptions;

public class AdvancedPattern {
    /*public static void main(String [] args){
        int n=4;
        for(int i =1; i<=n;i++){
            for(int j=1;i<=i;j++){
                System.out.print("*");
            }
            int spaces=2 * (n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1;i--){
            for(int j=1;i<=i;j++){
                System.out.print("*");
            }
            int spaces=2 * (n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
            System.out.print("*");
        }
    System.out.println();}

    }
    public static void HollowRectangle(int TotRows, int TotColumn){
        for(int i=1;i<=TotRows;i++){
            for(int j=1; j<=TotColumn;j++){
                if(i==1 ||i==TotRows ||j==1||j==TotColumn){
                    System.out.print("*");
                }   
                else{
                    System.out.print(" ");  

                }
                 
            
            }
            System.out.println();
        }
    }

    public static void InvertedTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        public static void Inverted_traiangle_number(int n){
            for(int i=1;i<=n;i++){
                for(int j=1; j<=n-i+1;j++){
                    System.out.print(j);

                }
                System.out.println();
            }
            

        }
        public static void floydTraingle(int n){
            int counter=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }
            
        }
        public static void zero_one_trianle(int n){
            for (int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }

                }
                System.out.println();
            }
        }

    
    public static void main(String [ ]args){
        //InvertedTriangle(4);
        //Inverted_traiangle_number(5);
        //floydTraingle(5);
        zero_one_trianle(5);
        
    }


    public static void ButterflyPattern(int n){
        //first half
        //outer loop
        for(int i=1;i<=n;i++){
            //first traingle
            //stars=i
            
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

             //spaces
             //spaces =2*n-i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd trianle
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }


             for(int i=n;i>=1;i--){
            //first traingle
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

             //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd trianle
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();



            
        }
       
    }
    public static void main(String [] args){
        ButterflyPattern(4);

    }*/

    /* Solid rhombus 
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        SolidRhombus(5);
    }*/

    /* Hollow rhombus 
    public static void HollowRombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/

    public static void Diamond(int n){
        //First Half
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces (n-i)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars (2*i-1)
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }


        //2nd half
        //outer loop
        for(int i=n;i>=1;i--){
            //spaces (n-i)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars(2*i-1)
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        //HollowRombus(5);
        Diamond(4);
    }

    
}
