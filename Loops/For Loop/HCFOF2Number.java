//WAP to find HCF of 2 numbers; a,b

import java.util.Scanner;

public class HCFOF2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min_num;
        if(a<b){
            min_num = a;
        } else{
            min_num = b;
        }
       // min_num = min(a,b);

        for(int i=min_num; i>=1; i--){
            if((a%i==0) && (b%i==0));
            System.out.println(i);
            break;
        }
    }
}
