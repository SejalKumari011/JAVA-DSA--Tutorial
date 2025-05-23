
import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class condition {
    public static void main(String [] args){
        
        /* If else statement
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Adult, Eligible to Vote");
        } else{
            System.out.println("Cannot vote");
        }*/

        /*Even-ODD 
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/

        /*Elif stetment
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A is equals to b");
        }else if (a>b){
        System.out.println("A is greater than b");
    }else{
        System.out.println("B is graeter than a");}*/

        /*If a is an odd number print bazinga 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("Bazinga");
        
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num==1){
                System.out.println("Hello");
            }else if(num==2){
                System.out.println("Namaste");

            }else{
                System.out.println("Bonjour");}

            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            switch(num){
                case 1: System.out.println("Hello");
                break;
                case 2: System.out.println("Namsate");
                break;
                case 3: System.out.println("Bonjour");
                default : System.out.println("Invalid button");

            }*/
            Scanner sc=new Scanner(System.in);
            String operator=sc.next();
            int a =sc.nextInt();
            int b=sc.nextInt();

            switch(operator){
                case "+": System.out.println(a+b);
                break;
                case "-": System.out.println(a-b);
                break;
                case "*": System.out.println(a*b);
                break;
                case "/": System.out.println(a/b);
                break;
                default: System.out.println("Invalid");


            }

            }
        }

    
            
        

        


    
    

