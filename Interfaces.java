public class Interfaces {
    public static void main(String[] args){
        Queen q1=new Queen();
        q1.moves();
    }  
}
/* 
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Up Down Left Right diagonal all 4 sides");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("UP DOwn Left Right");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("Up down Left Right diagonal by 1");
    }
}*/

//Interface implements multiple inheritance

interface Herbivore{
    void eatGrass();
}

interface CarniVore{
    void eatMeat();
}

class bear implements Herbivore, Carnivore{
     void eatGrass(){
        System.out.println("Eats Grass");
    }
    void eatMeat(){
        System.out.println("Eats meat");
    }
}