//Print first N numbers that have their sum of digits = K
//Given a value of N, print only those numbers from 1 to N that have sum of digits = K

import java.util.Scanner;

public class FirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){
            int sumOfDigits = 0;
            for(int num=i; num>0; num=num/10){
                sumOfDigits += num%10;
            }
            if(sumOfDigits==k){
                System.out.println(i);
            }
        }
    }
}
