
import java.util.Scanner;

import static java.lang.Math.max;

public class LCMof2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max;
        for(int i = max(a,b); i<=a*b; i++){
            if((a%i==0) && (b%i==0));
            System.out.println(i);
            break;
        }
    }
}
