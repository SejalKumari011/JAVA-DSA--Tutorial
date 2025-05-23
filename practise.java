import java.util.*;
public class practise {
    public static void main(String args[]){
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter the price of pencil: ");
        float pencil=sc.nextFloat();
        System.out.println("Enter the price of Pen: ");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of book5: ");
        float book=sc.nextFloat();
        float sum=pencil+pen+book;
        System.out.println(sum);

    }

    print the reverse of the number
 
    int n=10899;
    
    while(n>0){
        int lastdigit=n%10;
        System.out.print(lastdigit+" ");
        n=n/10;
    }*/

    /*rveerse the number
    int n=10899;
    int rev=0;
    while(n>0){
        int lastDigit=n%10;
        rev=(rev*10)+lastDigit;
        n=n/10;
    }
    System.out.println(rev);

    Scanner sc =new Scanner(System.in);

    do{
        System.out.println("Enter your no: ");
        int n=sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println(n);
    }while(true);*/

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    boolean is_prime=true;
    for(int i=2;i<=(n-1);i++){
        if(n%i==0){
            is_prime=false;

        }
        
    }
    if(is_prime==true){
            System.out.println("No is prime");
        }else{
            System.out.println("Not a prime number");
        }


    }
    
}
