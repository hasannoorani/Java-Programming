//Inverted Right Pyramid

import java.util.Scanner;

public class InvertedRightPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //many approach:-
        
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1; i<=n; i++){
                for(int j=n; j>=i; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

}
