//question:- Given a positive number find the number of digits in that number

import java.util.*;

class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        for(int num = N; num > 0; num /= 10)
            cnt += 1;

        System.out.println(cnt);
    }
}