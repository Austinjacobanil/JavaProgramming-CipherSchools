public class PassingArray {
    static void addOne(int x){
        x = x + 1;
    }
    static void addOne(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args){
        int x = 10;
        addOne(x);
        System.out.println(x); //prints 10

        int arr[] = {1, 2, 3, 4, 5};
        addOne(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); //prints updated array
        }
        System.out.println();
    }
}
