import java.util.*;
public class strings {


    /*public static void printString(String name){
        for(int i=-0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }

    public static void main(String [] args){

        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str1= new String("xyz");

        //taking input
        Scanner sc=new Scanner(System.in);
        //String name=sc.next();
        //System.out.println(name);

        //to input whole line
        //String fullname=sc.nextLine();
        //System.out.println(fullname);

        //to calculate length of the string
        //System.out.println(fullname.length());

        //concatenation

        /*String name="sejal";
        String surname="Kumari";
        String fullname=name+" "+surname;
        System.out.print(fullname);*/

        //to use .charAt function to access particular character
        /*String name="Sejal";
        System.out.print(name.charAt(1));

        String name="Sejal";
        printString(name);

    }*/
    
    //check if a number is palindrome or not
    /*public static boolean PalindromeString(String str){
        for(int i=0;i<(str.length())/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;       
    }
    public static void main(String [] args){
        
        String str="racecar";
        System.out.println(PalindromeString(str)); 
    }*/

    //calculating shortest path


    /*public static float ShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir =='E'){
                x++;
            }else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(ShortestPath(path));
    }*/


    //calculate substring based on given start index and end endex
    /*public static String subString(String str, int si, int ei){
        String subStr="";
        for(int i=si;i<=ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }

    public static void main(String [] args){
        String str="Hello World";
        System.out.println(subString(str,3,6));
    }*/

    //largest string according to lexicographic
    //if str1<str2 retrun -ve number if str2<str1 return +ve

    /*public static void main(String [] args){
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }

        }
        System.out.println(largest);

    }*/

    //convert first letter of each word to capital

    /*public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str="hi, i am sejal";
        System.out.println(toUpperCase(str));
    }*/

    // String compression "aaabbcccdd"--> "a3b2c3d2"
    /*public static String StringCompress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String [] args){
        String str="aaabbcccdd";
        System.out.println(StringCompress(str));

    }*/

    public static void printVowel(String str){
        int count=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String [] args){
        String str="aabeeeidou";
        printVowel(str);

    }
}
