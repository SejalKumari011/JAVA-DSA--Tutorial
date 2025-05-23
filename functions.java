import java.util.*;

public class functions {
    /*public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);

    }
    public static void add(int a, int b){
        System.out.print(a+b);
    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
    }
    public static int Calculateprod(int a, int b){
        int prod=a*b;
        System.out.println(prod);
        return prod;



    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculateprod(a,b);

    }*/

 
    /*Factorial of a number 
    public static void CalculateFactorial(int n){
        int fact=1;
        for (int i=n;i>=1;i--){
            
           fact*=i;

        }
        System.out.println(fact); 

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
            CalculateFactorial(n);
            public static int factorial(int n){
                int f=1;
                for(int i=1;i<=n;i++){
                    f=f*i;
                }
                return f;

            }

           
            public static int binomCoeff(int n, int r){
                int fact_n=factorial(n);
                int fact_r=factorial(r);
                int fact_nmr=factorial(n-r);

                int binomCoeff=fact_n/(fact_r*fact_nmr);
                return binomCoeff;

            }
             public static void main(String [] args){
                System.out.println(binomCoeff(5,2));
              
            }
            
    /*To calculate prime 
    
     
    public static boolean CalcPrime(int n){
        
        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;

            }
        
        
        }
        return true;

    }
    public static void main(String [] args){
        System.out.println(CalcPrime(7));
        
    }*/

    /*optimized prime calculation 
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
             
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i =2;i<=n;i++){
            if(isPrime(i)){
        System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        PrimeRange(20);
    }
    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int LastDigit=binNum%10;
            decNum=decNum+(LastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;


        }
        System.out.println(decNum); 
    }
        

        public static void main(String[]args){
            binToDec(101);
        }

    public static void DectoBin(int n){
        int pow=0;
        int binNum=0;

        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem+(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(binNum); 

    }
    public static void main(String [] args){
        DectoBin(15);
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    
    public static void main(String [] args){
        System.out.println(isEven(10));
        

    }*/

    public static void DigitSum(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String [] args){
        DigitSum(123);


    }

    }
    

