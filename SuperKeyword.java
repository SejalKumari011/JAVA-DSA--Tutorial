public class SuperKeyword {
    public static void main(String[] args){
        horse h1=new horse();
        System.out.println(h1.color);
    } 
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal contructor called...");
    }
}

class horse extends Animal{
    horse(){
        super.color="brown";
        //super();
        System.out.println("horse contructor called...");
    }
}
