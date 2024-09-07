import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of your array: ");

        //array size
        int n = sc.nextInt();

        //creating array
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
