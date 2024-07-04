// METHOD OVERRIDDING

class Parent{
    void fun(){
    System.out.println("Hello I am A");
}
}
class Child extends Parent{
    void fun(){
        System.out.println("Hello I am B");
    }
}
public class Lecture9_Pt2_Polymorphoism {
    public static void main(String[] args){
        Child c = new Child();
        c.fun(); 
    }
}


//METHOD OVERLOADING

// class demo{
//     void fun(){
//         System.out.println("I have no parameters");
//     }
//     void fun(int a){
//         System.out.println("I have one parameter a: "+ a);
//     }
//     void fun(int a, int b){
//         System.out.println("I have two parameters a and b: "+ b + " , " + a);
//     }
//     void fun(String s){
//         System.out.println("I have a string s: "+ s);
//     }
   
// }
// public class Lecture9_Pt2_Polymorphoism{
//     public static  void main(String[] args){
//         demo obj = new demo();
//         obj.fun();
//         obj.fun(2);
//         obj.fun(3, 9);
//         obj.fun("Hello");
//     }
// }