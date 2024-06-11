package basicsofjava;

//Find sum of digit of a given number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        for(int num = N; num > 0; num /= 10){
            int onesDigit = num % 10;
            ans += onesDigit;
        }
        System.out.println(ans);
    }
}
