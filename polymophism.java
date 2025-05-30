public class polymophism {
    public static void main(String [] args){
        //method overloading
        // calculator calc=new calculator();
        // System.out.println(calc.sum(10,12));
        // System.out.println(calc.sum(10,12,10));
        // System.out.println(calc.sum((float)9.0,(float)12.2));

        //method ovrriding
        Deer d1=new Deer();
        d1.eat();
    }   
}

//method overriding
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
class calculator{
    //Method Oveloading -> same name but different work
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
