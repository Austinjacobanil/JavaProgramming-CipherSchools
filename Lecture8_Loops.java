public class Lecture8_Loops {
    public static void main(String[] args){
        //FOR LOOP
        int i;
        for(i=1; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("i after loop = "+ i);

        //WHILE LOOP

        int n = 5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("After the loop n = "+ n);
        //DO-WHILE
        int m = 5;
        do{
            System.out.println(m);
            m--;
        }while(m>0);

        //WHILE LOOP

        int p = 0;
        while(n>0){
            System.out.println("Hello");
            p--;
        }
        System.out.println("After the loop n = "+ p);
        //DO-WHILE
        int q = 0;
        do{
            System.out.println(m);
            q--;
        }while(q>0);
    }
}
