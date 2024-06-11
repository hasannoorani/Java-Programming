// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        // Using Scanner for Getting Input from User
        // create an object of Scanner
        Scanner sc = new Scanner(System.in);
        
        /*  System.out.println("enter number");

            int num = sc.nextInt();

            System.out.println("your number is"+num);
        */

        System.out.println("Enter First Number:");

        int num_1 = sc.nextInt();

        System.out.println("Enter Second Number:");

        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;

        System.out.println("Sum is:"+sum);
        
    }
}