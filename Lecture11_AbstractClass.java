abstract class Car{  //Abstract classes cannot be instatiated
    int maxSpeed;
    abstract void acceleration(); //Only declared not implemented

    abstract void brake();
}

abstract class BMW extends Car{
    void acceleration(){
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is braking");
    }
}
public class Lecture11_AbstractClass{
    public static void main(String[] args){
        // BMW b = new BMW();
        // b.acceleration();
        BMW2 b2 = new BMW2();
        b2.acceleration();
        b2.brake();
    }
}