public class HybridInheritence {
    public static void main(String[] args){
        Human h1=new Human();
        h1.eat();
        Peacock p1=new Peacock();
        p1.breathe();

        h1.human(); 

    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }

}

class Tuna extends Animal{
    void tuna(){
        System.out.println(" I am Tuna");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Human extends mammal{
    void human(){
        System.out.println("I am Human");
    } 
}
class bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}

class Peacock extends bird{
    void peacock(){
        System.out.println("I am Peacock");
    } 
}