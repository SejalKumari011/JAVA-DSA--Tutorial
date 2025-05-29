public class Inheritance {

    public static void main(String [] args){
        fish shark =new fish();
        shark.eat();
        mammal human=new mammal();
        human.breathe();
    } 
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class

class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}


//Hierarchical Inheritance
class mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}
