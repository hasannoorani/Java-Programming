package basicsofjava;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum of Natural Number : " + n*(n+1)/2);
    }
}
