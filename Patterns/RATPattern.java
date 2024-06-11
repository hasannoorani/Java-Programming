// Right-Angled Triangle Pattern

import java.util.Scanner;

public class RATPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Yeh outer loop hai jo 1 se n tak chalta hai
            for (int j = 1; j <= i; j++) { // Yeh inner loop hai jo 1 se i tak chalta hai
                System.out.print("* "); // Yeh har iteration mein ek star print karta hai
            }
            System.out.println(); // Yeh ek newline character print karta hai, taake nayi line shuru ho jaye
        }
    }
}
