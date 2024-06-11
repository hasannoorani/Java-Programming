//Find if a given number is a power of 2 or not

import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(; N % 2 == 0; N /= 2);

        if(N == 1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}