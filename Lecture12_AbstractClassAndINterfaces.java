interface A{
    int x = 10;
    void fun();
}
interface B{
    int x = 20;
    void fun();
}
class C implements A,B{ //Multiple inheritsnce in Java
    public void fun(){
        System.out.println("Hello, I am a function in C");
        System.out.println(A.x);//Ambiguity resolved using Fully Qualified Name
        System.out.println(B.x);//Ambiguity resolved using Fully Qualified Name
        System.out.println(A.super.hashCode());
        System.out.println(B.super.hashCode());
    }
}
interface O extends A,B{
    void fun();
}
class D implements O{ //Multiple inheritance in Java
    public void fun(){
        System.out.println("Hello, I am a function in D");
    }

}
public class Lecture12_AbstractClassAndINterfaces{
    public static void main(String[] args){
        C c = new C();
        c.fun();

        D d = new D();
        d.fun();
    }
}

// interface Shape{
//     double pi = 3.14;//public, static, final
//     double getSquare(double r); //Abstract and public
// }
// class Circle implements Shape{
//     public double getSquare(double r){
//         return r*r;
//     }
//     void fun(){
//         System.out.println("Hey, I implemented an interface named Shape");
//     }
// }
// public class Lecture12_AbstractClassAndINterfaces{
//     public static void main(String[] args){
//         Circle c = new Circle();
//         System.out.println(c.getSquare(5));
//         c.fun();
//     }
// }
