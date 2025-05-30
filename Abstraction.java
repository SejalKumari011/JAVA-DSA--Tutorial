public class Abstraction {
    public static void main(String [] args){
        // horse h1=new horse();
        // h1.walk();
        // h1.eat();
        // System.out.println(h1.color); //it will give brown color until we ont call change color

        // chicken c1=new chicken();
        // c1.eat();
        // c1.walk();

        mustang m1=new mustang();
        //animal->horse->mustang
        
    }   
}

abstract class Animal{
    String color;
    //non abstract method
    void eat(){
        System.out.println("Eats something");
    }
    //abstract method
    abstract void walk();

    //constructor
    Animal(){
      System.out.println("COnstructor called");
    }
}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="Black";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called...");
    }
}
class chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
