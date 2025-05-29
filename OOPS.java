public class OOPS {
    /*public static void main(String [] args){
        Pen p1=new Pen();  //created an object
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        //System.out.println(p1.color);
        p1.color="Brown";

        BankAccount ba=new BankAccount();
        ba.userName="Sejal";
        //ba.password="abced"; it will throw an error because we are trying to access it in another class
        
    }   
}

class BankAccount{
    public String userName; //can be accessed anywhere
    private String password; //cant b accessed in different classs because its private

    public void setPassword(String pwd){
        password=pwd //here it is accessible
    }
}
class Pen{
    String color;
    int tip;

    Pen(String color){
        System.out.println(this.color);

    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }*/

    /*public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("Sejal");
        Student s3=new Student(123);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor Called...");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }*/

    public static void main(String [] args){
        Student s1=new Student();
        s1.name="Sejal";
        s1.roll=1234;
        s1.password="abcd";
        
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        s2.password="xyz";

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]+" ");
        }
    } 
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        this.marks=marks;
        for (int i = 0; i < 3; i++) {
        this.marks[i] = s1.marks[i];
    }     
    }
    Student(){
        System.out.println("Constructor called...");
        marks=new int[3];
    }
    Student(String name){
        marks=new int[3];
        this.name=name;

    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;

    }
}
