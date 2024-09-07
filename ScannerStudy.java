import java.util.Scanner;
public class ScannerStudy {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fname = sc.next(); // take input till a space occurs
        String lname = sc.next();
        System.out.print("Enter your profession: ");
        String profession = sc.next();
        System.out.print("Please enter your address: ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("Please enter your house number: ");
        int houseNumber = sc.nextInt();

        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House number: " + houseNumber);
    } 
}
