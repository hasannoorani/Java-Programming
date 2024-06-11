//print sum of digits for all the numbers in a given range [L,R]

import java.util.*;

class RangeOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        for(int N = L; N <= R; ++N) {
            // Find & print the sum of
            // digits of the number N
            int ans = 0;
            for(int num = N; num > 0; num /= 10) {
                int onesDigit = num % 10;
                ans += onesDigit;
            }
            System.out.println(ans);
        }
    }
}