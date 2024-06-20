class Student{
    String name;
    int marks;
    boolean checkPass(){
        // if(marks>=40){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if(marks>=40) return true;
        return false;
    }
}

public class Lecture7_ControlFlow{

    int findMax(int x, int y, int z){
        if(x>y){ //nested if
            if(x>z){
                return x;
            }
            else{
                return z;
            }
        }
        else{
            if(y>z){
                return y;
            }
            else{
                return z;
            }
        }
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "John";
        s1.marks = 50;

        Student s2 = new Student();
        s2.name = "Alice";
        s2.marks = 30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        Lecture7_ControlFlow cf = new Lecture7_ControlFlow();
        System.out.println(cf.findMax(20, 40, 80));

        char c = 'b';

        switch(c){
            case 'a':
                System.out.println("Hi, I am A");
                break;
            case 'b':
            System.out.println("Hi, I am B");
            break;
            case 'c':
            System.out.println("Hi, I am C");
                break;
        }
}
}