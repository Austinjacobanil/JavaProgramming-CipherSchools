public class Array {
    static void print(int arr[]){
        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int size = 5;
        //Array creation expression
        int arr[] = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = i+1;
        }
        print(arr);
        
        //Array initializers list
        int arr2[] = {6,7,8};
        print(arr2);

        //If we want to increase the array size
        int copyArr[] = new int[2*size]; // Create an array with double size
        for(int i = 0; i < size; i++){
            copyArr[i] = arr[i]; //Copy all elements from array one
        }
        copyArr[5] = 6;
        copyArr[6] = 7;
        print(copyArr);
    }
    
}