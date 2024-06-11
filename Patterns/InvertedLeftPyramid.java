//Inverted Left Pyramid Pattern

import java.util.Scanner;

public class InvertedLeftPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print leading spaces or first inner loop
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print second inner loop
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}